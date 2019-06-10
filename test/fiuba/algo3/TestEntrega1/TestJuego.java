package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Juego;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Posicion;
import junit.framework.Assert;
import org.junit.Test;

public class TestJuego {
    @Test
    public void juegoSeIniciaConUnJugadorEnLaPosicion3x3y() {
        Juego juego = new Juego();

        Jugador jugador = juego.obtenerJugador();

        Assert.assertEquals(new Posicion(3, 3), jugador.obtenerPosicionActual());
    }
}
