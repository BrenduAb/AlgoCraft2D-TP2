package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Materiales.Metal;
import junit.framework.Assert;
import org.junit.Test;

public class TestMetal {
    @Test
    public void metalIniciaCon50DeDurabilidad() {
        Metal metal = new Metal();

        Assert.assertEquals(50, metal.obtenerDurabilidad());
    }


    @Test
    public void metalChocaConUnPicoDePiedraYSeReduceSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDePiedra();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        pico.usarContra(metal);

        Assert.assertEquals(durabilidadInicial -4, metal.obtenerDurabilidad());
    }
    @Test
    public void metalChocaConUnPicoDeMaderaYNoSeReduceSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        pico.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnHachaYNoSeReduceSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMadera();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        hacha.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }
}