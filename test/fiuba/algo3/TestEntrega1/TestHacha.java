package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Materiales.*;
import org.junit.Assert;
import org.junit.Test;

public class TestHacha {

    @Test
    public void seCreaHachadeMaderaCorrectamenteConSuDurabilidadYFuerzaCorrespondiente(){
        int fuerzaHachaMadera = 2;
        int durabilidadHachaMadera = 100;

        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();

        Assert.assertNotNull(hachaMadera);
        Assert.assertEquals(fuerzaHachaMadera, hachaMadera.obtenerFuerza());
        Assert.assertEquals(durabilidadHachaMadera, hachaMadera.obtenerDurabilidad());
    }

    @Test
    public void seCreaHachadePiedraConSuDurabilidadYFuerzaCorrespondiente(){
        int fuerzaHachaPiedra = 5;
        int durabilidadHachaPiedra = 200;

        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();

        Assert.assertEquals(fuerzaHachaPiedra, hachaPiedra.obtenerFuerza());
        Assert.assertEquals(durabilidadHachaPiedra, hachaPiedra.obtenerDurabilidad());
    }

    @Test
    public void seCreaHachadeMetalConSuDurabilidadYFuerzaCorrespondiente(){
        int fuerzaHachaMetal = 10;
        int durabilidadHachaMetal = 400;

        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();

        Assert.assertEquals(fuerzaHachaMetal, hachaMetal.obtenerFuerza());
        Assert.assertEquals(durabilidadHachaMetal, hachaMetal.obtenerDurabilidad());
    }



    @Test
    public void usoHachaMaderaContraMaderaYBajaSuDurabilidad(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        int durabilidadHachaMadera = hachaMadera.obtenerDurabilidad();
        int desgasteHachaMadera= hachaMadera.obtenerFuerza();
        Madera madera = new Madera();

        hachaMadera.usarContra(madera);

        Assert.assertEquals(durabilidadHachaMadera-desgasteHachaMadera, hachaMadera.obtenerDurabilidad());
    }

    @Test
    public void usoHachaMaderaContraPiedraYBajaSuDurabilidad(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        int durabilidadHachaMadera = hachaMadera.obtenerDurabilidad();
        int desgasteHachaMadera= hachaMadera.obtenerFuerza();
        Piedra piedra = new Piedra();

        hachaMadera.usarContra(piedra);

        Assert.assertEquals(durabilidadHachaMadera-desgasteHachaMadera, hachaMadera.obtenerDurabilidad());
    }

    @Test
    public void usoHachaMaderaContraMetalYBajaSuDurabilidad(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        int durabilidadHachaMadera = hachaMadera.obtenerDurabilidad();
        int desgasteHachaMadera= hachaMadera.obtenerFuerza();
        Metal metal = new Metal();

        hachaMadera.usarContra(metal);

        Assert.assertEquals(durabilidadHachaMadera-desgasteHachaMadera, hachaMadera.obtenerDurabilidad());
    }

    @Test
    public void usoHachaPiedraContraMaderaYBajaSuDurabilidad(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        int durabilidadHachaPiedra = hachaPiedra.obtenerDurabilidad();
        int desgasteHachaPiedra = hachaPiedra.obtenerFuerza();
        Madera madera = new Madera();

        hachaPiedra.usarContra(madera);

        Assert.assertEquals(durabilidadHachaPiedra-desgasteHachaPiedra, hachaPiedra.obtenerDurabilidad());
    }

    @Test
    public void usoHachaPiedraContraPiedraYBajaSuDurabilidad(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        int durabilidadHachaPiedra = hachaPiedra.obtenerDurabilidad();
        int desgasteHachaPiedra = hachaPiedra.obtenerFuerza();
        Piedra piedra = new Piedra();

        hachaPiedra.usarContra(piedra);

        Assert.assertEquals(durabilidadHachaPiedra-desgasteHachaPiedra, hachaPiedra.obtenerDurabilidad());

    }

    @Test
    public void usoHachaPiedraContraMetalYBajaSuDurabilidad(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        int durabilidadHachaPiedra = hachaPiedra.obtenerDurabilidad();
        int desgasteHachaPiedra = hachaPiedra.obtenerFuerza();
        Metal metal = new Metal();

        hachaPiedra.usarContra(metal);

        Assert.assertEquals(durabilidadHachaPiedra-desgasteHachaPiedra, hachaPiedra.obtenerDurabilidad());
    }

    @Test
    public void usoHachaMetalContraMaderaYBajaSuDurabilidad(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        int durabilidadHachaMetal = hachaMetal.obtenerDurabilidad();
        int desgasteHachaMetal = hachaMetal.obtenerFuerza()/2;
        Madera madera = new Madera();

        hachaMetal.usarContra(madera);

        Assert.assertEquals(durabilidadHachaMetal-desgasteHachaMetal, hachaMetal.obtenerDurabilidad());

    }

    @Test
    public void usoHachaMetalContraPiedraYBajaSuDurabilidad(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        int durabilidadHachaMetal = hachaMetal.obtenerDurabilidad();
        int desgasteHachaMetal = hachaMetal.obtenerFuerza()/2;
        Piedra piedra = new Piedra();

        hachaMetal.usarContra(piedra);

        Assert.assertEquals(durabilidadHachaMetal-desgasteHachaMetal, hachaMetal.obtenerDurabilidad());

    }

    @Test
    public void usoHachaMetalContraMetalYBajaSuDurabilidad(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        int durabilidadHachaMetal = hachaMetal.obtenerDurabilidad();
        int desgasteHachaMetal = hachaMetal.obtenerFuerza()/2;        Metal metal = new Metal();

        hachaMetal.usarContra(metal);

        Assert.assertEquals(durabilidadHachaMetal-desgasteHachaMetal, hachaMetal.obtenerDurabilidad());
    }

    @Test
    public void hachaDeMaderaSeUsaContraCualquierMaterial49VecesYNoSeRompe(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Material metal = new Metal();

        int durabilidadInicialHachaMadera = hachaMadera.obtenerDurabilidad();

        for(int i = 1; i <= 49; i++) {
            hachaMadera.usarContra(metal);
        }

        Assert.assertNotSame(durabilidadInicialHachaMadera, hachaMadera.obtenerDurabilidad());
        Assert.assertNotSame(0, hachaMadera.obtenerDurabilidad());
    }

    @Test
    public void hachaDeMaderaSeUsaContraCualquierMaterial50VecesYSeRompe(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Material madera = new Madera();

        for(int i = 1; i <= 50; i++) {
            hachaMadera.usarContra(madera);
        }

        Assert.assertEquals(0, hachaMadera.obtenerDurabilidad());
    }

    @Test
    public void hachaDeMaderaSeUsaContraCualquierMaterialMasDe50VecesYSigueRota(){
        Hacha hachaMadera = ConstructorHerramientas.construirHachaDeMadera();
        Material piedra = new Piedra();

        for(int i = 1; i <= 60; i++) {
            hachaMadera.usarContra(piedra);
        }

        Assert.assertEquals(0, hachaMadera.obtenerDurabilidad());
    }

    @Test
    public void hachaDePiedraSeUsaContraCualquierMaterial39VecesYNoSeRompe(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        Material piedra = new Piedra();

        int durabilidadInicialHachaPiedra = hachaPiedra.obtenerDurabilidad();

        for(int i = 1; i <= 39; i++) {
            hachaPiedra.usarContra(piedra);
        }

        Assert.assertNotSame(durabilidadInicialHachaPiedra, hachaPiedra.obtenerDurabilidad());
        Assert.assertNotSame(0, hachaPiedra.obtenerDurabilidad());
    }

    @Test
    public void hachaDePiedraSeUsaContraCualquierMaterial40VecesYSeRompe(){
        Hacha hachaPiedra = ConstructorHerramientas.construirHachaDePiedra();
        Material diamante = new Diamante();

        for(int i = 1; i <= 40; i++) {
            hachaPiedra.usarContra(diamante);
        }

        Assert.assertEquals(0, hachaPiedra.obtenerDurabilidad());
    }

    @Test
    public void hachaDeMetalSeUsaContraCualquierMaterial79VecesYNoSeRompe(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        Material metal = new Metal();

        int durabilidadInicialHachaMetal = hachaMetal.obtenerDurabilidad();

        for(int i = 1; i <= 79; i++) {
            hachaMetal.usarContra(metal);
        }

        Assert.assertNotSame(durabilidadInicialHachaMetal, hachaMetal.obtenerDurabilidad());
        Assert.assertNotSame(0, hachaMetal.obtenerDurabilidad());
    }

    @Test
    public void hachaDeMetalSeUsaContraCualquierMaterial80VecesYSeRompe(){
        Hacha hachaMetal = ConstructorHerramientas.construirHachaDeMetal();
        Material madera = new Madera();

        for(int i = 1; i <= 80; i++) {
            hachaMetal.usarContra(madera);
        }

        Assert.assertEquals(0, hachaMetal.obtenerDurabilidad());
    }
}

