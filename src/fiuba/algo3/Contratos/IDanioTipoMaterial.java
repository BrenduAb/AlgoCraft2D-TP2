package fiuba.algo3.Contratos;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;

public interface IDanioTipoMaterial {
    public int obtenerDanio(PicoFino madera);
    public  int obtenerDanio(Hacha diamante);
    public  int obtenerDanio(Pico metal);
}
