package fiuba.algo3.model.Golpe;

import fiuba.algo3.model.Materiales.Piedra;

public class GolpePico extends Golpe {
    public GolpePico(int fuerza) {
        super(fuerza);
    }

    @Override
    public void golpear(Piedra piedra) {
        piedra.desgastar(this.fuerza);
    }
}
