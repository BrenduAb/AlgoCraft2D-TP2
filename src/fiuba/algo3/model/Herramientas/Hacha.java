package fiuba.algo3.model.Herramientas;

import fiuba.algo3.Contratos.*;
import fiuba.algo3.model.*;
import fiuba.algo3.model.DanioTipoMaterial.DanioMadera;
import fiuba.algo3.model.DanioTipoMaterial.DanioMetal;
import fiuba.algo3.model.DanioTipoMaterial.DanioPiedra;
import fiuba.algo3.model.Materiales.Madera;
import fiuba.algo3.model.Materiales.Metal;
import fiuba.algo3.model.Materiales.Piedra;

public class Hacha implements IHerramienta, IGuardable {

    private int fuerza = 0;
    private IDesgaste desgaste;
    private IMaterial material;
    private IDanioTipoMaterial danio;


    public Hacha(Madera material) {
        this.desgaste = new DesgasteRapido(100);
        this.fuerza = 2;
        this.material = material;
        this.danio = new DanioMadera();
    }

    public Hacha(Metal material) {
        this.desgaste = new DesgasteLento(400);
        this.fuerza = 10;
        this.material = material;
        this.danio = new DanioMetal();
    }

    public Hacha(Piedra material) {
        this.material = material;
        this.desgaste = new DesgasteLento(400);
        this.fuerza = 5;
        this.danio = new DanioPiedra();
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
        return this.danio.obtenerDanio(this);
    }

    @Override
    public int calcularDanio(Piedra piedra) {
        return 0;
    }

    @Override
    public int calcularDanio(Metal piedra) {
        return 0;
    }

    @Override
    public void guardarEnInventario(Jugador jugador) {
        jugador.guardarEnInventario(this);
    }

    public boolean esIgual(IHerramienta herramienta){
        return (fuerza == herramienta.obtenerFuerza())&&
                (obtenerDurabilidad() == herramienta.obtenerDurabilidad());
    }
}
