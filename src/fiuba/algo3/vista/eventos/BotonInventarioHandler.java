package fiuba.algo3.vista.eventos;

import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonInventarioHandler implements EventHandler<ActionEvent> {

    private final VistaInventario vista;
    private final Jugador Jugador;

    public BotonInventarioHandler(VistaInventario vista, fiuba.algo3.model.Jugador.Jugador Jugador) {
        this.vista = vista;
        this.Jugador = Jugador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}