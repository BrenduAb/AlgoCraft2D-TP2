package fiuba.algo3.model.Materiales;

import fiuba.algo3.Contratos.IMaterial;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;

public class Diamante implements IMaterial {
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
