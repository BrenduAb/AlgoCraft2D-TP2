package fiuba.algo3.vista;

import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Jugador.Inventario;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VistaInventario extends Stage {

    GridPane contenedorInventario;


    public VistaInventario(Stage parent){
        this.setTitle("Inventario");
        this.initOwner(parent);
        this.initModality(Modality.APPLICATION_MODAL);
    }
    public void mostrar(Inventario inventario){

        this.armarContenedorInventario(inventario);
        Scene scene = new Scene(this.contenedorInventario, 640, 480);
        this.setScene(scene);
        this.showAndWait();
    }

    public void armarContenedorInventario(Inventario inventario) {
        this.contenedorInventario = new GridPane();
        contenedorInventario.setHgap(3);
        contenedorInventario.setVgap(3);
        contenedorInventario.setStyle("-fx-background-color: grey;");
        this.contenedorInventario.add(this.dibujarMesaCrafteo(inventario), 0, 1);
        this.contenedorInventario.add(this.dibujarInventario(inventario), 0, 3);
        Button botonCraftear = new Button();
        botonCraftear.setText("Craftear");
        botonCraftear.setAlignment(Pos.TOP_CENTER);
        this.contenedorInventario.add(botonCraftear, 0, 2);
    }

    public VBox dibujarInventario(Inventario inventario){
        GridPane grillaInventario = new GridPane();
        grillaInventario.setHgap(1);
        grillaInventario.setVgap(1);
        grillaInventario.setAlignment(Pos.BOTTOM_CENTER);
        int alto = 3;
        int ancho = 10;
        int posicion = 0;

        for (int y = 0 ; y < alto ; y++) {
            for (int x = 0 ; x < ancho; x++) {
                IGuardable guardable = null;
                if (posicion < inventario.obtenerCantidadDeObjetos()){
                    guardable = inventario.obtenerGuardable(posicion);
                    posicion++;
                }
                Image imagen = new Image("file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png");
                if (guardable != null){
                    if(guardable.getClass().getPackage().getName() == "fiuba.algo3.model.Herramientas"){
                        Herramienta herramienta = (Herramienta)guardable;
                        String ruta = "file:src/fiuba/algo3/vista/imagenes/" + guardable.getClass().getName() +
                                herramienta.obtenerFuerza() + ".png";
                        imagen = new Image(ruta);
                    }
                    else {
                        String ruta = "file:src/fiuba/algo3/vista/imagenes/" + guardable.getClass() + ".png";
                        imagen = new Image(ruta);
                    }
                }
                ImageView imageView = new ImageView(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
                grillaInventario.add(imageView, x, y);

            }
        }
        VBox contenedorVertical = new VBox(grillaInventario);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));
        return contenedorVertical;
    }

    //Estuve queriendo agregar la mesa de crafteo en la misma ventana que en el inventario pero no me salio
    public VBox dibujarMesaCrafteo(Inventario inventario){
        GridPane grillaMesaDeCrafteo = new GridPane();
        grillaMesaDeCrafteo.setHgap(1);
        grillaMesaDeCrafteo.setVgap(1);
        grillaMesaDeCrafteo.setAlignment(Pos.TOP_CENTER);
        int alto = 3;
        int ancho = 3;

        for (int y = 0 ; y < alto ; y++) {
            for (int x = 0 ; x < ancho; x++) {
                Image imagen = new Image("file:src/fiuba/algo3/vista/imagenes/inventarioVacio.png");
                ImageView imageView = new ImageView(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
                grillaMesaDeCrafteo.add(imageView, x, y);

            }
        }
        VBox contenedorVertical = new VBox(grillaMesaDeCrafteo);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));
        return contenedorVertical;
    }
}
