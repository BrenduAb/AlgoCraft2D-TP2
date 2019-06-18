package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Golpe.Golpeable;
import fiuba.algo3.model.Mapa.Posicion;

public abstract class Material implements Golpeable, IOcupable {
    protected  int durabilidad;
    private Posicion posicion;
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza;
        if (this.durabilidad < 0){
            this.durabilidad = 0;
        }
    }

    public int obtenerDurabilidad(){
        return this.durabilidad;
    }

    @Override
    public void definirPosicion(Posicion nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    @Override
    public Posicion obtenerPosicionActual() {
        return this.posicion;
    }
}
