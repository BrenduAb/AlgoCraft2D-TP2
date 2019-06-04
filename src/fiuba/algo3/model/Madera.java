package fiuba.algo3.model;

import fiuba.algo3.Contratos.IHerramienta;
import fiuba.algo3.Contratos.IMaterial;

public class Madera implements IMaterial {

    public int durabilidad = 10;

    @Override
    public void chocarContra(Hacha hacha) {
        this.durabilidad -= hacha.calcularDanio(this);
    }

    @Override
    public void chocarContra(Pico pico) {

    }

    @Override
    public void chocarContra(PicoFino picoFino) {

    }

    @Override
    public int obtenerDurabilidad() {
        return this.durabilidad;
    }
}