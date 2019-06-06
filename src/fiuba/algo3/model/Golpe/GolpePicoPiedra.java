package fiuba.algo3.model.Golpe;

import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;

public class GolpePicoPiedra extends Golpe {
    public GolpePicoPiedra(int fuerza) {
        super(fuerza);
    }

    @Override
    public void golpear(Piedra piedra) {
        piedra.desgastar(this.fuerza);
    }

    @Override
    public void golpear(Metal metal) {
        metal.desgastar(this.fuerza);
    }
}
