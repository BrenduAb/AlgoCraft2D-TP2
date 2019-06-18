package fiuba.algo3.model.Durabilidad;

public abstract class Desgaste {
    protected double durabilidad;

    public Desgaste(double durabilidad){
        this.durabilidad = durabilidad;
    }

    public double obtenerDurabilidad(){
        return this.durabilidad;
    }
    public abstract void desgastar(int fuerza);
}
