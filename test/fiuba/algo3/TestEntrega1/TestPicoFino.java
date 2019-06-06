package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;

import fiuba.algo3.model.Herramientas.PicoFino;
import fiuba.algo3.model.Materiales.Diamante;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class TestPicoFino {

    @Test
    public void testSeCreaCorrectamentePicoFinoConSuDurabilidadYFuerzaCorrespondiente(){
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadPicoFino = 1000;
        int fuerzaPicoFino = 20;

        Assert.assertNotNull(picoFino);
        Assert.assertEquals(durabilidadPicoFino, picoFino.obtenerDurabilidad());
        Assert.assertEquals(fuerzaPicoFino, picoFino.obtenerFuerza());
    }

    @Test
    public void testPicoFinoSeUsaContraMaderaYSeDesgastaSuDurabilidad(){
        Madera madera = new Madera();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadPicoFino = picoFino.obtenerDurabilidad();

        picoFino.usarContra(madera);

        Assert.assertEquals(durabilidadPicoFino - 100, picoFino.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraPiedraYSeDesgastaSuDurabilidad(){
        Piedra piedra = new Piedra();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadPicoFino = picoFino.obtenerDurabilidad();

        picoFino.usarContra(piedra);

        Assert.assertEquals(durabilidadPicoFino - 100, picoFino.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraMetalYSeDesgastaSuDurabilidad(){
        Metal metal = new Metal();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadPicoFino = picoFino.obtenerDurabilidad();

        picoFino.usarContra(metal);

        Assert.assertEquals(durabilidadPicoFino - 100, picoFino.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraDiamanteYSeDesgastaSuDurabilidad(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadPicoFino = picoFino.obtenerDurabilidad();

        picoFino.usarContra(diamante);

        Assert.assertEquals(durabilidadPicoFino - 100, picoFino.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraMaderaYLaMaderaNoSeDesgasta(){
        Madera madera = new Madera();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadMadera= madera.obtenerDurabilidad();

        picoFino.usarContra(madera);

        Assert.assertEquals(durabilidadMadera, madera.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraPiedraYLaPiedraNoSeDesgasta(){
        Piedra piedra = new Piedra();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadPiedra = piedra.obtenerDurabilidad();

        picoFino.usarContra(piedra);

        Assert.assertEquals(durabilidadPiedra, piedra.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraMetalYElMetalNoSeDesgasta(){
        Metal metal = new Metal();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadMetal = metal.obtenerDurabilidad();

        picoFino.usarContra(metal);

        Assert.assertEquals(durabilidadMetal, metal.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraDiamanteYSeDesgastaLaDurabilidadDelDiamante(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadDiamante = diamante.obtenerDurabilidad();

        picoFino.usarContra(diamante);

        Assert.assertEquals(durabilidadDiamante - 20, diamante.obtenerDurabilidad());
    }
}


