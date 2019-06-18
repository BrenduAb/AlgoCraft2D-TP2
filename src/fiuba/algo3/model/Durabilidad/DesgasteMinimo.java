package fiuba.algo3.model.Durabilidad;

import fiuba.algo3.Excepciones.HerramientaRotaException;

public class DesgasteMinimo extends Desgaste {
    public DesgasteMinimo(int durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= this.durabilidad * 0.1;
        if (this.durabilidad <= 0) {
            throw new HerramientaRotaException();
        }
    }

}
