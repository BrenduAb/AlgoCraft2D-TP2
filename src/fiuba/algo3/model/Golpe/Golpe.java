package fiuba.algo3.model.Golpe;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;

public abstract class Golpe {
    int fuerza;

    public Golpe(int fuerza){
        this.fuerza = fuerza;
    }

    public int obtenerFuerza(){
        return this.fuerza;
    }

    public void golpear(Material material, Herramienta herramienta){
        material.golpear(this);
        herramienta.desgastar(this.fuerza);
    }

    public void golpear(Madera madera){

    }
    public void golpear(Piedra piedra){

    }
    public  void golpear(Metal metal){

    }
}
