package fiuba.algo3.vista;

import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.controller.BotonInventarioHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {

    BarraDeMenu menuBar;
    VistaJugador vistaJugador;
    VistaInventario vistaInventario;
    GridPane gridPane;
    VBox contenedorCentral;

    Stage stage;

    public ContenedorPrincipal(Stage stage, Jugador Jugador) {
        this.setControles(stage, Jugador);
        this.setMenu(stage);
        this.setCentro(Jugador);
        this.setConsola();
        this.setBotonera(Jugador);
        this.stage = stage;
    }

    private void setControles(Stage stage, Jugador jugador) {

    }

    private void setBotonera(Jugador Jugador) {

        Button botonMostrarInventario = new Button();
        botonMostrarInventario.setText("Mostrar inventario");
        this.vistaInventario = new VistaInventario(stage,Jugador);
        BotonInventarioHandler moveButtonHandler = new BotonInventarioHandler(vistaInventario, Jugador);
        botonMostrarInventario.setOnAction(moveButtonHandler);

        VBox contenedorVertical = new VBox(botonMostrarInventario);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    private void setCentro(Jugador Jugador) {
        this.gridPane = new GridPane();

        vistaJugador = new VistaJugador(Jugador, gridPane);
        vistaJugador.dibujar();

        contenedorCentral = new VBox(gridPane);
        contenedorCentral.setAlignment(Pos.CENTER);
        contenedorCentral.setSpacing(20);
        contenedorCentral.setPadding(new Insets(25));

        this.setCenter(contenedorCentral);
    }

    private void setConsola() {

        // TODO cambiar por el modelo de Consola...
        Label etiqueta = new Label();
        etiqueta.setText("Hola!... me llamo Manu. ¡Vamos a jugar!");
        etiqueta.setFont(Font.font("courier new", FontWeight.SEMI_BOLD, 14));
        etiqueta.setTextFill(Color.WHITE);

        VBox contenedorConsola = new VBox(etiqueta);
        contenedorConsola.setSpacing(10);
        contenedorConsola.setPadding(new Insets(15));
        contenedorConsola.setStyle("-fx-background-color: black;");

        this.setBottom(contenedorConsola);
    }

    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }

    public VistaJugador obtenerVistaJugador() {
        return this.vistaJugador;
    }

}
