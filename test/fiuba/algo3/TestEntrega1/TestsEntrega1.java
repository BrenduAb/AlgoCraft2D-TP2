/*package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Contratos.IHerramienta;
import junit.framework.Assert;
import org.junit.Test;

public class TestsEntrega1 {




    @Test
    public void crearPicodeMaderaConDurabilidadyFuerza(){

        IHerramienta pico = new Pico(Madera madera);
        int durabilidadPicoMaderaInicial = 100;
        int fuerzaPicoMaderaInicial = 2;

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidadPicoMaderaInicial, durabilidad);
        Assert.assertEquals(fuerzaPicoMaderaInicial, fuerza);
    }

    @Test
    public void crearPicodeMetalConDurabilidadyFuerza(){

        IHerramienta pico = new Pico(Metal metal);
        int durabilidadPicoMetalInicial = 400;
        int fuerzaPicoMetalInicial = 12;

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidadPicoMetalInicial, durabilidad);
        Assert.assertEquals(fuerzaPicoMetalInicial, fuerza);
    }

    @Test
    public void crearPicoFinoConDurabilidadyFuerza(){

        IHerramienta picofino = new Pico(Metal metal, Piedra piedra);
        int durabilidadPicoFinoInicial = 1000;
        int fuerzaPicoFinoInicial = 20;

        int durabilidad = picofino.obtenerDurabilidad();
        int fuerza = picofino.obtenerFuerza();

        Assert.assertEquals(durabilidadPicoFinoInicial, durabilidad);
        Assert.assertEquals(fuerzaPicoFinoInicial, fuerza);
    }



    @Test
    public void usarHachaContraMaterialReduceDurabilidad(){

        HerraIHerramientamienta hacha = new Hacha(Metal metal);
        int durabilidadHachaInicial = hacha.obtenerDurabilidad();

        Madera madera = new Madera;

        //Como lo uso contra el metal?

        int durabilidad = hacha.obtenerDurabilidad();

        Assert.assertEquals(durabilidadHachaInicial -2 , durabilidad);
    }

    @Test
    public void usarPicoContraMaterialReduceDurabilidad(){

        IHerramienta pico = new Pico(Piedra piedra);
        int durabilidadPicoInicial = pico.obtenerDurabilidad();

        Piedra piedra = new Piedra;

        //Como lo uso contra el metal?

        int durabilidad = pico.obtenerDurabilidad();

        Assert.assertEquals(durabilidadPicoInicial - (fuerza /1.5) , durabilidad);
    }

    @Test
    public void usarPicoFinoContraDiamanteReduceDurabilidad(){

        IHerramienta picofino = new Pico(Metal metal, Piedra piedra);
        int durabilidadPicoFinoInicial = picofino.obtenerDurabilidad();

        Diamante diamante = new Diamante();

        //Como lo uso contra el diamante?

        int durabilidad = picofino.obtenerDurabilidad();

        Assert.assertEquals(durabilidadPicoFinoInicial - (durabilidad * 0.1), durabilidad);
    }

    @Test
    public void usarPicoFinoContraOtroMaterialNoReduceDurabilidad(){

        IHerramienta picofino = new Pico(Metal metal, Piedra piedra);
        int durabilidadPicoFinoInicial = picofino.obtenerDurabilidad();

        Metal metal = new Metal();

        //Como lo uo contra el metal?

        int durabilidad = picofino.obtenerDurabilidad();

        Assert.assertEquals(durabilidadPicoFinoInicial, durabilidad);
    }

    @Test
    public void crearJugador(){

        Jugador jugador = new Jugador();

        //Que pruebo aca?
        Assert.assertEquals(durabilidadPicoFinoInicial, durabilidad);
        Assert.assertEquals(fuerzaPicoFinoInicial, fuerza);
    }



    @Test
    public void golpearMaderaConHachaDeMaderaReduceDurabilidadMaterial(){

        IHerramienta hacha = new Hacha(Madera madera);

        Madera madera = new Madera();
        int durabilidadMaterialInicial = madera.obtenerDurabilidad();

        //Como golpeo la madera con el hacha?

        int durabilidad = madera.obtenerDurabilidad();

        Assert.assertEquals(durabilidadMaterialInicial -2, durabilidad);
        //se desgasta 2 porque es la fuerza de la herramienta?
    }
    @Test
    public void golpearPiedraConHachaNoReduceDurabilidadMaterial(){

        IHerramienta hacha = new Hacha(Metal metal);
        int durabilidadMaterialInicial = 100;

        Piedra piedra = new Piedra();
        int durabilidadMaterialInicial = piedra.obtenerDurabilidad();

        //Como golpeo la piedra con el hacha?

        int durabilidad = piedra.obtenerDurabilidad();

        Assert.assertEquals(durabilidadMaterialInicial, durabilidad);
    }

    @Test
    public void golpearMetalConPicoDeMaderaNoReduceDurabilidadMaterial(){

        IHerramienta pico = new Pico(Madera madera);
        int durabilidadMaterialInicial = 100;

        Metal metal = new Metal();
        int durabilidadMaterialInicial = metal.obtenerDurabilidad();

        //Como golpeo el metal con el pico?

        int durabilidad = metal.obtenerDurabilidad();

        Assert.assertEquals(durabilidadMaterialInicial, durabilidad);
    }

}
*/