package fiuba.algo3.vista.eventos;

import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Celda;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BotonInventarioHandler implements EventHandler<ActionEvent> {

    private final VistaInventario vista;
    private final Jugador Jugador;
    private final Stage parent;

    public BotonInventarioHandler(VistaInventario vista,
                                  fiuba.algo3.model.Jugador.Jugador Jugador,
                                  Stage parent) {
        this.vista = vista;
        this.Jugador = Jugador;
        this.parent = parent;
    }
    private int ancho = 12;
    private int alto = 8;
    @Override
    public void handle(ActionEvent actionEvent) {
        Stage dialog = new Stage();
        GridPane gridPane = new GridPane();
        gridPane.setHgap(2);
        gridPane.setVgap(2);
        gridPane.setStyle("-fx-background-color: grey;");


        dialog.initOwner(parent);
        dialog.initModality(Modality.APPLICATION_MODAL);
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

        Scene scene = new Scene(gridPane, 640, 480);
        dialog.setScene(scene);
        dialog.showAndWait();
    }
}
