package fiuba.algo3.model;

import fiuba.algo3.Contratos.IDesgaste;
import fiuba.algo3.Contratos.IHerramienta;
import fiuba.algo3.Contratos.IMaterial;

public class Hacha implements IHerramienta {

    private int fuerza = 0;
    private IDesgaste desgaste;

    public Hacha(Madera material) {
        this.desgaste = new DesgasteRapido(100);
        this.fuerza = 2;
    }

    public Hacha(Metal material) {
        //this.durabilidad = 400;
        this.desgaste = new DesgasteLento(400);
        this.fuerza = 10;
    }

    @Override
    public int obtenerDurabilidad() {
        return this.desgaste.obtenerDurabilidad();
    }

    @Override
    public int obtenerFuerza() {
        return this.fuerza;
    }

    @Override
    public void usarContra(IMaterial material) {
        material.chocarContra(this);
        this.desgaste.desgastar(this.fuerza);
    }

    @Override
    public int calcularDanio(Madera madera) {
        return this.fuerza;
    }
}
