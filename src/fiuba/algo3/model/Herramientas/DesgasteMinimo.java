package fiuba.algo3.model.Herramientas;

import fiuba.algo3.Contratos.IDesgaste;

public class DesgasteMinimo implements IDesgaste {
    private int durabilidad = 1000;

    @Override
    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    //Aca no se usa la fuerza que le paso por parametro y no me deja agregarle un metodo propio,
    //asi que creo que la vamos a tener que hacer abstracta a desgaste
    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= this.durabilidad * 0.1;
    }

}
