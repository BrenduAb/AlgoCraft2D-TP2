package fiuba.algo3.vista;

import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Jugador.Inventario;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VistaInventario extends Stage {

    GridPane grillaInventario;
    VBox contenedorMesaCrafteo;
    BarraDeMenu menuBar;


    public VistaInventario(Stage parent){
        this.initOwner(parent);
        this.initModality(Modality.APPLICATION_MODAL);
    }
    public void mostrar(Inventario inventario){

        this.setMesaCrafteo();

        this.setInventario(inventario);

        this.showAndWait();
    }

    public void setInventario(Inventario inventario){
        this.grillaInventario = new GridPane();
        grillaInventario.setHgap(2);
        grillaInventario.setVgap(2);
        grillaInventario.setStyle("-fx-background-color: whitesmoke;");
        grillaInventario.setAlignment(Pos.BOTTOM_CENTER);
        Scene scene = new Scene(grillaInventario, 640, 480);
        this.setScene(scene);
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
                    if(guardable.getClass().getPackageName() == "fiuba.algo3.model.Herramientas"){
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
    }

    //Estuve queriendo agregar la mesa de crafteo en la misma ventana que en el inventario pero no me salio
    public void setMesaCrafteo(){

        VBox contenedorVertical = new VBox();
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));
        contenedorVertical.setAlignment(Pos.TOP_CENTER);
        contenedorVertical.setStyle("-fx-background-color: black;");
    }
}
