package fiuba.algo3.model.Jugador;

import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;

public class Jugador implements IOcupable {

    Inventario inventario = new Inventario();
    Posicion posicion = null;
    Mapa mapa;


    public Jugador(Posicion posicionInicial, Mapa mapa) {
        IGuardable hachaMadera = ConstructorHerramientas.construirPicoDeMadera();

        this.mapa = mapa;
        this.inventario.agregarAlInventario(hachaMadera);
        this.mapa.ocuparTerreno(posicionInicial, this);
    }

    public int obtenerCantidadDeObjetosDelInventario() {
        return this.inventario.obtenerCantidadDeObjetos();
    }

    @Override
    public void definirPosicion(Posicion nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    @Override
    public Posicion obtenerPosicion() {
        return this.posicion;
    }

    public Posicion obtenerPosicionActual() {
        return this.posicion;
    }

    public void moverHaciaLaDerecha() {
        Posicion nuevPosicion = new Posicion(this.posicion.x() + 1, this.posicion.y());
        this.mapa.moverOcupable(this,nuevPosicion);
    }

    public void moverHaciaLaIzquierda() {
        Posicion nuevPosicion = new Posicion(this.posicion.x() - 1, this.posicion.y());
        this.mapa.moverOcupable(this,nuevPosicion);
    }

    public void moverHaciAbajo() {
        Posicion nuevPosicion = new Posicion(this.posicion.x() , this.posicion.y() -1);
        this.mapa.moverOcupable(this,nuevPosicion);
    }

    public void moverHaciArriba() {
        Posicion nuevPosicion = new Posicion(this.posicion.x() , this.posicion.y() +1);
        this.mapa.moverOcupable(this,nuevPosicion);
    }
}
