package fiuba.algo3.vista;

import fiuba.algo3.controller.ClickHerramientaEventHandler;
import fiuba.algo3.controller.ClickMaterialInventarioEventHandler;
import fiuba.algo3.controller.ClickMaterialMesaEventHandler;
import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.MesaDeCrafteo.CrafteadorHerramientas;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    VBox contenedorMesaCrafteo;
    BarraDeMenu menuBar;
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
        contenedorInventario.setStyle("-fx-background-color: grey;");

        contenedorCrafteo.setHgap(2);
        contenedorCrafteo.setVgap(2);
        contenedorCrafteo.setStyle("-fx-background-color: grey;");

        VBox contenedorMedio = new VBox(new Label("Inventario"), this.contenedorInventario,
                new Label("Mesa Crafteo"),
                this.contenedorCrafteo);
        contenedorMedio.setSpacing(10);
        borderPane.setCenter(contenedorMedio);
        this.setBotonera(jugador);
        scene = new Scene(borderPane, 640, 480);

        //TODO SACAR ESTO
        this.mesaDeCrafteo.agregarMaterial(new Posicion(1, 1), new Madera());
    }

    public void mostrar(Inventario inventario) {
        this.actualizar(inventario);
        this.setScene(scene);
        this.showAndWait();
    }

    private void setBotonera(Jugador jugador) {

        String path = "file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png";
        //TODO SACAR
        jugador.obtenerInventario().agregarAlInventario(ConstructorHerramientas.construirPicoDePiedra());


        Herramienta herramienta = jugador.obtenerHerramientaEquipada();
        if (herramienta != null) {
            path = "file:src/fiuba/algo3/vista/imagenes/" + herramienta.getClass().getName() +
                    herramienta.obtenerFuerza() + ".png";
        }


        this.botonera.botonEquipar = new Button();
        this.botonera.botonEquipar.setText("Equipar");
        this.botonera.botonEquipar.setDisable(true);

        this.botonera.botonDireccion = new Button();
        this.botonera.botonDireccion.setText("Poner en");


        this.botonera.imagenHerramientaEquipada = new ImageView();
        Image imagen = new Image(path);

        this.botonera.imagenHerramientaEquipada.setImage(imagen);
        this.botonera.imagenHerramientaEquipada.setFitWidth(32);
        this.botonera.imagenHerramientaEquipada.setFitHeight(32);

        VBox contenedorVertical = new VBox(this.botonera.imagenHerramientaEquipada, this.botonera.botonEquipar, this.botonera.botonDireccion);
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
        int posicion = 0;

        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                IGuardable guardable = null;
                ImageView imageView = new ImageView();
                if (posicion < inventario.obtenerCantidadDeObjetos()) {
                    guardable = inventario.obtenerGuardable(posicion);
                    posicion++;
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
                        String ruta = "file:src/fiuba/algo3/vista/imagenes/" + guardable.getClass().getName() + ".png";
                        ClickMaterialInventarioEventHandler handler = new ClickMaterialInventarioEventHandler(inventario, guardable, this);
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
                }
                Image imagen = new Image(ruta);
                imageView.setImage(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
                contenedorCrafteo.add(imageView, x, y);

            }
        }
    }
}
