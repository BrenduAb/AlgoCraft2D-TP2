package fiuba.algo3.TestEntrega1;


import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;
import fiuba.algo3.model.Materiales.Diamante;
import junit.framework.Assert;
import org.junit.Test;

public class TestDiamante {
    @Test
    public void diamanteSeCreaCorrectamenteConSuDurabilidadCorrespondiente(){
        Diamante diamante = new Diamante();

        int durabilidadDiamante = 100;

        Assert.assertNotNull(diamante);
        Assert.assertEquals(durabilidadDiamante, diamante.obtenerDurabilidad());
    }


    @Test
    public void hachaDeMaderaSeUsaContraDiamanteYDiamanteNoSeDesgasta(){
        Diamante diamante = new Diamante();
        Hacha hachaDeMadera = ConstructorHerramientas.construirHachaDeMadera();

        int durabilidadInicialDiamante = diamante.obtenerDurabilidad();

        hachaDeMadera.usarContra(diamante);

        Assert.assertEquals(durabilidadInicialDiamante, diamante.obtenerDurabilidad());
    }


    @Test
    public void hachaDeMetalSeUsaContraDiamanteYDiamanteNoSeDesgasta(){
        Diamante diamante = new Diamante();
        Hacha hachaDeMetal = ConstructorHerramientas.construirHachaDeMetal();

        int durabilidadInicialDiamante = diamante.obtenerDurabilidad();

        hachaDeMetal.usarContra(diamante);

        Assert.assertEquals(durabilidadInicialDiamante, diamante.obtenerDurabilidad());
    }


    @Test
    public void hachaDePiedraSeUsaContraDiamanteYDiamanteNoSeDesgasta(){
        Diamante diamante = new Diamante();
        Hacha hachaDePiedra = ConstructorHerramientas.construirHachaDePiedra();

        int durabilidadInicialDiamante = diamante.obtenerDurabilidad();

        hachaDePiedra.usarContra(diamante);

        Assert.assertEquals(durabilidadInicialDiamante, diamante.obtenerDurabilidad());
    }


    @Test
    public void picoDeMaderaSeUsaContraDiamanteYDiamanteNoSeDesgasta(){
        Diamante diamante = new Diamante();
        Pico picoDeMadera = ConstructorHerramientas.construirPicoDeMadera();

        int durabilidadInicialDiamante = diamante.obtenerDurabilidad();

        picoDeMadera.usarContra(diamante);

        Assert.assertEquals(durabilidadInicialDiamante, diamante.obtenerDurabilidad());
    }

    @Test
    public void picoDePiedraSeUsaContraDiamanteYDiamanteNoSeDesgasta(){
        Diamante diamante = new Diamante();
        Pico picoDePiedra = ConstructorHerramientas.construirPicoDePiedra();

        int durabilidadInicialDiamante = diamante.obtenerDurabilidad();

        picoDePiedra.usarContra(diamante);

        Assert.assertEquals(durabilidadInicialDiamante, diamante.obtenerDurabilidad());
    }

    @Test
    public void picoDeMetalSeUsaContraDiamanteYDiamanteNoSeDesgasta(){
        Diamante diamante = new Diamante();
        Pico picoDeMetal = ConstructorHerramientas.construirPicoDeMetal();

        int durabilidadInicialDiamante = diamante.obtenerDurabilidad();

        picoDeMetal.usarContra(diamante);

        Assert.assertEquals(durabilidadInicialDiamante, diamante.obtenerDurabilidad());
    }

    @Test
    public void picoFinoSeUsaUnaVezContraDiamanteYDiamanteSeDesgastaSegunLaFuerzaDelPicoFino(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();

        int durabilidadInicialDiamante = diamante.obtenerDurabilidad();
        int desgasteDiamante = picoFino.obtenerFuerza();

        picoFino.usarContra(diamante);

        Assert.assertEquals(durabilidadInicialDiamante-desgasteDiamante, diamante.obtenerDurabilidad());
    }

    @Test
    public void picoFinoSeUsaDosVecesContraDiamanteYDiamanteSeDesgastaDosVecesSegunLaFuerzaDelPicoFino(){
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();
        Diamante diamante = new Diamante();

        int durabilidadInicialDiamante = diamante.obtenerDurabilidad();
        int desgasteDiamante = picoFino.obtenerFuerza();

        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);

        Assert.assertEquals(durabilidadInicialDiamante-(desgasteDiamante * 2), diamante.obtenerDurabilidad());
    }

    @Test
    public void diamanteChocaConUnPicoFinoCuatroVecesYNoSeRompe(){
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();
        Diamante diamante = new Diamante();

        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);

        Assert.assertNotSame(0, diamante.obtenerDurabilidad());
    }

    @Test
    public void diamanteChocaConUnPicoFinoCincoVecesYSeRompe(){
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();
        Diamante diamante = new Diamante();

        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);

        Assert.assertEquals(0, diamante.obtenerDurabilidad());
    }

    @Test
    public void diamanteChocaConUnPicoFinoMasDeCincoVecesYSigueRota(){
        PicoFino picoFino = ConstructorHerramientas.construirPicoFino();
        Diamante diamante = new Diamante();

        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);
        picoFino.usarContra(diamante);

        Assert.assertEquals(0, diamante.obtenerDurabilidad());
    }
}
