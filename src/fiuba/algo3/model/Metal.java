package fiuba.algo3.model;

import fiuba.algo3.Contratos.IMaterial;

public class Metal implements IMaterial {
    @Override
    public void chocarContra(Hacha herramienta) {

    }

    @Override
    public void chocharContra(Pico pico) {

    }

    @Override
    public int obtenerDurabilidad() {
        return 0;
    }
}
