package fiuba.algo3.model.Materiales;

import fiuba.algo3.model.Golpe.Golpe;
import fiuba.algo3.model.Herramientas.Hacha;
import fiuba.algo3.model.Herramientas.Pico;

public class Piedra extends Material {

    public Piedra(){
        this.durabilidad = 30;
    }

    @Override
    public void golpear(Golpe golpe) {
        golpe.golpear(this);
    }
}
