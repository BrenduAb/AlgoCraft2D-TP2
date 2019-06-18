package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Excepciones.MaterialRotoException;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;
import fiuba.algo3.model.Materiales.Metal;
import junit.framework.Assert;
import org.junit.Test;

public class TestMetal {
    @Test
    public void metalSeCreaCorrectamenteConSuDurabilidadCorrespondiente() {
        Metal metal = new Metal();
        int durabilidadMetal = 50;

        Assert.assertNotNull(metal);
        Assert.assertEquals(durabilidadMetal, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnHachaDeMaderaYNoSeReduceSuDurabilidad() {
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        hachaMadera.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnHachaDePiedraYNoSeReduceSuDurabilidad(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        hachaPiedra.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnHachaDeMetalYNoSeReduceSuDurabilidad(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        hachaMetal.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }


    @Test
    public void metalChocaConUnPicoDeMaderaYNoSeReduceSuDurabilidad() {
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        picoMadera.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnPicoDePiedraUnaVezYSeReduceSuDurabilidadSegunLaFuerzaDelPicoDePiedra() {
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Metal metal = new Metal();
        int durabilidadInicial = metal.obtenerDurabilidad();
        int desgaste = picoPiedra.obtenerFuerza();

        picoPiedra.usarContra(metal);

        Assert.assertEquals(durabilidadInicial - desgaste, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnPicoDePiedraDosVecesYSeReduceSuDurabilidadSegunLaFuerzaDelPicoDePiedraDosVeces() {
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Metal metal = new Metal();
        int durabilidadInicial = metal.obtenerDurabilidad();
        int desgaste = picoPiedra.obtenerFuerza();

        picoPiedra.usarContra(metal);
        picoPiedra.usarContra(metal);

        Assert.assertEquals(durabilidadInicial - (desgaste * 2), metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnPicoDeMetalYNoSeReduceSuDurabilidad() {
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        picoMetal.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnPicoFinoYNoSeReduceSuDurabilidad() {
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();
        Metal metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();
        picoFino.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, metal.obtenerDurabilidad());
    }

    @Test
    public void metalChocaConUnPicoDePiedraDoceVecesYNoSeRompe(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Metal metal = new Metal();

        for(int i = 1; i <= 12; i++) {
            picoPiedra.usarContra(metal);
        }

        Assert.assertNotSame(0, metal.obtenerDurabilidad());
    }

    @Test(expected = MaterialRotoException.class)
    public void metalChocaConUnPicoDePiedraTreceVecesYSeRompe(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Metal metal = new Metal();

        for(int i = 1; i <= 13; i++) {
            picoPiedra.usarContra(metal);
        }
    }

}