package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;

import java.util.HashMap;
import java.util.Map;

public class MesaDeCrafteo {

    Map<Posicion, Material> mesa = new HashMap<Posicion, Material>();

    public MesaDeCrafteo() {

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Posicion posicion = new Posicion(0 ,0);
                mesa.put(posicion, null);
            }
        }
    }
}
