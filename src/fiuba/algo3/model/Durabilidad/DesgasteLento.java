package fiuba.algo3.model.Durabilidad;

public class DesgasteLento extends Desgaste {

    public DesgasteLento(double durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza / 2;
        if (this.durabilidad < 0){
            this.durabilidad = 0;
        }
    }
}
