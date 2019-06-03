package fiuba.algo3.Contratos;

import fiuba.algo3.model.Hacha;
import fiuba.algo3.model.Pico;
import fiuba.algo3.model.PicoFino;

public interface IMaterial {
    public void chocarContra(Hacha hacha);
    public void chocarContra(Pico pico);
    public void chocarContra(PicoFino picoFino);
    public  int obtenerDurabilidad();
}
