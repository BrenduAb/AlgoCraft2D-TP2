package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Excepciones.MaterialRotoException;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;
import fiuba.algo3.model.Materiales.Madera;
import junit.framework.Assert;
import org.junit.Test;

public class TestMadera {

    @Test
    public void maderaSeCreaCorrectamenteConSuDurabilidadCorrespondiente(){
        Madera madera = new Madera();
        int durabilidadMadera = 10;

        Assert.assertNotNull(madera);
        Assert.assertEquals(durabilidadMadera, madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnHachaDeMaderaUnaVezYSeReduceSuDurabilidadSegunLaFuerzaDelHacha(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        int desgasteMadera = hachaMadera.obtenerFuerza();

        hachaMadera.usarContra(madera);

        Assert.assertEquals(durabilidadInicial-desgasteMadera, madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnHachaDeMaderaDosVecesYSeReduceSuDurabilidadSegunLaFuerzaDelHachaDosVeces(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        int desgasteMadera = hachaMadera.obtenerFuerza();

        hachaMadera.usarContra(madera);
        hachaMadera.usarContra(madera);


        Assert.assertEquals(durabilidadInicial-(desgasteMadera*2), madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnHachaDePiedraYSeReduceSuDurabilidadSegunLaFuerzaDelHacha(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        int desgasteMadera = hachaPiedra.obtenerFuerza();

        hachaPiedra.usarContra(madera);

        Assert.assertEquals(durabilidadInicial-desgasteMadera, madera.obtenerDurabilidad());
    }

    @Test(expected = MaterialRotoException.class)
    public void maderaChocaConUnHachaDeMetalYSeReduceSuDurabilidadRompiendolo(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        int desgasteMadera = hachaMetal.obtenerFuerza();

        hachaMetal.usarContra(madera);
    }

    @Test
    public void maderaChocaConUnPicoDeMaderaYNoSeReduceSuDurabilidad(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        picoMadera.usarContra(madera);

        Assert.assertEquals(durabilidadInicial, madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnPicoDePiedraYNoSeReduceSuDurabilidad(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        picoPiedra.usarContra(madera);

        Assert.assertEquals(durabilidadInicial, madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnPicoDeMetalYNoSeReduceSuDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        picoMetal.usarContra(madera);

        Assert.assertEquals(durabilidadInicial, madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnPicoFinolYNoSeReduceSuDurabilidad(){
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        picoFino.usarContra(madera);

        Assert.assertEquals(durabilidadInicial, madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnHachaDeMaderaCuatroVecesYNoSeRompe(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Madera madera = new Madera();

        hachaMadera.usarContra(madera);
        hachaMadera.usarContra(madera);
        hachaMadera.usarContra(madera);
        hachaMadera.usarContra(madera);

        Assert.assertNotSame(0, madera.obtenerDurabilidad());
    }

    @Test(expected = MaterialRotoException.class)
    public void maderaChocaConUnHachaDeMaderaCincoVecesYSeRompe(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Madera madera = new Madera();

        hachaMadera.usarContra(madera);
        hachaMadera.usarContra(madera);
        hachaMadera.usarContra(madera);
        hachaMadera.usarContra(madera);
        hachaMadera.usarContra(madera);
    }


    @Test
    public void maderaChocaConUnHachaDePiedraUnaVezYNoSeRompe(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        Madera madera = new Madera();

        hachaPiedra.usarContra(madera);

        Assert.assertNotSame(0, madera.obtenerDurabilidad());
    }

    @Test(expected = MaterialRotoException.class)
    public void maderaChocaConUnHachaDePiedraDosVecesYSeRompe(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        Madera madera = new Madera();

        hachaPiedra.usarContra(madera);
        hachaPiedra.usarContra(madera);
    }

    @Test(expected = MaterialRotoException.class)
    public void maderaChocaConUnHachaDeMetalUnaVezYSeRompe(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        Madera madera = new Madera();

        hachaMetal.usarContra(madera);
    }
}
