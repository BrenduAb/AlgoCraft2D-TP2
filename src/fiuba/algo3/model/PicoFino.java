package fiuba.algo3.model;

import fiuba.algo3.Contratos.IDesgaste;
import fiuba.algo3.Contratos.IHerramienta;
import fiuba.algo3.Contratos.IMaterial;

public class PicoFino implements IHerramienta {
    private IDesgaste desgaste;
    private int fuerza;

    public PicoFino(Metal metal, Piedra piedra) {
        this.desgaste = new DesgasteMinimo();
        this.fuerza = 20;
    }

    @Override
    public int obtenerDurabilidad() {
        return desgaste.obtenerDurabilidad();
    }

    @Override
    public int obtenerFuerza() {
        return this.fuerza;
    }

    @Override
    public void usarContra(IMaterial material) {
        this.desgaste.desgastar(this.fuerza);
    }

    @Override
    public int calcularDanio(Madera madera) {
        return this.fuerza;
    }
}
