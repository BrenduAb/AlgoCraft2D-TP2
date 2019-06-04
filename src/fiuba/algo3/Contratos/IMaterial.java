package fiuba.algo3.Contratos;

import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;
import fiuba.algo3.model.Herramientas.PicoFino;

public interface IMaterial {
    public void chocarContra(Hacha hacha);
    public void chocarContra(Pico pico);
    public void chocarContra(PicoFino picoFino);
    public  int obtenerDurabilidad();
}
