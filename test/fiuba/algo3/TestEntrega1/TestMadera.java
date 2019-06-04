package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Materiales.Piedra;
import junit.framework.Assert;
import org.junit.Test;

public class TestMadera {

    @Test
    public void maderaChocaContraHachaDeMaderaYPierde2deDurabilidad(){
        Madera madera = new Madera();
        Hacha hachaDeMadera = new Hacha(madera);

        int durabilidadInicial = madera.obtenerDurabilidad();

        madera.chocarContra(hachaDeMadera);

        Assert.assertEquals(durabilidadInicial - 2,
                madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChocaContraHachaDeMadera2VecesYPierde4Durabilidad(){
        Madera madera = new Madera();
        Hacha hachaDeMadera = new Hacha(madera);

        int durabilidadInicial = madera.obtenerDurabilidad();

        madera.chocarContra(hachaDeMadera);
        madera.chocarContra(hachaDeMadera);

        Assert.assertEquals(durabilidadInicial - 4,
                madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChochaContraHachaDeMetalUnaVezYSeDesgasta10PuntosDeDurabilidad(){
        Madera madera = new Madera();
        Metal metal = new Metal();
        Hacha hachaDeMetal = new Hacha(metal);

        int durabilidadInicial = madera.obtenerDurabilidad();

        madera.chocarContra(hachaDeMetal);

        Assert.assertEquals(durabilidadInicial - 10,
                madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChochaContraHachaDePiedraUnaVezYSeDesgasta5PuntosDeDurabilidad(){
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Hacha hachaDePiedra = new Hacha(piedra);

        int durabilidadInicial = madera.obtenerDurabilidad();

        madera.chocarContra(hachaDePiedra);

        Assert.assertEquals(durabilidadInicial - 5,
                madera.obtenerDurabilidad());
    }

    @Test
    public void maderaChochaContraCualquierPicoYNoSeDesgasta(){
        Madera madera = new Madera();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();

        Pico picoDeMetal = new Pico(metal);
        Pico picoPiedra = new Pico(piedra);
        Pico picoMadera = new Pico(madera);


        int durabilidadInicial = madera.obtenerDurabilidad();

        madera.chocarContra(picoDeMetal);
        madera.chocarContra(picoPiedra);
        madera.chocarContra(picoMadera);

        Assert.assertEquals(durabilidadInicial ,
                madera.obtenerDurabilidad());
    }
}
