package fiuba.algo3.model.Golpe;

import fiuba.algo3.model.Materiales.Madera;

public class GolpeHacha extends Golpe {
    public GolpeHacha(int fuerza) {
        super(fuerza);
    }

    @Override
    public void golpear(Madera madera) {
        madera.desgastar(this.fuerza);
    }
}
