package fiuba.algo3.model.Mapa;

public class Posicion {
    private int x;
    private int y;

    public Posicion(int columna, int fila) {
        this.x = columna;
        this.y = fila;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != Posicion.class) {
            return false;
        }

        Posicion instance = (Posicion) obj;

        if (this.x != instance.x() && this.y != instance.y) {
            return false;
        }

        return true;
    }

    public Posicion posicionSiguienteDerecha() {
        int nuevaX = this.x + 1;
        return new Posicion(nuevaX, this.y);
    }

    public Posicion posicionSiguienteIzquierda() {
        int nuevaX = this.x - 1;
        return new Posicion(nuevaX, this.y);
    }

    public Posicion posicionSiguienteAbajo() {
        int nuevaY = this.y + 1;
        return new Posicion(this.x, nuevaY);
    }

    public Posicion posicionSiguienteArriba() {
        int nuevaY = this.y - 1;
        return new Posicion(this.x, nuevaY);
    }
}
