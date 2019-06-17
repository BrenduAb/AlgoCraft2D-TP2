package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Materiales.*;
import org.junit.Assert;
import org.junit.Test;

public class TestPico {
    @Test
    public void seCreaPicoDeMaderaCorrectamenteConSuDurabilidadYFuerzaCorrespondiente(){
        int fuerzaPicoMadera = 2;
        int durabilidadPicoMadera = 100;

        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();

        Assert.assertNotNull(picoMadera);
        Assert.assertEquals(fuerzaPicoMadera, picoMadera.obtenerFuerza());
        Assert.assertEquals(durabilidadPicoMadera, picoMadera.obtenerDurabilidad());
    }

    @Test
    public void seCreaPicoDePiedraCorrectamenteConSuDurabilidadYFuerzaCorrespondiente(){
        int fuerzaPicoPiedra = 4;
        int durabilidadPicoPiedra = 200;

        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();

        Assert.assertNotNull(picoPiedra);
        Assert.assertEquals(fuerzaPicoPiedra, picoPiedra.obtenerFuerza());
        Assert.assertEquals(durabilidadPicoPiedra, picoPiedra.obtenerDurabilidad());
    }

    @Test
    public void seCreaPicoDeMetalCorrectamenteConSuDurabilidadYFuerzaCorrespondiente(){
        int fuerzaPicoMetal = 12;
        int durabilidadPicoMetal = 400;

        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();

        Assert.assertNotNull(picoMetal);
        Assert.assertEquals(fuerzaPicoMetal, picoMetal.obtenerFuerza());
        Assert.assertEquals(durabilidadPicoMetal, picoMetal.obtenerDurabilidad());
    }

    @Test
    public void usoPicoDeMaderaContraMaderaYBajaSuDurabilidad(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Madera madera = new Madera();

        int durabilidadPicoMadera = picoMadera.obtenerDurabilidad();
        int desgastePicoMadera = picoMadera.obtenerFuerza();


        picoMadera.usarContra(madera);

        Assert.assertEquals(durabilidadPicoMadera-desgastePicoMadera, picoMadera.obtenerDurabilidad());
    }

    @Test
    public void usoPicoDeMaderaContraPiedraYBajaSuDurabilidad(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Piedra piedra = new Piedra();

        int durabilidadPicoMadera = picoMadera.obtenerDurabilidad();
        int desgastePicoMadera = picoMadera.obtenerFuerza();

        picoMadera.usarContra(piedra);

        Assert.assertEquals(durabilidadPicoMadera-desgastePicoMadera, picoMadera.obtenerDurabilidad());
    }

    @Test
    public void usoPicoDeMaderaContraMetalYBajaSuDurabilidad(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Metal metal = new Metal();

        int durabilidadPicoMadera = picoMadera.obtenerDurabilidad();
        int desgastePicoMadera = picoMadera.obtenerFuerza();

        picoMadera.usarContra(metal);

        Assert.assertEquals(durabilidadPicoMadera-desgastePicoMadera, picoMadera.obtenerDurabilidad());
    }

    @Test
    public void usoPicoDeMaderaContraDiamanteYBajaSuDurabilidad(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Diamante diamante = new Diamante();

        int durabilidadPicoMadera = picoMadera.obtenerDurabilidad();
        int desgastePicoMadera = picoMadera.obtenerFuerza();

        picoMadera.usarContra(diamante);

        Assert.assertEquals(durabilidadPicoMadera-desgastePicoMadera, picoMadera.obtenerDurabilidad());
    }

    @Test
    public void usoPicoDePiedraContraMaderaYBajaSuDurabilidad(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Madera madera = new Madera();

        int durabilidadPicoPiedra = picoPiedra.obtenerDurabilidad();

        picoPiedra.usarContra(madera);

        Assert.assertEquals(durabilidadPicoPiedra-=(picoPiedra.obtenerFuerza()/1.5), picoPiedra.obtenerDurabilidad());

    }

    @Test
    public void usoPicoDePiedraContraPiedraYBajaSuDurabilidad(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Piedra piedra = new Piedra();

        int durabilidadPicoPiedra = picoPiedra.obtenerDurabilidad();

        picoPiedra.usarContra(piedra);

        Assert.assertEquals(durabilidadPicoPiedra-=(picoPiedra.obtenerFuerza()/1.5), picoPiedra.obtenerDurabilidad());
    }

    @Test
    public void usoPicoDePiedraContraMetalYBajaSuDurabilidad(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Metal metal = new Metal();

        int durabilidadPicoPiedra = picoPiedra.obtenerDurabilidad();

        picoPiedra.usarContra(metal);

        Assert.assertEquals(durabilidadPicoPiedra-=(picoPiedra.obtenerFuerza()/1.5), picoPiedra.obtenerDurabilidad());
    }

    @Test
    public void usoPicoDePiedraContraDiamanteYBajaSuDurabilidad(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Diamante diamante = new Diamante();

        int durabilidadPicoPiedra = picoPiedra.obtenerDurabilidad();

        picoPiedra.usarContra(diamante);

        Assert.assertEquals(durabilidadPicoPiedra-=(picoPiedra.obtenerFuerza()/1.5), picoPiedra.obtenerDurabilidad());
    }

    @Test
    public void usoPicoDeMetalContraMaderaYNoBajaSuDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Madera madera = new Madera();

        int durabilidadPicoMetal = picoMetal.obtenerDurabilidad();

        picoMetal.usarContra(madera);

        Assert.assertEquals(durabilidadPicoMetal, picoMetal.obtenerDurabilidad());

    }

    @Test
    public void usoPicoDeMetalContraPiedraYNoBajaSuDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Piedra piedra = new Piedra();

        int durabilidadPicoMetal = picoMetal.obtenerDurabilidad();

        picoMetal.usarContra(piedra);

        Assert.assertEquals(durabilidadPicoMetal, picoMetal.obtenerDurabilidad());

    }

    @Test
    public void usoPicoMetalContraMetalYNoBajaSuDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Metal metal = new Metal();

        int durabilidadPicoMetal = picoMetal.obtenerDurabilidad();

        picoMetal.usarContra(metal);

        Assert.assertEquals(durabilidadPicoMetal, picoMetal.obtenerDurabilidad());
    }

    @Test
    public void usoPicoMetalContraDiamanteYNoBajaSuDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Diamante diamante = new Diamante();

        int durabilidadPicoMetal = picoMetal.obtenerDurabilidad();

        picoMetal.usarContra(diamante);

        Assert.assertEquals(durabilidadPicoMetal, picoMetal.obtenerDurabilidad());
    }

/*

    @Test
    public void PicoDeMaderaChocaContraCualquierMaterialYSeDesgasta2puntos(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();

        Material metal = new Metal();

        pico.usarContra(metal);

        Assert.assertEquals(pico.obtenerDurabilidad(), 98);
    }
*/

    @Test
    public void PicoDeMaderaChocaContraUnaMaderaYLeResta2Puntos(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Material madera = new Madera();

        int durabilidadMadera = madera.obtenerDurabilidad();

        picoMadera.usarContra(madera);

        Assert.assertEquals(durabilidadMadera, madera.obtenerDurabilidad());
    }

    @Test
    public void PicoDeMaderaChocaContraUnaPiedraYLeResta2Puntos(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Material piedra = new Piedra();

        int durabilidadPiedra = piedra.obtenerDurabilidad();

        picoMadera.usarContra(piedra);

        Assert.assertEquals(durabilidadPiedra-2, piedra.obtenerDurabilidad());
    }

    @Test
    public void picoDeMaderaChocaContraUnMetalYNoLeRestDurabilidad(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Material metal = new Metal();

        int durabilidadMetal = metal.obtenerDurabilidad();

        picoMadera.usarContra(metal);

        Assert.assertEquals(durabilidadMetal, metal.obtenerDurabilidad());
    }

    @Test
    public void picoDePiedraChochaContraMaderaYNoLeRestaPuntosDeDurabilidad(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Material madera = new Madera();

        int durabilidadMadera = madera.obtenerDurabilidad();

        picoPiedra.usarContra(madera);

        Assert.assertEquals(durabilidadMadera, madera.obtenerDurabilidad());
    }

    @Test
    public void picoDePiedraChochaContraPiedraYLeDesgasta4PuntosDeDurabilidad(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Material piedra = new Piedra();

        int durabilidadPiedra = piedra.obtenerDurabilidad();

        picoPiedra.usarContra(piedra);

        Assert.assertEquals(durabilidadPiedra -4, piedra.obtenerDurabilidad());
    }

    @Test
    public void picoDePiedraChochaContraMetalYLeDesgasta4PuntosDeDurabilidad(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Material metal = new Metal();

        int durabilidadMetal = metal.obtenerDurabilidad();

        picoPiedra.usarContra(metal);

        Assert.assertEquals(durabilidadMetal -4, metal.obtenerDurabilidad());
    }

    @Test
    public void picoDeMetalChochaContraMaderaYNoLeRestaPuntosDeDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Material madera = new Madera();

        int durabilidadMadera = madera.obtenerDurabilidad();

        picoMetal.usarContra(madera);

        Assert.assertEquals(durabilidadMadera, madera.obtenerDurabilidad());
    }

    @Test
    public void picoDeMetalChochaContraPiedraYLeResta12PuntosDeDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Material piedra = new Piedra();

        int durabilidadPiedra = piedra.obtenerDurabilidad();

        picoMetal.usarContra(piedra);

        Assert.assertEquals(durabilidadPiedra-12, piedra.obtenerDurabilidad());
    }

    @Test
    public void picoDeMetalChochaContraMetalYNoLeRestaPuntosDeDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Material metal = new Metal();

        int durabilidadMetal = metal.obtenerDurabilidad();

        picoMetal.usarContra(metal);

        Assert.assertEquals(durabilidadMetal, metal.obtenerDurabilidad());
    }

    @Test
    public void picoDeMaderaSeUsaContraCualquierMaterial49VecesYNoSeRompe(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Material metal = new Metal();

        int durabilidadInicialPicoMadera = picoMadera.obtenerDurabilidad();

        for(int i = 1; i <= 49; i++) {
            picoMadera.usarContra(metal);
        }

        Assert.assertNotSame(durabilidadInicialPicoMadera, picoMadera.obtenerDurabilidad());
        Assert.assertNotSame(0, picoMadera.obtenerDurabilidad());
    }

    @Test
    public void picoDeMaderaSeUsaContraCualquierMaterial50VecesYSeRompe(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Material madera = new Madera();

        for(int i = 1; i <= 50; i++) {
            picoMadera.usarContra(madera);
        }

        Assert.assertEquals(0, picoMadera.obtenerDurabilidad());
    }

    @Test
    public void picoDeMaderaSeUsaContraCualquierMaterialMasDe50VecesYSigueRota(){
        Pico picoMadera = ConstructorHerramientas.construirPicoDeMadera();
        Material piedra = new Piedra();

        for(int i = 1; i <= 55; i++) {
            picoMadera.usarContra(piedra);
        }

        Assert.assertEquals(0, picoMadera.obtenerDurabilidad());
    }

    @Test
    public void picoDePiedraSeUsaContraCualquierMaterial66VecesYNoSeRompe(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Material piedra = new Piedra();

        int durabilidadInicialPicoPiedra = picoPiedra.obtenerDurabilidad();

        for(int i = 1; i <= 66; i++) {
            picoPiedra.usarContra(piedra);
        }

        Assert.assertNotSame(durabilidadInicialPicoPiedra, picoPiedra.obtenerDurabilidad());
        Assert.assertNotSame(0, picoPiedra.obtenerDurabilidad());
    }

    @Test
    public void picoDePiedraSeUsaContraCualquierMaterial67VecesYSeRompe(){
        Pico picoPiedra = ConstructorHerramientas.construirPicoDePiedra();
        Material diamante = new Diamante();

        for(int i = 1; i <= 67; i++) {
            picoPiedra.usarContra(diamante);
        }

        Assert.assertEquals(0, picoPiedra.obtenerDurabilidad());
    }

    @Test
    public void picoDeMetalSeUsaContraCualquierMaterial9VecesYNoSeRompeNiDisminuyeSuDurabilidad(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Material piedra = new Piedra();

        int durabilidadInicialPicoMetal = picoMetal.obtenerDurabilidad();

        for(int i = 1; i <= 9; i++) {
            picoMetal.usarContra(piedra);
        }

        Assert.assertEquals(durabilidadInicialPicoMetal, picoMetal.obtenerDurabilidad());
        Assert.assertNotSame(0, picoMetal.obtenerDurabilidad());
    }

    @Test
    public void picoDeMetalSeUsaContraCualquierMaterial10VecesYSeRompe(){
        Pico picoMetal = ConstructorHerramientas.construirPicoDeMetal();
        Material madera = new Madera();

        for(int i = 1; i <= 10; i++) {
            picoMetal.usarContra(madera);
        }

        Assert.assertEquals(0, picoMetal.obtenerDurabilidad());
    }
}
