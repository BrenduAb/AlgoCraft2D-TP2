package fiuba.algo3.vista;

import fiuba.algo3.controller.*;
import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Juego;
import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VistaInventario extends Stage {

    GridPane contenedorInventario;
    GridPane contenedorCrafteo;
    Scene scene;
    BorderPane borderPane;
    Juego juego;

    BotoneraInventarioViewModel botonera = new BotoneraInventarioViewModel();


    public VistaInventario(Stage parent, Juego juego) {
        this.setTitle("Inventario");
        this.initOwner(parent);
        this.initModality(Modality.APPLICATION_MODAL);
        this.contenedorInventario = new GridPane();
        this.contenedorCrafteo = new GridPane();
        this.juego = juego;
        this.borderPane = new BorderPane();


        contenedorInventario.setHgap(2);
        contenedorInventario.setVgap(2);

        contenedorCrafteo.setHgap(2);
        contenedorCrafteo.setVgap(2);

        VBox contenedorMedio = new VBox(new Label("Inventario"), this.contenedorInventario,
                new Label("Mesa Crafteo"),
                this.contenedorCrafteo);
        contenedorMedio.setSpacing(10);
        borderPane.setCenter(contenedorMedio);
        this.setBotonera();
        scene = new Scene(borderPane, 640, 480);

    }

    public void mostrar() {
        this.actualizar();
        this.setScene(scene);
        this.showAndWait();
    }

    public void actualizar() {

        this.dibujarInventario();
        this.dibujarMesaCrafteo();
        String path = "file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png";

        Herramienta herramienta = this.juego.obtenerJugador().obtenerHerramientaEquipada();
        if (herramienta != null) {
            path = "file:src/fiuba/algo3/vista/imagenes/" + herramienta.getClass().getName() +
                    herramienta.obtenerFuerza() + ".png";
        }
        Image imagen = new Image(path);

        this.botonera.imagenHerramientaEquipada.setImage(imagen);
        this.botonera.imagenHerramientaEquipada.setFitWidth(32);
        this.botonera.imagenHerramientaEquipada.setFitHeight(32);

    }

    private void setBotonera() {

        String path = "file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png";

        Herramienta herramienta = this.juego.obtenerJugador().obtenerHerramientaEquipada();
        if (herramienta != null) {
            path = "file:src/fiuba/algo3/vista/imagenes/" + herramienta.getClass().getName() +
                    herramienta.obtenerFuerza() + ".png";
        }


        this.botonera.botonEquipar = new Button("Equipar");
        this.botonera.botonEquipar.setDisable(true);

        this.botonera.botonPonerEn = new Button("Poner en la mesa:");
        this.botonera.botonPonerEn.setDisable(true);

        this.botonera.construirCrafteo = new Button("Construir Herramienta");
        this.botonera.construirCrafteo.setOnAction(new BotonConstruirHerramientaEventHandler(this));


        Image imagen = new Image(path);
        this.botonera.imagenHerramientaEquipada = new ImageView(imagen);
        this.botonera.imagenHerramientaEquipada.setFitWidth(32);
        this.botonera.imagenHerramientaEquipada.setFitHeight(32);


        botonera.filaPonerMesa = new ChoiceBox();
        botonera.filaPonerMesa.setItems(FXCollections.observableArrayList(1, 2, 3));
        botonera.columnaPonerMesa = new ChoiceBox();
        botonera.columnaPonerMesa.setItems(FXCollections.observableArrayList(1, 2, 3));

        botonera.filaPonerMesa.setValue(1);
        botonera.columnaPonerMesa.setValue(1);

        botonera.mensajeError = new Label("");
        botonera.mensajeError.setStyle("-fx-color: red");

        VBox contenedorVertical = new VBox(new Label("Herramienta Equipada"), this.botonera.imagenHerramientaEquipada,
                this.botonera.botonEquipar, this.botonera.botonPonerEn,
                new Label("Fila: "), botonera.filaPonerMesa,
                new Label("Columna: "), botonera.columnaPonerMesa,
                botonera.construirCrafteo,
                botonera.mensajeError);

        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));
        borderPane.setLeft(contenedorVertical);
    }

    public void dibujarInventario() {
        int alto = 3;
        int ancho = 10;
        int index = 0;

        Inventario inventario = this.juego.obtenerJugador().obtenerInventario();
        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                IGuardable guardable = null;
                if (index < inventario.obtenerCantidadDeObjetos()) {
                    guardable = inventario.obtenerGuardable(index);
                    index++;
                }
                Image imagen = new Image("file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png");
                ImageView imageView = new ImageView();
                if (guardable != null) {
                    String ruta = this.asignarImagenAGuardableDelInventario(guardable, imageView);
                    imagen = new Image(ruta);
                }
                imageView.setImage(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);

                contenedorInventario.add(imageView, x, y);

            }
        }
    }

    public void dibujarMesaCrafteo() {

        int alto = 3;
        int ancho = 3;

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                Posicion posicion = new Posicion(x, y);
                String ruta = "file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png";
                ImageView imageView = new ImageView();
                ruta = this.asignarImagenAMaterialDeMesaDeCarfteo(imageView, posicion, ruta);
                Image imagen = new Image(ruta);
                imageView.setImage(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
                contenedorCrafteo.add(imageView, x, y);
            }
        }
    }

    public void ponerMensajeError(String s) {
        botonera.mensajeError.setText(s);
    }


    public Juego obtenerJuego(){
        return this.juego;
    }

    private String asignarImagenAGuardableDelInventario(IGuardable guardable, ImageView imageView){
        String ruta;
        if (guardable instanceof Herramienta) {
            Herramienta herramienta = (Herramienta) guardable;
            ruta = "file:src/fiuba/algo3/vista/imagenes/" + guardable.getClass().getName() +
                    herramienta.obtenerFuerza() + ".png";
            ClickHerramientaEventHandler handler = new ClickHerramientaEventHandler(botonera, herramienta,
                    this);
            imageView.setOnMouseClicked(handler);
        } else {
            Material material = (Material) guardable;
            ruta = "file:src/fiuba/algo3/vista/imagenes/" + material.getClass().getName() + ".png";
            ClickMaterialInventarioEventHandler handler = new ClickMaterialInventarioEventHandler(botonera,
                    material, this);
            imageView.setOnMouseClicked(handler);
        }
        return ruta;
    }

    private String asignarImagenAMaterialDeMesaDeCarfteo(ImageView imageView, Posicion posicion, String ruta){
        Material material = this.juego.obtenerMesaDeCrafteo().obtenerMaterial(posicion);
        if (material != null) {
            ruta = "file:src/fiuba/algo3/vista/imagenes/" + material.getClass().getName() + ".png";
            ClickMaterialMesaEventHandler handler;
            handler = new ClickMaterialMesaEventHandler(material, posicion, this);
            imageView.setOnMouseClicked(handler);
        }else{
            ClickNadaMesaSetPosicionEventHandler handler;
            handler = new ClickNadaMesaSetPosicionEventHandler(botonera, posicion, this);
            imageView.setOnMouseClicked(handler);
        }
        return ruta;
    }
}
