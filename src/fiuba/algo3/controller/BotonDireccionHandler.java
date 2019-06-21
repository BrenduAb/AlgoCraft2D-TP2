package fiuba.algo3.controller;

import fiuba.algo3.model.Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonDireccionHandler implements EventHandler<ActionEvent> {

    private final fiuba.algo3.model.Jugador.Jugador Jugador;

    public BotonDireccionHandler(Jugador Jugador) {
        this.Jugador = Jugador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
