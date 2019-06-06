/*package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Piedra;
import junit.framework.Assert;
import org.junit.Test;

public class TestPiedra {

    @Test
    public void piedraChocaConUnHachaYNoSeReduceSuDurabilidad(){
        Piedra piedra = new Piedra();
        Madera madera = new Madera();
        Hacha hacha = new Hacha(madera);
        int durabilidadInicial = 30;
        piedra.chocarContra(hacha);

        Assert.assertEquals(durabilidadInicial,
                piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaContraCualquierPicoYReduceSuDurabilidad(){
        Piedra piedra = new Piedra();
        Madera madera = new Madera();
        Metal metal = new Metal();

        Pico picoMadera = new Pico(madera);
        Pico picoPiedra = new Pico(piedra);
        Pico picoMetal = new Pico(metal);

        int durabilidadInicial = piedra.obtenerDurabilidad();

        piedra.chocarContra(picoMadera);

        Assert.assertEquals(durabilidadInicial - 2,
                piedra.obtenerDurabilidad());

        piedra.chocarContra(picoMetal);

        Assert.assertEquals(durabilidadInicial - 14,
                piedra.obtenerDurabilidad());

        piedra.chocarContra(picoPiedra);

        Assert.assertEquals(durabilidadInicial - 18,
                piedra.obtenerDurabilidad());
    }
}
*/