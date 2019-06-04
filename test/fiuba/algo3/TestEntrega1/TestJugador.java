package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.*;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Materiales.Madera;
import junit.framework.Assert;
import org.junit.Test;

public class TestJugador {

    @Test
    public void JugadorSeCreaConUnSoloObjetoEnSuInventario(){
        Jugador jugador = new Jugador();

        int objetosDelInventario = jugador.obtenerCantidadDeObjetosDelInventario();
        Assert.assertEquals(1, objetosDelInventario);
    }

    @Test
    public void JugadorSeCreaConUnHachaDeMaderaEnSuInventario(){
        Jugador jugador = new Jugador();
        Madera madera = new Madera();
        Hacha hacha = new Hacha(madera);

        Assert.assertEquals(true, hacha.esIgual(jugador.herramientaSeleccionada()));
    }
}
