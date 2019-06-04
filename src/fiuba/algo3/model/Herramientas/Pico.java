package fiuba.algo3.model.Herramientas;

import fiuba.algo3.Contratos.IDanioTipoMaterial;
import fiuba.algo3.Contratos.IHerramienta;
import fiuba.algo3.Contratos.IMaterial;
import fiuba.algo3.model.DanioTipoMaterial.DanioMadera;
import fiuba.algo3.model.DanioTipoMaterial.DanioMetal;
import fiuba.algo3.model.DanioTipoMaterial.DanioPiedra;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;

public class Pico implements IHerramienta {

    private IMaterial material;
    private IDanioTipoMaterial danio;
    private int fuerza = 0;

    public Pico(Metal metal){
        this.material = metal;
        this.danio = new DanioMetal();
        this.fuerza = 12;
    }

    public Pico(Madera madera) {
        this.material = madera;
        this.danio = new DanioMadera();
        this.fuerza = 2;
    }


    public Pico(Piedra piedra) {
        this.material = piedra;
        this.danio = new DanioPiedra();
        this.fuerza = 4;
    }

    @Override
    public int obtenerDurabilidad() {
        return 0;
    }

    @Override
    public int obtenerFuerza() {
        return this.fuerza;
    }

    @Override
    public void usarContra(IMaterial material) {
    }

    @Override
    public int calcularDanio(Madera madera) {
        return 0;
    }

    @Override
    public int calcularDanio(Piedra piedra) {
        return danio.obtenerDanio(this);
    }

    @Override
    public int calcularDanio(Metal metal) {
        return danio.obtenerDanio(this);
    }
}
