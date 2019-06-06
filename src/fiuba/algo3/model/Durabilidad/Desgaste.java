package fiuba.algo3.model.Durabilidad;

public abstract class Desgaste {
    protected int durabilidad;

    public Desgaste(int durabilidad){
        this.durabilidad = durabilidad;
    }

    public int obtenerDurabilidad(){
        return this.durabilidad;
    }
    public abstract void desgastar(int fuerza);
}
