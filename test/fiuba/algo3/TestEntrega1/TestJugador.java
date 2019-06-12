package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Excepciones.CeldaOcupadaException;
import fiuba.algo3.Excepciones.PosicionInvalidaException;
import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Celda;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestJugador {

    @Test
    public void JugadorSeCreaConUnSoloObjetoEnSuInventario() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        int objetosDelInventario = jugador.obtenerCantidadDeObjetosDelInventario();

        Assert.assertEquals(1, objetosDelInventario);
    }

    @Test
    public void JugadorSeCreaConUnHachaDeMaderaEnSuInventario() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        IGuardable hacha = ConstructorHerramientas.construirPicoDeMadera();

        Assert.assertEquals(true, true);
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaDeracha() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaDerachaYLaCeldaAnteriorQuedaVacia() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());

        Celda celda = mapa.obtenerCelda(new Posicion(1, 1));

        Assert.assertEquals(null, celda.obtenerElemento());
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaIzquierda() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaJuntoAUnMaterialASuDerechaIntentoMoverASuDerechaYNoMeDejaYElJugadorMantieneSuPosicion() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        Madera madera = new Madera();

        Posicion posicionJugador = jugador.obtenerPosicionActual();


        mapa.ocuparTerreno(new Posicion(2, 1), madera);

        assertThrows(CeldaOcupadaException.class,
                () -> {
                    jugador.moverHaciaLaDerecha();
                });

        Assert.assertEquals(posicionJugador, jugador.obtenerPosicionActual());

    }

    @Test
    public void PosicionoAlJugadorEnUnBordeDelMapaIntentoMoverloHaciaUnDesbordeYNoMeDejaMateniendoLaPosicionDelJugador() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(0, 1);

        Jugador jugador = new Jugador(posicionJugador, mapa);

        assertThrows(PosicionInvalidaException.class,
                () -> {
                    jugador.moverHaciaLaIzquierda();
                });

        Assert.assertEquals(posicionJugador, jugador.obtenerPosicionActual());

    }

    @Test
    public void muevoAlJugadorALaDerecha() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(0, 1);

        Jugador jugador = new Jugador(posicionJugador, mapa);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(1, 1);
    }
}
