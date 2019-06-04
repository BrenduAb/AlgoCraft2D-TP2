package fiuba.algo3.model;

import fiuba.algo3.Contratos.IDesgaste;

public class DesgasteLento implements IDesgaste {
    private  int durabilidad;

    public DesgasteLento(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    @Override
    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    @Override
    public void desgastar(int fuerza) {
        this.durabilidad -= fuerza / 2;
    }
}