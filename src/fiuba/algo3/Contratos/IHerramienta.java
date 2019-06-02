package fiuba.algo3.Contratos;

import fiuba.algo3.model.Madera;
import fiuba.algo3.model.Metal;

public interface IHerramienta{
    public  int obtenerDurabilidad();
    public  int obtenerFuerza();
    public void usarContra(IMaterial material);
    public int calcularDanio(Madera madera);

}