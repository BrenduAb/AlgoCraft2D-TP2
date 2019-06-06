package fiuba.algo3.model.Durabilidad;

public class DesgasteMinimo extends Desgaste {
    public DesgasteMinimo(int durabilidad) {
        super(durabilidad);
    }

    //Aca no se usa la fuerza que le paso por parametro y no me deja agregarle un metodo propio,
    //asi que creo que la vamos a tener que hacer abstracta a desgaste
    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= this.durabilidad * 0.1;
    }

}
