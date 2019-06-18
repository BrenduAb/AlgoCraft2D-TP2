package fiuba.algo3.model.Durabilidad;

import fiuba.algo3.Excepciones.HerramientaRotaException;

public class DesgasteMedio extends Desgaste {

    public DesgasteMedio(double durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza / 1.5;
        if (this.durabilidad <= 0){
            throw new HerramientaRotaException();
        }
    }
}
