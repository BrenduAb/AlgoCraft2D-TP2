package fiuba.algo3.model.Durabilidad;

import fiuba.algo3.Excepciones.HerramientaRotaException;

public class DesgasteLento extends Desgaste {

    public DesgasteLento(double durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza / 2;
        if (this.durabilidad <= 0){
            throw new HerramientaRotaException();

        }
    }
}
