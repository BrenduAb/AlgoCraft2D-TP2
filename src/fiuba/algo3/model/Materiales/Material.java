package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Golpe.Golpeable;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;

public abstract class Material implements Golpeable {
    protected  int durabilidad;

    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza;
    }

    public int obtenerDurabilidad(){
        return this.durabilidad;
    }
}
