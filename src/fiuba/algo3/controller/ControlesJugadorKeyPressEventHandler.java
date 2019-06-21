package fiuba.algo3.controller;

import fiuba.algo3.Excepciones.CeldaOcupadaException;
import fiuba.algo3.Excepciones.PosicionInvalidaException;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.vista.VistaJugador;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class ControlesJugadorKeyPressEventHandler implements EventHandler<KeyEvent> {
    VistaJugador vistaJugador;
    Jugador jugador;

    public ControlesJugadorKeyPressEventHandler(VistaJugador vistaJugador, Jugador jugador) {
        this.vistaJugador = vistaJugador;
        this.jugador = jugador;
    }

    @Override
    public void handle(KeyEvent event) {
        try {
            switch (event.getCode()) {
                case W:
                    jugador.moverHaciArriba();
                    break;
                case S:
                    jugador.moverHaciAbajo();
                    break;
                case D:
                    jugador.moverHaciaLaDerecha();
                    break;
                case A:
                    jugador.moverHaciaLaIzquierda();
                    break;
            }
        } catch (
                CeldaOcupadaException ex) {

        } catch (
                PosicionInvalidaException ex) {
        }
        vistaJugador.update();
    }
}
