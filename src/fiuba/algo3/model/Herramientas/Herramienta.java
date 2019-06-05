package fiuba.algo3.model.Herramientas;

import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.Materiales.Piedra;

public abstract class Herramienta {
    protected Material material;
    protected  int durabilidad;
    public abstract void usarContra(Madera materialARecolectar);
    public abstract void usarContra(Piedra materialARecolectar);

    public abstract void desgastar(int danio);
    public  int obtenerDurabilidad(){
        return this.durabilidad;
    }
}
