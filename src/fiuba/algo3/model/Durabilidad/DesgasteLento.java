package fiuba.algo3.model.Durabilidad;

public class DesgasteLento extends Desgaste {

    public DesgasteLento(int durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza / 2;
    }
}
