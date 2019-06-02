package fiuba.algo3.Test-Entrega1;

import junit.framework.Assert;
import org.junit.Test;

public class Tests-Entrega1 {


    @Test
    public void crearHachadeMaderaConDurabilidadyFuerza(){

        Herramienta hacha = new Hacha(Madera madera);
        int durabilidadHachaMaderaInicial = 100;
        int fuerzaHachaMaderaInicial = 2;

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        Assert.assertEquals(durabilidadHachaMaderaInicial, durabilidad);
        Assert.assertEquals(fuerzaHachaMaderaInicial, fuerza);
    }

    @Test
    public void crearPicodeMaderaConDurabilidadyFuerza(){

        Herramienta pico = new Pico(Madera madera);
        int durabilidadPicoMaderaInicial = 100;
        int fuerzaPicoMaderaInicial = 2;

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidadPicoMaderaInicial, durabilidad);
        Assert.assertEquals(fuerzaPicoMaderaInicial, fuerza);
    }

    @Test
    public void crearHachadeMetalConDurabilidadyFuerza(){

        Herramienta hacha = new Hacha(Metal metal);
        int durabilidadHachaMetalInicial = 400;
        int fuerzaHachaMetalInicial = 10;

        int durabilidad = hacha.obtenerDurabilidad();
        int fuerza = hacha.obtenerFuerza();

        Assert.assertEquals(durabilidadHachaMetalInicial, durabilidad);
        Assert.assertEquals(fuerzaHachaMetalInicial, fuerza);
    }

    @Test
    public void crearPicodeMetalConDurabilidadyFuerza(){

        Herramienta pico = new Pico(Metal metal);
        int durabilidadPicoMetalInicial = 400;
        int fuerzaPicoMetalInicial = 12;

        int durabilidad = pico.obtenerDurabilidad();
        int fuerza = pico.obtenerFuerza();

        Assert.assertEquals(durabilidadPicoMetalInicial, durabilidad);
        Assert.assertEquals(fuerzaPicoMetalInicial, fuerza);
    }

    @Test
    public void crearPicoFinoConDurabilidadyFuerza(){

        Herramienta picofino = new Pico(Metal metal, Piedra piedra);
        int durabilidadPicoFinoInicial = 1000;
        int fuerzaPicoFinoInicial = 20;

        int durabilidad = picofino.obtenerDurabilidad();
        int fuerza = picofino.obtenerFuerza();

        Assert.assertEquals(durabilidadPicoFinoInicial, durabilidad);
        Assert.assertEquals(fuerzaPicoFinoInicial, fuerza);
    }



    @Test
    public void usarHachaContraMaterialReduceDurabilidad(){

        Herramienta hacha = new Hacha(Metal metal);
        int durabilidadHachaInicial = hacha.obtenerDurabilidad();

        Madera madera = new Madera;

        //Como lo uso contra el metal?

        int durabilidad = hacha.obtenerDurabilidad();

        Assert.assertEquals(durabilidadHachaInicial -2 , durabilidad);
    }

    @Test
    public void usarPicoContraMaterialReduceDurabilidad(){

        Herramienta pico = new Pico(Piedra piedra);
        int durabilidadPicoInicial = pico.obtenerDurabilidad();

        Piedra piedra = new Piedra;

        //Como lo uso contra el metal?

        int durabilidad = pico.obtenerDurabilidad();

        Assert.assertEquals(durabilidadPicoInicial - (fuerza /1.5) , durabilidad);
    }

    @Test
    public void usarPicoFinoContraDiamanteReduceDurabilidad(){

        Herramienta picofino = new Pico(Metal metal, Piedra piedra);
        int durabilidadPicoFinoInicial = picofino.obtenerDurabilidad();

        Diamante diamante = new Diamante();

        //Como lo uso contra el diamante?

        int durabilidad = picofino.obtenerDurabilidad();

        Assert.assertEquals(durabilidadPicoFinoInicial - (durabilidad * 0.1), durabilidad);
    }

    @Test
    public void usarPicoFinoContraOtroMaterialNoReduceDurabilidad(){

        Herramienta picofino = new Pico(Metal metal, Piedra piedra);
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

        Herramienta hacha = new Hacha(Madera madera);

        Madera madera = new Madera();
        int durabilidadMaterialInicial = madera.obtenerDurabilidad();

        //Como golpeo la madera con el hacha?

        int durabilidad = madera.obtenerDurabilidad();

        Assert.assertEquals(durabilidadMaterialInicial -2, durabilidad);
        //se desgasta 2 porque es la fuerza de la herramienta?
    }
    @Test
    public void golpearPiedraConHachaNoReduceDurabilidadMaterial(){

        Herramienta hacha = new Hacha(Metal metal);
        int durabilidadMaterialInicial = 100;

        Piedra piedra = new Piedra();
        int durabilidadMaterialInicial = piedra.obtenerDurabilidad();

        //Como golpeo la piedra con el hacha?

        int durabilidad = piedra.obtenerDurabilidad();

        Assert.assertEquals(durabilidadMaterialInicial, durabilidad);
    }

    @Test
    public void golpearMetalConPicoDeMaderaNoReduceDurabilidadMaterial(){

        Herramienta pico = new Pico(Madera madera);
        int durabilidadMaterialInicial = 100;

        Metal metal = new Metal();
        int durabilidadMaterialInicial = metal.obtenerDurabilidad();

        //Como golpeo el metal con el pico?

        int durabilidad = metal.obtenerDurabilidad();

        Assert.assertEquals(durabilidadMaterialInicial, durabilidad);
    }

}
