package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Pico;
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
