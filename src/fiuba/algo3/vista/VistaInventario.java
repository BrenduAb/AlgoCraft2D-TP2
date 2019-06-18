package fiuba.algo3.vista;

import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Mapa.Celda;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VistaInventario extends Stage {

    GridPane gridPane;

    private int ancho = 12;
    private int alto = 8;

    public VistaInventario(Stage parent){
        gridPane = new GridPane();
        gridPane.setHgap(2);
        gridPane.setVgap(2);
        gridPane.setStyle("-fx-background-color: grey;");
        this.initOwner(parent);
        this.initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(gridPane, 640, 480);
        this.setScene(scene);

    }
    public void mostrar(){
        Mapa mapa = Mapa.getInstance();

        for (int y = 0 ; y < alto ; y++) {
            for (int x = 0 ; x < ancho; x++) {
                Celda ocupable = mapa.obtenerCelda(new Posicion(x,y));
                IOcupable elemento = ocupable.obtenerElemento();
                Image imagen = new Image("file:src/fiuba/algo3/vista/imagenes/pasto.png");
                if (elemento != null){
                    String ruta = "file:src/fiuba/algo3/vista/imagenes/" + elemento.getClass().getName() + ".png";
                    imagen = new Image(ruta);
                }
                ImageView imageView = new ImageView(imagen);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
                gridPane.add(imageView, x, y);
            }
        }


        this.showAndWait();
    }
}
