package fiuba.algo3.model.Durabilidad;

public class DesgasteRapido extends Desgaste {

    public DesgasteRapido(int durabilidad) {
        super(durabilidad);
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza;
        if (this.durabilidad < 0){
            this.durabilidad = 0;
        }
    }
}
