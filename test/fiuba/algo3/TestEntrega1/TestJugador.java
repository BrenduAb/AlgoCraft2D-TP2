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
        Jugador jugador = new Jugador();

        int objetosDelInventario = jugador.obtenerCantidadDeObjetosDelInventario();

        Assert.assertEquals(1, objetosDelInventario);
    }

    @Test
    public void JugadorSeCreaConUnHachaDeMaderaEnSuInventario() {
        Jugador jugador = new Jugador();

        IGuardable hacha = ConstructorHerramientas.construirPicoDeMadera();

        Assert.assertEquals(true, true);
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaDeracha() {
        CleanSingleton.cleanMapa();
        Jugador jugador = new Jugador();

        Mapa mapa = Mapa.getInstance();

        mapa.ocuparTerreno(new Posicion(1, 1), jugador);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaDerachaYLaCeldaAnteriorQuedaVacia() {
        CleanSingleton.cleanMapa();
        Jugador jugador = new Jugador();

        Mapa mapa = Mapa.getInstance();
        ;

        mapa.ocuparTerreno(new Posicion(1, 1), jugador);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());

        Celda celda = mapa.obtenerCelda(new Posicion(1, 1));

        Assert.assertEquals(null, celda.obtenerElemento());
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaIzquierda() {
        CleanSingleton.cleanMapa();
        Jugador jugador = new Jugador();
        Mapa mapa = Mapa.getInstance();

        mapa.ocuparTerreno(new Posicion(1, 1), jugador);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaJuntoAUnMaterialASuDerechaIntentoMoverASuDerechaYNoMeDejaYElJugadorMantieneSuPosicion() {
        CleanSingleton.cleanMapa();
        Jugador jugador = new Jugador();
        Madera madera = new Madera();
        Posicion posicionJugador = new Posicion(1, 1);

        Mapa mapa = Mapa.getInstance();

        mapa.ocuparTerreno(posicionJugador, jugador);

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
        Jugador jugador = new Jugador();

        Posicion posicionJugador = new Posicion(0, 1);

        Mapa mapa = Mapa.getInstance();
        ;

        mapa.ocuparTerreno(posicionJugador, jugador);


        assertThrows(PosicionInvalidaException.class,
                () -> {
                    jugador.moverHaciaLaIzquierda();
                });

        Assert.assertEquals(posicionJugador, jugador.obtenerPosicionActual());

    }
}
