package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Excepciones.CeldaOcupadaException;
import fiuba.algo3.Excepciones.PosicionInvalidaException;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import org.junit.Assert;
import org.junit.Test;

public class TestMapa {

    @Test(expected = PosicionInvalidaException.class)
    public void pongoElJugadorEnElMapaEnUnaPosicionQueNoExisteYTiraPosicionInvalidaException() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(24, 1), mapa);

    }

    @Test(expected = CeldaOcupadaException.class)
    public void pongoElJugadorEnElMapaEnUnaPosicionQueYaEstaOcupadaYTiraCeldaOcupadaException() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Madera madera = new Madera();

        mapa.ocuparTerreno(new Posicion(1, 1), madera);


        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);
    }

    @Test
    public void golpeoUnJugadorConUnMaterialEnElMapaYSeLiberaLaPosicionDelMaterialAlRomperlo() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Madera madera = new Madera();

        mapa.ocuparTerreno(new Posicion(1, 1), madera);


        Jugador jugador = new Jugador(new Posicion(2, 1), mapa);

        jugador.equipar(ConstructorHerramientas.construirHachaDeMetal());

        mapa.chocarJugadorConMaterial(jugador, madera);

        Assert.assertEquals(null, mapa.obtenerCelda(new Posicion(1, 1)).obtenerElemento());
    }

    @Test
    public void posicionSeSeteaCorrectamente() {
        Posicion posicion = new Posicion(1,1);

        Assert.assertEquals(posicion.y(),1);
    }
}
