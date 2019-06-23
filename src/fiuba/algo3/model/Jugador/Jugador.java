package fiuba.algo3.model.Jugador;

import fiuba.algo3.Excepciones.HerramientaRotaException;
import fiuba.algo3.Excepciones.JugarSinHerramientaEquipadaException;
import fiuba.algo3.Excepciones.MaterialRotoException;
import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Mapa;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;

public class Jugador implements IOcupable {

    Inventario inventario = new Inventario();
    Posicion posicion = null;
    Mapa mapa;
    Herramienta herramientaEquipada;

    public Jugador(Posicion posicionInicial, Mapa mapa) {
        IGuardable hachaMadera = ConstructorHerramientas.construirHachaDeMadera();

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
    public Posicion obtenerPosicionActual() {
        return this.posicion;
    }

    public void moverHaciaLaDerecha() {
        this.mapa.moverOcupable(this, this.posicion.posicionSiguienteDerecha());
    }

    public void moverHaciaLaIzquierda() {
        this.mapa.moverOcupable(this, this.posicion.posicionSiguienteIzquierda());
    }

    public void moverHaciAbajo() {
        this.mapa.moverOcupable(this, this.posicion.posicionSiguienteAbajo());
    }

    public void moverHaciArriba() {
        this.mapa.moverOcupable(this, this.posicion.posicionSiguienteArriba());
    }

    public void equipar(Herramienta herramienta) {
        this.herramientaEquipada = herramienta;
    }

    public Herramienta obtenerHerramientaEquipada() {
        return this.herramientaEquipada;
    }

    public void golpearMaterial(Material material) {
        try {
            if (this.herramientaEquipada == null) {
                throw new JugarSinHerramientaEquipadaException();
            }
            this.herramientaEquipada.usarContra(material);
        } catch (MaterialRotoException ex) {
            this.inventario.agregarAlInventario(material);
            throw ex;
        } catch (HerramientaRotaException ex) {
            this.herramientaEquipada = null;
            throw ex;
        }
    }

    public Inventario obtenerInventario(){
        return this.inventario;
    }
}
