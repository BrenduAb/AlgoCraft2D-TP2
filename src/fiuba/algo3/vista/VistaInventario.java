package fiuba.algo3.vista;

import fiuba.algo3.controller.*;
import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.MesaDeCrafteo.CrafteadorHerramientas;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
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
    Jugador jugador;
    MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo(new CrafteadorHerramientas());

    BotoneraInventarioViewModel botonera = new BotoneraInventarioViewModel();


    public VistaInventario(Stage parent, Jugador jugador) {
        this.setTitle("Inventario");
        this.initOwner(parent);
        this.initModality(Modality.APPLICATION_MODAL);
        this.contenedorInventario = new GridPane();
        this.contenedorCrafteo = new GridPane();
        this.jugador = jugador;
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
        this.setBotonera(jugador);
        scene = new Scene(borderPane, 640, 480);

    }

    public void mostrar(Inventario inventario) {
        this.actualizar(inventario);
        this.setScene(scene);
        this.showAndWait();
    }

    private void setBotonera(Jugador jugador) {

        String path = "file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png";

        Herramienta herramienta = jugador.obtenerHerramientaEquipada();
        if (herramienta != null) {
            path = "file:src/fiuba/algo3/vista/imagenes/" + herramienta.getClass().getName() +
                    herramienta.obtenerFuerza() + ".png";
        }


        this.botonera.botonEquipar = new Button();
        this.botonera.botonEquipar.setText("Equipar");
        this.botonera.botonEquipar.setDisable(true);

        this.botonera.botonPonerEn = new Button();
        this.botonera.botonPonerEn.setText("Poner en la mesa:");
        this.botonera.botonPonerEn.setDisable(true);

        this.botonera.construirCrafteo = new Button();
        this.botonera.construirCrafteo.setText("Construir Herramienta");
        this.botonera.construirCrafteo.setOnAction(new ConstruirHerramientaEventHandler(this, this.mesaDeCrafteo, this.jugador));


        this.botonera.imagenHerramientaEquipada = new ImageView();
        Image imagen = new Image(path);

        this.botonera.imagenHerramientaEquipada.setImage(imagen);
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

    public void actualizar(Inventario inventario) {

        //this.contenedorInventario.add(this.dibujarMesaCrafteo(inventario), 0, 1);
        this.dibujarInventario(inventario);
        this.dibujarMesaCrafteo();
        String path = "file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png";

        Herramienta herramienta = jugador.obtenerHerramientaEquipada();
        if (herramienta != null) {
            path = "file:src/fiuba/algo3/vista/imagenes/" + herramienta.getClass().getName() +
                    herramienta.obtenerFuerza() + ".png";
        }
        Image imagen = new Image(path);

        this.botonera.imagenHerramientaEquipada.setImage(imagen);
        this.botonera.imagenHerramientaEquipada.setFitWidth(32);
        this.botonera.imagenHerramientaEquipada.setFitHeight(32);

    }

    public void dibujarInventario(Inventario inventario) {
        int alto = 3;
        int ancho = 10;
        int index = 0;

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                IGuardable guardable = null;
                ImageView imageView = new ImageView();
                if (index < inventario.obtenerCantidadDeObjetos()) {
                    guardable = inventario.obtenerGuardable(index);
                    index++;
                }
                Image imagen = new Image("file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png");
                if (guardable != null) {
                    if (guardable instanceof Herramienta) {
                        Herramienta herramienta = (Herramienta) guardable;
                        String ruta = "file:src/fiuba/algo3/vista/imagenes/" + guardable.getClass().getName() +
                                herramienta.obtenerFuerza() + ".png";
                        ClickHerramientaEventHandler handler = new ClickHerramientaEventHandler(jugador,
                                botonera,
                                herramienta,
                                this);
                        imageView.setOnMouseClicked(handler);
                        imagen = new Image(ruta);
                    } else {
                        Material material = (Material) guardable;
                        String ruta = "file:src/fiuba/algo3/vista/imagenes/" + material.getClass().getName() + ".png";
                        ClickMaterialInventarioEventHandler handler = new ClickMaterialInventarioEventHandler(inventario,
                                material,
                                mesaDeCrafteo,
                                this, botonera, borderPane);
                        imageView.setOnMouseClicked(handler);
                        imagen = new Image(ruta);
                    }
                }

                imageView.setImage(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);

                contenedorInventario.add(imageView, x, y);

            }
        }
    }

    //Estuve queriendo agregar la mesa de crafteo en la misma ventana que en el inventario pero no me salio
    public void dibujarMesaCrafteo() {

        int alto = 3;
        int ancho = 3;

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                Posicion posicion = new Posicion(x, y);
                Material material = this.mesaDeCrafteo.obtenerMaterial(posicion);
                String ruta = "file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png";
                ImageView imageView = new ImageView();

                if (material != null) {
                    ruta = "file:src/fiuba/algo3/vista/imagenes/" + material.getClass().getName() + ".png";
                    ClickMaterialMesaEventHandler handler;
                    handler = new ClickMaterialMesaEventHandler(this.jugador.obtenerInventario(),
                            material,
                            mesaDeCrafteo,
                            this,
                            posicion);
                    imageView.setOnMouseClicked(handler);
                }else{
                    ClickNadaMesaSetPosicionEventHandler handler;
                    handler = new ClickNadaMesaSetPosicionEventHandler(
                            botonera,
                            this,
                            posicion);
                    imageView.setOnMouseClicked(handler);
                }
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

    public void limpiarMensajeError() {
        botonera.mensajeError.setText("");
    }
}
