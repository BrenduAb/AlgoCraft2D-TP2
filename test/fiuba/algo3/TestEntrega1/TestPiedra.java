package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Excepciones.MaterialRotoException;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;
import fiuba.algo3.model.Materiales.Piedra;
import junit.framework.Assert;
import org.junit.Test;

public class TestPiedra {

    @Test
    public void piedraSeCreaCorrectamenteConSuDurabilidadCorrespondiente(){
        Piedra piedra = new Piedra();
        int durabilidadPiedra = 30;

        Assert.assertNotNull(piedra);
        Assert.assertEquals(durabilidadPiedra, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaConUnHachaDeMaderaYNoSeReduceSuDurabilidad(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        hachaMadera.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaConUnHachaDePiedraYNoSeReduceSuDurabilidad(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        hachaPiedra.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial, piedra.obtenerDurabilidad());
    }


    @Test
    public void piedraChocaConUnHachaDeMetalYNoSeReduceSuDurabilidad(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        hachaMetal.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaConUnPicoDeMaderaUnaVezYSeReduceSuDurabilidadSegunLaFuerzaDePico(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        int desgastePiedra = picoMadera.obtenerFuerza();

        picoMadera.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial-desgastePiedra, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaConUnPicoDeMaderaDosVecesYSeReduceSuDurabilidadSegunLaFuerzaDePicoDosVeces(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        int desgastePiedra = picoMadera.obtenerFuerza();

        picoMadera.usarContra(piedra);
        picoMadera.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial-(desgastePiedra*2), piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaConUnPicoDePiedraYSeReduceSuDurabilidadSegunLaFuerzaDePico(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        int desgastePiedra = picoPiedra.obtenerFuerza();

        picoPiedra.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial-desgastePiedra, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaConUnPicoDeMetalYSeReduceSuDurabilidadSegunLaFuerzaDePico(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        int desgastePiedra = picoMetal.obtenerFuerza();

        picoMetal.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial-desgastePiedra, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaConUnPicoFinoYNoSeReduceSuDurabilidad(){
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();
        Piedra piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();
        picoFino.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraChocaConUnPicoDeMaderaCatorceVecesYNoSeRompe(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Piedra piedra = new Piedra();

        for(int i = 1; i <= 14; i++) {
            picoMadera.usarContra(piedra);
        }

        Assert.assertNotSame(0, piedra.obtenerDurabilidad());
    }

    @Test(expected = MaterialRotoException.class)
    public void piedraChocaConUnPicoDeMaderaQuinceVecesYSeRompe(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Piedra piedra = new Piedra();

        for(int i = 1; i <= 15; i++) {
            picoMadera.usarContra(piedra);
        }
    }


    @Test
    public void piedraChocaConUnPicoDePiedraSieteVecesYNoSeRompe(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Piedra piedra = new Piedra();

        for(int i = 1; i <= 7; i++) {
            picoPiedra.usarContra(piedra);
        }

        Assert.assertNotSame(0, piedra.obtenerDurabilidad());
    }

    @Test(expected = MaterialRotoException.class)
    public void piedraChocaConUnPicoDePiedraOchoVecesYSeRompe(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Piedra piedra = new Piedra();

        for(int i = 1; i <= 8; i++) {
            picoPiedra.usarContra(piedra);
        }
    }

    @Test
    public void piedraChocaConUnPicoDeMetalDosVecesYNoSeRompe(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Piedra piedra = new Piedra();

        picoMetal.usarContra(piedra);
        picoMetal.usarContra(piedra);

        Assert.assertNotSame(0, piedra.obtenerDurabilidad());
    }

    @Test(expected = MaterialRotoException.class)
    public void piedraChocaConUnPicoDeMetalTresVecesYSeRompe(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Piedra piedra = new Piedra();

        picoMetal.usarContra(piedra);
        picoMetal.usarContra(piedra);
        picoMetal.usarContra(piedra);
    }
}
