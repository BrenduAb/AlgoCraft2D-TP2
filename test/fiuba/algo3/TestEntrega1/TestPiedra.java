package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Piedra;
import junit.framework.Assert;
import org.junit.Test;

public class TestPiedra {

    @Test
    public void piedraChocaConUnHachaYNoSeReduceSuDurabilidad(){
        Piedra piedra = new Piedra();
        Madera madera = new Madera();
        Hacha hacha = new Hacha(madera);
        int durabilidadInicial = 30;
        piedra.chocarContra(hacha);

        Assert.assertEquals(durabilidadInicial,
                piedra.obtenerDurabilidad());
    }
}
