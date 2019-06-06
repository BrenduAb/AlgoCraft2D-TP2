package fiuba.algo3.model.Durabilidad;

import fiuba.algo3.model.Durabilidad.Desgaste;

public class DesgasteLento extends Desgaste {

    public DesgasteLento(int durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza / 2;
    }
}
