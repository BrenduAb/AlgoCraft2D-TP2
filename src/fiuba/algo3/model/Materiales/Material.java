package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;

public abstract class Material {
    protected  int durabilidad;

    public abstract void chocarContra(Hacha hacha, Madera madera);
    public abstract void chocarContra(Hacha hacha, Piedra piedra);
    public abstract void chocarContra(Hacha hacha, Metal metal);


    public abstract void chocarContra(Pico pico, Madera Madera);
    public abstract void chocarContra(Pico pico, Piedra piedra);
    public abstract void chocarContra(Pico pico, Metal metal);


    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza;
    }

    public int obtenerDurabilidad(){
        return this.durabilidad;
    }
}
