package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;

public class Piedra extends Material {

    public Piedra(){
        this.durabilidad = 30;
    }

    @Override
    public void chocarContra(Hacha hacha, Madera madera) {

    }

    @Override
    public void chocarContra(Hacha hacha, Piedra piedra) {

    }

    @Override
    public void chocarContra(Hacha hacha, Metal metal) {

    }

    @Override
    public void chocarContra(Pico pico, Madera Madera) {

    }

    @Override
    public void chocarContra(Pico pico, Piedra piedra) {

    }

    @Override
    public void chocarContra(Pico pico, Metal metal) {

    }
}
