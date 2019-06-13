package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Golpe.Golpe;

public class Madera extends Material {

    public Madera(){
        this.durabilidad = 10;
    }

    @Override
    public void golpear(Golpe golpe) {
        golpe.golpear(this);
    }
}
