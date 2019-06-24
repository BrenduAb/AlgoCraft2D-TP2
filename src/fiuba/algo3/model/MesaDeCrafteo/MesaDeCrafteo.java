package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;

import java.util.HashMap;

public class MesaDeCrafteo {

    HashMap<Posicion, Material> mesa = new HashMap<Posicion, Material>();
    CrafteadorHerramientas crafteador;

    public MesaDeCrafteo(CrafteadorHerramientas crafter) {

        this.crafteador = crafter;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Posicion posicion = new Posicion(0, 0);
                mesa.put(posicion, null);
            }
        }
    }

    public void agregarMaterial(Posicion posicion, Material material) {
        mesa.put(posicion, material);
    }

    public void removerMaterial(Posicion posicion) {
        mesa.remove(posicion);
    }

    public Material obtenerMaterial(Posicion posicion) {
        return this.mesa.get(posicion);
    }

    public Herramienta crear() {
        return crafteador.crear(this.mesa);
    }

    public void limpiar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Posicion posicion = new Posicion(i, j);
                mesa.replace(posicion, null);
            }
        }
    }
}
