package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Materiales.Madera;
import junit.framework.Assert;
import org.junit.Test;

public class TestHacha {
/*
    @Test
    public void crearHachadeMaderaConDurabilidadInicial100yFuerzaInicial2(){
        Madera madera = new Madera();

        Herramienta hacha = new Hacha(madera);

        int durabilidadHachaMaderaInicial = 100;
        int fuerzaHachaMaderaInicial = 2;

        int durabilidad = hacha.obtenerDurabilidad();

        Assert.assertEquals(durabilidadHachaMaderaInicial, durabilidad);
    }

    @Test
    public void crearHachadeMetalConDurabilidadInicia400yFuerzaInicial0(){
        Metal metal = new Metal();

        IHerramienta hacha = new Hacha(metal);
        int durabilidadHachaMetalInicial = 400;
        int fuerzaHachaMetalInicial = 10;

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        Assert.assertEquals(durabilidadHachaMetalInicial, durabilidad);
        Assert.assertEquals(fuerzaHachaMetalInicial, fuerza);
    }
*/
    @Test
    public void usoHachaMaderaContraUnMaterialYbajaSuDurabilidad(){
        Madera madera = new Madera();

        Herramienta hacha = new Hacha(madera);

        hacha.usarContra(madera);

        Assert.assertEquals(98, hacha.obtenerDurabilidad());
    }

    @Test
    public void usoHachaMaderaContraUnaMaderaYLaMaderaSeDesgasta2PuntosDeDurabilidad(){
        Madera madera = new Madera();

        Herramienta hacha = new Hacha(madera);

        hacha.usarContra(madera);

        Assert.assertEquals(8, madera.obtenerDurabilidad());
    }


}

