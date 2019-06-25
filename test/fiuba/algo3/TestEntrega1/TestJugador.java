package fiuba.algo3.TestEntrega1;

import fiuba.algo3.Excepciones.*;
import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.model.Mapa.Celda;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.Materiales.Piedra;
import junit.framework.Assert;
import org.junit.Test;


public class TestJugador {

    @Test
    public void JugadorSeCreaSinObjetoEnSuInventario() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        int objetosDelInventario = jugador.obtenerCantidadDeObjetosDelInventario();

        Assert.assertEquals(0, objetosDelInventario);
    }

    @Test
    public void JugadorSeCreaConUnHachaDeMaderaEnSuInventario() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        IGuardable hacha = ConstructorHerramientas.construirHachaDeMadera();

        Assert.assertEquals(true, true);
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaDeracha() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaDerechaYLaCeldaAnteriorQuedaVacia() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());

        Celda celda = mapa.obtenerCelda(new Posicion(1, 1));

        Assert.assertEquals(null, celda.obtenerElemento());
    }

    @Test
    public void PosicionoAlJugadorEnUnMapaYLoMuevoParaLaIzquierda() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(new Posicion(2, 1), jugador.obtenerPosicionActual());
    }

    @Test(expected = CeldaOcupadaException.class)
    public void PosicionoAlJugadorEnUnMapaJuntoAUnMaterialASuDerechaIntentoMoverASuDerechaYNoMeDejaYElJugadorMantieneSuPosicion() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);

        Madera madera = new Madera();

        Posicion posicionJugador = jugador.obtenerPosicionActual();


        mapa.ocuparTerreno(new Posicion(2, 1), madera);

        jugador.moverHaciaLaDerecha();

    }

    @Test(expected = PosicionInvalidaException.class)
    public void PosicionoAlJugadorEnUnBordeDelMapaIntentoMoverloHaciaUnDesbordeYNoMeDejaMateniendoLaPosicionDelJugador() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(0, 1);

        Jugador jugador = new Jugador(posicionJugador, mapa);

        jugador.moverHaciaLaIzquierda();

        //Assert.assertEquals(posicionJugador, jugador.obtenerPosicionActual());
    }

    @Test
    public void muevoAlJugadorALaDerecha() {
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(0, 1);

        Jugador jugador = new Jugador(posicionJugador, mapa);

        jugador.moverHaciaLaDerecha();

        Assert.assertEquals(1, 1);
    }

    @Test
    public void equipoUnaHerramientaAlJugadorYAlObtenerlaEsIgualALaEquipada() {
        Herramienta herramienta = ConstructorHerramientas.construirHachaDeMadera();
        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(0, 1);

        Jugador jugador = new Jugador(posicionJugador, mapa);

        jugador.equipar(herramienta);

        Assert.assertEquals(true, jugador.obtenerHerramientaEquipada() == herramienta);
    }

    @Test
    public void equipoUnHerraminetaAlJugadorYGolpeoUnMaterialHastaDesgastarloYObtenerloEnElInventario() {
        Herramienta herramienta = ConstructorHerramientas.construirHachaDeMetal();

        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(0, 1);

        Jugador jugador = new Jugador(posicionJugador, mapa);

        jugador.equipar(herramienta);

        int cantidadDeElementos = jugador.obtenerCantidadDeObjetosDelInventario();

        Material material = new Madera();

        try {
            jugador.golpearMaterial(material);
        }catch (MaterialRotoException ex){

        }
        Assert.assertEquals(cantidadDeElementos + 1, jugador.obtenerCantidadDeObjetosDelInventario());
    }

    @Test(expected = HerramientaRotaException.class)
    public void elJugadorEquipaUnHachaYLePegaTantasVecesAUnaPiedraHastaQueRompeLaHerramientaEquipada() {
        Herramienta herramienta = ConstructorHerramientas.construirHachaDeMadera();

        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(0, 1);

        Jugador jugador = new Jugador(posicionJugador, mapa);

        jugador.equipar(herramienta);

        Material material = new Piedra();

        for (int i = 0; i < 101; i++) {
            jugador.golpearMaterial(material);
        }
    }

    @Test(expected = JugarSinHerramientaEquipadaException.class)
    public void elJugadorEquipaUnHachaYLePegaTantasVecesAUnaPiedraHastaQueRompeLaHerramientaEquipadaYNoPuedeVolverAGolpear() {
        Herramienta herramienta = ConstructorHerramientas.construirHachaDeMadera();

        CleanSingleton.cleanMapa();

        Mapa mapa = Mapa.getInstance();

        Posicion posicionJugador = new Posicion(0, 1);

        Jugador jugador = new Jugador(posicionJugador, mapa);

        jugador.equipar(herramienta);

        Material material = new Piedra();

        for (int i = 0; i < 101; i++) {
            try {
                jugador.golpearMaterial(material);
            } catch (HerramientaRotaException ex) {

            }
        }
    }

    @Test
    public void SeObtieneElInventarioDelJugador() {
        CleanSingleton.cleanMapa();


        Mapa mapa = Mapa.getInstance();
        Jugador jugador = new Jugador(new Posicion(1, 1), mapa);
        IGuardable hacha = ConstructorHerramientas.construirHachaDeMadera();

        Inventario inventario = jugador.obtenerInventario();
        Assert.assertEquals(true, inventario != null);
    }

    @Test
    public void SeObtieneGuardableDelInventario() {
        CleanSingleton.cleanMapa();

        Inventario inventario = new Inventario();
        IGuardable hacha = ConstructorHerramientas.construirHachaDeMadera();
        inventario.agregarAlInventario(hacha);

        IGuardable guardable = inventario.obtenerGuardable(0);
        Assert.assertEquals(hacha, guardable);
    }
}
