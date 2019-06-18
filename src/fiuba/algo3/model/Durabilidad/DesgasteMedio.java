package fiuba.algo3.model.Durabilidad;

public class DesgasteMedio extends Desgaste {

    public DesgasteMedio(double durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza / 1.5;
        if (this.durabilidad < 0){
            this.durabilidad = 0;
        }
    }
}
