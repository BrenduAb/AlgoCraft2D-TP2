package fiuba.algo3.model;

import fiuba.algo3.Contratos.IMaterial;

public class Piedra implements IMaterial {

    private int durabilidad = 30;

    @Override
    public void chocarContra(Hacha hacha) {

    }

    @Override
    public void chocharContra(Pico pico) {

    }

    @Override
    public int obtenerDurabilidad() {
        return durabilidad;
    }
}
