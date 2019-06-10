package fiuba.algo3.model.Jugador;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;

public class Jugador implements IOcupable {

    Inventario inventario = new Inventario();
    Posicion posicion = null;

    public Jugador() {
        IGuardable hachaMadera = ConstructorHerramientas.construirPicoDeMadera();
        this.inventario.agregarAlInventario(hachaMadera);
    }

    public int obtenerCantidadDeObjetosDelInventario() {
        return this.inventario.obtenerCantidadDeObjetos();
    }

    @Override
    public void definirPosicion(Posicion nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    public Posicion obtenerPosicionActual() {
        return this.posicion;
    }

    public void moverHaciaLaDerecha() {
        Posicion posicionActual = this.posicion;
        Posicion nuevPosicion = new Posicion(this.posicion.x() + 1, this.posicion.y());
        Mapa mapa = Mapa.getInstance();;
        mapa.ocuparTerreno(nuevPosicion, this);
        mapa.liberarTerreno(posicionActual);
    }
    public void moverHaciaLaIzquierda() {
        Posicion posicionActual = this.posicion;
        Posicion nuevPosicion = new Posicion(this.posicion.x() - 1, this.posicion.y());
        Mapa mapa = Mapa.getInstance();;
        mapa.ocuparTerreno(nuevPosicion, this);
        mapa.liberarTerreno(posicionActual);
    }
}
