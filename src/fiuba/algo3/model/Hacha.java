package fiuba.algo3.model;

import fiuba.algo3.Contratos.*;

public class Hacha implements IHerramienta, IGuardable {

    private int fuerza = 0;
    private IDesgaste desgaste;
    private IMaterial material;

    public Hacha(Madera material) {
        this.desgaste = new DesgasteRapido(100);
        this.fuerza = 2;
        this.material = material;
    }

    public Hacha(Metal material) {
        //this.durabilidad = 400;
        this.desgaste = new DesgasteLento(400);
        this.fuerza = 10;
        this.material = material;
    }

    public Hacha(Piedra material) {
        this.material = material;
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
