package fiuba.algo3.TestEntrega1;

import com.sun.java.swing.plaf.motif.MotifTextAreaUI;
import fiuba.algo3.Contratos.IHerramienta;
import fiuba.algo3.model.Hacha;
import fiuba.algo3.model.Madera;
import fiuba.algo3.model.Metal;
import fiuba.algo3.model.Piedra;
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
