package fiuba.algo3.Contratos;

import fiuba.algo3.model.Hacha;
import fiuba.algo3.model.Pico;

public interface IMaterial {
    public void chocarContra(Hacha hacha);
    public void chocharContra(Pico pico);
    public  int obtenerDurabilidad();
}
