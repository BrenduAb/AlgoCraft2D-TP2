package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class TestPico {
    @Test
    public void seCreaPicoDeMaderaConFuerza2yDurabilidad100(){

        Pico pico = ConstructorHerramientas.construirPicoDeMadera();

        Assert.assertEquals(pico.obtenerFuerza(), 2);
        Assert.assertEquals(pico.obtenerDurabilidad(), 100);
    }

    @Test
    public void seCreaPicoDePiedraConFuerza4yDurabilidad200(){

        Pico pico = ConstructorHerramientas.construirPicoDePiedra();

        Assert.assertEquals(pico.obtenerFuerza(), 4);
        Assert.assertEquals(pico.obtenerDurabilidad(), 200);
    }

    @Test
    public void seCreaPicoDeMetalConFuerza12yDurabilidad400(){

        Pico pico = ConstructorHerramientas.construirPicoDeMetal();

        Assert.assertEquals(pico.obtenerFuerza(), 12);
        Assert.assertEquals(pico.obtenerDurabilidad(), 400);
    }

    @Test
    public void usoPicoMaderaContraMaderaYBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();

        Madera madera = new Madera();

        pico.usarContra(madera);
        Assert.assertEquals(98, pico.obtenerDurabilidad());

    }

    @Test
    public void usoPicoMaderaContraPiedraYBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();
        Piedra piedra = new Piedra();

        pico.usarContra(piedra);

        Assert.assertEquals(98, pico.obtenerDurabilidad());

    }

    @Test
    public void usoPicoMaderaContraMetalYBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();
        Metal metal = new Metal();

        pico.usarContra(metal);

        Assert.assertEquals(98, pico.obtenerDurabilidad());
    }

    @Test
    public void usoPicoPiedraContraMaderaYBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDePiedra();

        int durabilidadInicial = pico.obtenerDurabilidad();
        Madera madera = new Madera();

        pico.usarContra(madera);
        Assert.assertEquals((durabilidadInicial -= 4/1.5), pico.obtenerDurabilidad());

    }

    @Test
    public void usoPicoPiedraContraPiedraYBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDePiedra();

        int durabilidadInicial = pico.obtenerDurabilidad();
        Piedra piedra = new Piedra();

        pico.usarContra(piedra);

        Assert.assertEquals((durabilidadInicial -= 4/1.5), pico.obtenerDurabilidad());

    }

    @Test
    public void usoPicoPiedraContraMetalYBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDePiedra();

        int durabilidadInicial = pico.obtenerDurabilidad();
        Metal metal = new Metal();

        pico.usarContra(metal);

        Assert.assertEquals((durabilidadInicial -= 4/1.5), pico.obtenerDurabilidad());
    }

    @Test
    public void usoPicoMetalContraMaderaYNoBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMetal();

        int durabilidadInicial = pico.obtenerDurabilidad();
        Madera madera = new Madera();

        pico.usarContra(madera);
        Assert.assertEquals(durabilidadInicial, pico.obtenerDurabilidad());

    }

    @Test
    public void usoPicoMetalContraPiedraYNoBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMetal();

        int durabilidadInicial = pico.obtenerDurabilidad();
        Piedra piedra = new Piedra();

        pico.usarContra(piedra);

        Assert.assertEquals(durabilidadInicial, pico.obtenerDurabilidad());

    }

    @Test
    public void usoPicoMetalContraMetalYNoBajaSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMetal();
        int durabilidadInicial = pico.obtenerDurabilidad();
        Metal metal = new Metal();

        pico.usarContra(metal);

        Assert.assertEquals(durabilidadInicial, pico.obtenerDurabilidad());
    }



    @Test
    public void PicoDeMaderaChocaContraCualquierMaterialYSeDesgasta2puntos(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();

        Material metal = new Metal();

        pico.usarContra(metal);

        Assert.assertEquals(pico.obtenerDurabilidad(), 98);
    }

    @Test
    public void PicoDeMaderaChocaContraUnaPiedraYLeResta2Puntos(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();

        Material piedra = new Piedra();

        pico.usarContra(piedra);

        Assert.assertEquals(piedra.obtenerDurabilidad(), 28);
    }

    @Test
    public void PicoDeMaderaChocaContraUnMetalYNoLeRestDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();

        Material metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();

        pico.usarContra(metal);

        Assert.assertEquals(metal.obtenerDurabilidad(), durabilidadInicial);
    }

    @Test
    public void picoDePiedraChochaContraPiedraYLeDesgasta4PuntosDeDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDePiedra();

        Material piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();

        pico.usarContra(piedra);

        Assert.assertEquals(piedra.obtenerDurabilidad(), durabilidadInicial -4);
    }

    @Test
    public void picoDePiedraChochaContraMetalYLeDesgasta4PuntosDeDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDePiedra();

        Material metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();

        pico.usarContra(metal);

        Assert.assertEquals(metal.obtenerDurabilidad(), durabilidadInicial -4);
    }

    @Test
    public void picoDeMetalChochaContraMetalYNolerestaPuntosDeDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMetal();

        Material metal = new Metal();

        int durabilidadInicial = metal.obtenerDurabilidad();

        pico.usarContra(metal);

        Assert.assertEquals(metal.obtenerDurabilidad(), durabilidadInicial );
    }

    @Test
    public void picoDeMetalChochaContraPiedraYLeResta12PuntosDeDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMetal();

        Material piedra = new Piedra();

        int durabilidadInicial = piedra.obtenerDurabilidad();

        pico.usarContra(piedra);

        Assert.assertEquals(piedra.obtenerDurabilidad(), durabilidadInicial -12);
    }
}
