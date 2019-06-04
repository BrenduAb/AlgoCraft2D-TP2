package fiuba.algo3.model.DanioTipoMaterial;

import fiuba.algo3.Contratos.IDanioTipoMaterial;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;

public class DanioMetal implements IDanioTipoMaterial {
    @Override
    public int obtenerDanio(PicoFino picoFino) {
        return 0;
    }

    @Override
    public int obtenerDanio(Hacha hacha) {
        return hacha.obtenerFuerza();
    }

    @Override
    public int obtenerDanio(Pico pico) {
        return 0;
    }
}
