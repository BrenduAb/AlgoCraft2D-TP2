package fiuba.algo3.model.Durabilidad;

public class DesgasteMinimo extends Desgaste {
    public DesgasteMinimo(int durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= this.durabilidad * 0.1;
        if (this.durabilidad < 0){
            this.durabilidad = 0;
        }
    }

}
