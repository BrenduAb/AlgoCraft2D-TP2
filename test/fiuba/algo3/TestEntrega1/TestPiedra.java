package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Piedra;
import junit.framework.Assert;
import org.junit.Test;

public class TestPiedra {

    @Test
    public void piedraIniciaCon30DeDurabilidad(){
        Piedra piedra = new Piedra();

        Assert.assertEquals(30,piedra.obtenerDurabilidad());
    }


    @Test
    public void piedraChocaConUnHachaYNoSeReduceSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMadera();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        hacha.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial,
                piedra.obtenerDurabilidad());
    }

}
