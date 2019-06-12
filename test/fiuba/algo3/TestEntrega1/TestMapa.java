package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Excepciones.CeldaOcupadaException;
import fiuba.algo3.Excepciones.PosicionInvalidaException;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMapa {

    @Test
    public void pongoElJugadorEnElMapaEnUnaPosicionQueNoExisteYTiraPosicionInvalidaException() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        assertThrows(PosicionInvalidaException.class,
                () -> {
                    Jugador jugador = new Jugador(new Posicion(10, 1), mapa);
                });

    }

    @Test
    public void pongoElJugadorEnElMapaEnUnaPosicionQueYaEstaOcupadaYTiraCeldaOcupadaException() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Madera madera = new Madera();

        mapa.ocuparTerreno(new Posicion(1, 1), madera);


        assertThrows(CeldaOcupadaException.class,
                () -> {
                    Jugador jugador = new Jugador(new Posicion(1, 1), mapa);
                });
    }
}
