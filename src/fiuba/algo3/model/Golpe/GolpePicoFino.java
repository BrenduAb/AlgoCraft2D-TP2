package fiuba.algo3.model.Golpe;

import fiuba.algo3.model.Materiales.Diamante;

public class GolpePicoFino extends Golpe {
    public GolpePicoFino(int fuerza) {
        super(fuerza);
    }

    @Override
    public void golpear(Diamante diamante) {
        diamante.desgastar(this.fuerza);
    }
}
