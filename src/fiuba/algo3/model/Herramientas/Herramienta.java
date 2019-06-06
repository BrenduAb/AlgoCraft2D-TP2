package fiuba.algo3.model.Herramientas;

import fiuba.algo3.model.Durabilidad.Desgaste;
import fiuba.algo3.model.Golpe.Golpe;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.Materiales.Piedra;

public abstract class Herramienta {
    protected Desgaste desgaste;
    protected Golpe golpe;

    public Herramienta(Desgaste desgaste, Golpe golpe){
        this.desgaste = desgaste;
        this.golpe = golpe;
    }

    public int obtenerFuerza(){
        return  this.golpe.obtenerFuerza();
    }

    public abstract void usarContra(Material materialARecolectar);

    public abstract void desgastar(int danio);

    public int obtenerDurabilidad() {
        return this.desgaste.obtenerDurabilidad();
    }
}
