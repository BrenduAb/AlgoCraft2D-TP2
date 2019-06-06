package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Materiales.Piedra;
import junit.framework.Assert;
import org.junit.Test;

public class TestMadera {

    @Test
    public void maderaIniciaCon10DeDurabilidad(){
        Madera madera = new Madera();

        Assert.assertEquals(10, madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnHachaYSeReduceSuDurabilidad(){
        Hacha hacha = ConstructorHerramientas.construirHachaDeMadera();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        hacha.usarContra(madera);

        Assert.assertEquals(durabilidadInicial -2, madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaConUnPicoYNoSeReduceSuDurabilidad(){
        Pico pico = ConstructorHerramientas.construirPicoDeMadera();
        Madera madera = new Madera();

        int durabilidadInicial = madera.obtenerDurabilidad();
        pico.usarContra(madera);

        Assert.assertEquals(durabilidadInicial, madera.obtenerDurabilidad());
    }

}
