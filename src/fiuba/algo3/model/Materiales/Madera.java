package fiuba.algo3.model.Materiales;

import fiuba.algo3.Contratos.IMaterial;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;

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
