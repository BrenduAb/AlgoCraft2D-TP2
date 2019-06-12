package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Golpe.Golpe;

public class Piedra extends Material {

    public Piedra(){
        this.durabilidad = 30;
    }

    @Override
    public void golpear(Golpe golpe) {
        golpe.golpear(this);
    }
}
