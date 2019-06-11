package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Golpe.Golpeable;
import fiuba.algo3.model.Contratos.IOcupable;
import fiuba.algo3.model.Mapa.Posicion;

public abstract class Material implements Golpeable, IOcupable {
    protected  int durabilidad;

    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza;
    }

    public int obtenerDurabilidad(){
        return this.durabilidad;
    }

    @Override
    public void definirPosicion(Posicion nuevaPosicion) {

    }
}
