package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Juego;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import junit.framework.Assert;
import org.junit.Test;

public class TestJuego {
    @Test
    public void juegoSeIniciaConUnJugadorEnLaPosicion7x7y() {
        CleanSingleton.cleanMapa();

        Juego juego = new Juego();

        Jugador jugador = juego.obtenerJugador();

        Assert.assertEquals(new Posicion(7, 7), jugador.obtenerPosicionActual());
    }

    @Test
    public void verificoQueEnLaPosicionx1y1EstaOcupado() {
        CleanSingleton.cleanMapa();
        Mapa mapa = Mapa.getInstance();
        Juego juego = new Juego();
        Posicion posicion = new Posicion(1, 1);
        IOcupable metal = mapa.obtenerCelda(posicion).obtenerElemento();
        Assert.assertEquals(true, metal != null);
    }
}
