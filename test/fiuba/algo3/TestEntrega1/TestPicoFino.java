/*package fiuba.algo3.TestEntrega1;

import fiuba.algo3.model.Herramientas.PicoFino;
import fiuba.algo3.model.Materiales.Diamante;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class TestPicoFino {

    @Test
    public void testSeCreaCorrectamentePicoFinoConSuDurabilidadYFuerzaCorrespondiente(){
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        IHerramienta picoFino = new PicoFino(metal, piedra);

        int durabilidadPicoFino = 1000;
        int fuerzaPicoFino = 20;

        Assert.assertNotNull(picoFino);
        Assert.assertEquals(durabilidadPicoFino, picoFino.obtenerDurabilidad());
        Assert.assertEquals(fuerzaPicoFino, picoFino.obtenerFuerza());
    }

    @Test
    public void testPicoFinoSeUsaContraMaderaYSeDesgastaSuDurabilidad(){
        Madera madera = new Madera();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        IHerramienta picoFino = new PicoFino(metal, piedra);

        int durabilidadPicoFino = picoFino.obtenerDurabilidad();

        picoFino.usarContra(madera);

        Assert.assertEquals(durabilidadPicoFino - 100, picoFino.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraPiedraYSeDesgastaSuDurabilidad(){
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        IHerramienta picoFino = new PicoFino(metal, piedra);

        int durabilidadPicoFino = picoFino.obtenerDurabilidad();

        picoFino.usarContra(piedra);

        Assert.assertEquals(durabilidadPicoFino - 100, picoFino.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraMetalYSeDesgastaSuDurabilidad(){
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        IHerramienta picoFino = new PicoFino(metal, piedra);

        int durabilidadPicoFino = picoFino.obtenerDurabilidad();

        picoFino.usarContra(metal);

        Assert.assertEquals(durabilidadPicoFino - 100, picoFino.obtenerDurabilidad());
    }

    @Test
    public void testPicoFinoSeUsaContraDiamanteYSeDesgastaSuDurabilidad(){
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        Diamante diamante = new Diamante();
        IHerramienta picoFino = new PicoFino(metal, piedra);

        int durabilidadPicoFino = picoFino.obtenerDurabilidad();

        picoFino.usarContra(diamante);

        Assert.assertEquals(durabilidadPicoFino - 100, picoFino.obtenerDurabilidad());
    }
}
*/