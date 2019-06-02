package fiuba.algo3.model;

import fiuba.algo3.Contratos.IHerramienta;
import fiuba.algo3.Contratos.IMaterial;

public class Pico implements IHerramienta {

    public Pico(Metal metal){

    }

    @Override
    public int obtenerDurabilidad() {
        return 0;
    }

    @Override
    public int obtenerFuerza() {
        return 0;
    }

    @Override
    public void usarContra(IMaterial material) {

    }

    @Override
    public int calcularDanio(Madera madera) {
        return 0;
    }
}
