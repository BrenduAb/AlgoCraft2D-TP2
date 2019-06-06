package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Golpe.Golpe;

public class Diamante extends Material {
    public Diamante(){
        this.durabilidad = 100;
    }

    @Override
    public void golpear(Golpe golpe) {
        golpe.golpear(this);
    }
}
