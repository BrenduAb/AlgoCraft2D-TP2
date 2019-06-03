package fiuba.algo3.model;

import fiuba.algo3.Contratos.IMaterial;

public class Piedra implements IMaterial {
    @Override
    public void chocarContra(Hacha hacha) {

    }

    @Override
    public void chocarContra(Pico pico) {

    }

    @Override
    public void chocarContra(PicoFino picoFino) {

    }

    @Override
    public int obtenerDurabilidad() {
        return 0;
    }
}
