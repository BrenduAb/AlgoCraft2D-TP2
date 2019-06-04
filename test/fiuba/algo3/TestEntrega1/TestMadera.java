package fiuba.algo3.TestEntrega1;

import com.sun.java.swing.plaf.motif.MotifTextAreaUI;
import fiuba.algo3.Contratos.IHerramienta;
import fiuba.algo3.model.Hacha;
import fiuba.algo3.model.Madera;
import fiuba.algo3.model.Metal;
import fiuba.algo3.model.Pico;
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
    public void maderaChochaContraUnPicoYNoSeDesgasta(){
        Madera madera = new Madera();
        Metal metal = new Metal();
        Pico picoDeMetal = new Pico(metal);

        int durabilidadInicial = madera.obtenerDurabilidad();

        madera.chocharContra(picoDeMetal);

        Assert.assertEquals(durabilidadInicial ,
                madera.obtenerDurabilidad());
    }
}
