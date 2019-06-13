package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;

import java.util.HashMap;
import java.util.Map;

public class MesaDeCrafteo {

    Map<Posicion, Material> mesa = new HashMap<Posicion, Material>();
    CrafteadorHerramientas crafteador;

    public MesaDeCrafteo(CrafteadorHerramientas crafter) {

        this.crafteador = crafter;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Posicion posicion = new Posicion(0 ,0);
                mesa.put(posicion, null);
            }
        }
    }

   public Herramienta crear(HashMap<Posicion, Material> crafteo) {

        crafteador.crear(crafteo);
        return null;
   }
}
