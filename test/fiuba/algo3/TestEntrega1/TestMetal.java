/*package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;
import junit.framework.Assert;
import org.junit.Test;

public class TestMetal {
    @Test
    public void metalSeCreaCorrectamenteConSuDurabilidadCorrespondiente(){
        Metal metal = new Metal();

        int durabilidadInicial = 50;

        Assert.assertNotNull(metal);
        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaContraHachaDeMaderaYNoSeDesgasta(){
        Metal metal = new Metal();
        Madera madera = new Madera();
        Hacha hachaDeMadera = new Hacha(madera);

        int durabilidadInicial = metal.obtenerDurabilidad();

        metal.chocarContra(hachaDeMadera);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaContraHachaDePiedra1VezYNoSeDesgata(){
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        Hacha hachaDePiedra = new Hacha(piedra);

        int durabilidadInicial = metal.obtenerDurabilidad();

        metal.chocarContra(hachaDePiedra);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChochaContraHachaDeMetalYNoSeDesgasta(){
        Metal metal = new Metal();
        Hacha hachaDeMetal = new Hacha(metal);

        int durabilidadInicial = metal.obtenerDurabilidad();

        metal.chocarContra(hachaDeMetal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChochaContraUnPicoDeMaderaYNoSeDesgasta(){
        Metal metal = new Metal();
        Madera madera = new Madera();
        Pico picoDeMadera = new Pico(madera);

        int durabilidadInicial = metal.obtenerDurabilidad();

        metal.chocarContra(picoDeMadera);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    //Estos tests fallan porque no se como solucionar que chocar contra sepa que esta recibiendo un pico de piedra
    //y no solo pico. Habria que charlarlo para ver una solucion en conjunto.

    @Test
    public void metalChocaContraPicoDePiedra1VezYPierde4Durabilidad(){
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        Pico picoDePiedra = new Pico(piedra);

        int durabilidadInicial = metal.obtenerDurabilidad();

        metal.chocarContra(picoDePiedra);

        Assert.assertEquals(durabilidadInicial - 4, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaContraPicoDePiedra2VecesYPierde8Durabilidad(){
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        Pico picoDePiedra = new Pico(piedra);

        int durabilidadInicial = metal.obtenerDurabilidad();

        metal.chocarContra(picoDePiedra);
        metal.chocarContra(picoDePiedra);

        Assert.assertEquals(durabilidadInicial - 8, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChochaContraUnPicoDeMetalYNoSeDesgasta(){
        Metal metal = new Metal();
        Pico picoDeMetal = new Pico(metal);

        int durabilidadInicial = metal.obtenerDurabilidad();

        metal.chocarContra(picoDeMetal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChochaContraUnPicoFinoYNoSeDesgasta(){
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        PicoFino picoFino = new PicoFino(metal, piedra);

        int durabilidadInicial = metal.obtenerDurabilidad();

        metal.chocarContra(picoFino);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }
}
*/