package fiuba.algo3.TestEntrega1;

import com.sun.java.swing.plaf.motif.MotifTextAreaUI;
import fiuba.algo3.Contratos.IHerramienta;
import fiuba.algo3.model.*;
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
