package fiuba.algo3.vista;

import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Celda;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class VistaJugador {

    private fiuba.algo3.model.Jugador.Jugador Jugador;
    GridPane gridPane;

    private int ancho = 12;
    private int alto = 8;

    public VistaJugador(Jugador Jugador, GridPane grid) {
        this.Jugador = Jugador;
        this.gridPane = grid;
        gridPane.setHgap(2);
        gridPane.setVgap(2);
        gridPane.setStyle("-fx-background-color: grey;");
    }

    public void dibujar() {
        this.dibujarFormas();
    }

    private void dibujarFormas() {
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
    }
    private Image createImage(Color color) {
        WritableImage image = new WritableImage(1, 1);
        image.getPixelWriter().setColor(0, 0, color);
        return image ;
    }


    public void update() {
        this.dibujar();
    }

}
