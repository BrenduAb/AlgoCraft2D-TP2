package fiuba.algo3.Contratos;

import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;

public interface IHerramienta{
    public  int obtenerDurabilidad();
    public  int obtenerFuerza();
    public void usarContra(IMaterial material);
    public int calcularDanio(Madera madera);
    public int calcularDanio(Piedra piedra);
    public int calcularDanio(Metal piedra);
}