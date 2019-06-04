package fiuba.algo3.model.DanioTipoMaterial;

import fiuba.algo3.Contratos.IDanioTipoMaterial;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;

public class DanioDiamante implements IDanioTipoMaterial {
    @Override
    public int obtenerDanio(PicoFino picoFino) {
        return picoFino.obtenerFuerza();
    }

    @Override
    public int obtenerDanio(Hacha diamante) {
        return 0;
    }

    @Override
    public int obtenerDanio(Pico metal) {
        return 0;
    }
}
