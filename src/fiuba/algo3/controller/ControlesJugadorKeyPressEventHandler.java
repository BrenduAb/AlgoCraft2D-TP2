package fiuba.algo3.controller;

import fiuba.algo3.Excepciones.CeldaOcupadaException;
import fiuba.algo3.Excepciones.HerramientaRotaException;
import fiuba.algo3.Excepciones.JugarSinHerramientaEquipadaException;
import fiuba.algo3.Excepciones.PosicionInvalidaException;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;
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
        Posicion pos = null;
        try {
            switch (event.getCode()) {
                case W:
                    pos = jugador.obtenerPosicionActual().posicionSiguienteArriba();
                    jugador.moverHaciArriba();
                    break;
                case S:
                    pos = jugador.obtenerPosicionActual().posicionSiguienteAbajo();
                    jugador.moverHaciAbajo();
                    break;
                case D:
                    pos = jugador.obtenerPosicionActual().posicionSiguienteDerecha();
                    jugador.moverHaciaLaDerecha();
                    break;
                case A:
                    pos = jugador.obtenerPosicionActual().posicionSiguienteIzquierda();
                    jugador.moverHaciaLaIzquierda();
                    break;
            }
        } catch (CeldaOcupadaException ex) {
            try {
                Mapa mapa = Mapa.getInstance();
                Material material = (Material) mapa.obtenerCelda(pos).obtenerElemento();
                mapa.chocarJugadorConMaterial(jugador, material);
            } catch (HerramientaRotaException ex2) {

            }catch (JugarSinHerramientaEquipadaException ex3){

            }
        } catch (PosicionInvalidaException ex) {

        }
        vistaJugador.update();
    }
}
