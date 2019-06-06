package fiuba.algo3.TestEntrega1;


import fiuba.algo3.model.Herramientas.*;
import fiuba.algo3.model.Materiales.*;
import org.junit.Assert;
import org.junit.Test;

public class TestHacha {

    @Test
    public void seCreaHachadeMaderaConDurabilidad100yFuerza2(){

        Hacha hacha = ConstructorHerramientas.construirHachaDeMadera();

        Assert.assertEquals(hacha.obtenerFuerza(), 2);
        Assert.assertEquals(hacha.obtenerDurabilidad(), 100);
    }

    @Test
    public void seCreaHachadePiedraConDurabilidad200yFuerza5(){

        Hacha hacha = ConstructorHerramientas.construirHachaDePiedra();

        Assert.assertEquals(hacha.obtenerFuerza(), 5);
        Assert.assertEquals(hacha.obtenerDurabilidad(), 200);
    }

    @Test
    public void seCreaHachadeMetalConDurabilidad400yFuerza10(){

        Hacha hacha = ConstructorHerramientas.construirHachaDeMetal();

        Assert.assertEquals(hacha.obtenerFuerza(), 10);
        Assert.assertEquals(hacha.obtenerDurabilidad(), 400);
    }



    @Test
    public void usoHachaMaderaContraMaderaYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMadera();

        Madera madera = new Madera();

        hacha.usarContra(madera);
        Assert.assertEquals(98, hacha.obtenerDurabilidad());

    }

    @Test
    public void usoHachaMaderaContraPiedraYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMadera();
        Piedra piedra = new Piedra();

        hacha.usarContra(piedra);

        Assert.assertEquals(98, hacha.obtenerDurabilidad());

    }

    @Test
    public void usoHachaMaderaContraMetalYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMadera();
        Metal metal = new Metal();

        hacha.usarContra(metal);

        Assert.assertEquals(98, hacha.obtenerDurabilidad());
    }

    @Test
    public void usoHachaPiedraContraMaderaYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDePiedra();

        Madera madera = new Madera();

        hacha.usarContra(madera);
        Assert.assertEquals(195, hacha.obtenerDurabilidad());

    }

    @Test
    public void usoHachaPiedraContraPiedraYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDePiedra();
        Piedra piedra = new Piedra();

        hacha.usarContra(piedra);

        Assert.assertEquals(195, hacha.obtenerDurabilidad());

    }

    @Test
    public void usoHachaPiedraContraMetalYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDePiedra();
        Metal metal = new Metal();

        hacha.usarContra(metal);

        Assert.assertEquals(195, hacha.obtenerDurabilidad());
    }

    @Test
    public void usoHachaMetalContraMaderaYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMetal();

        Madera madera = new Madera();

        hacha.usarContra(madera);
        Assert.assertEquals(395, hacha.obtenerDurabilidad());

    }

    @Test
    public void usoHachaMetalContraPiedraYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMetal();
        Piedra piedra = new Piedra();

        hacha.usarContra(piedra);

        Assert.assertEquals(395, hacha.obtenerDurabilidad());

    }

    @Test
    public void usoHachaMetalContraMetalYBajaSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMetal();
        Metal metal = new Metal();

        hacha.usarContra(metal);

        Assert.assertEquals(395, hacha.obtenerDurabilidad());
    }
}

