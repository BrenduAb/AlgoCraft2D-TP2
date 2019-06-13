package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Herramientas.ConstructorHerramientas;
import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;

import java.util.HashMap;

public abstract class CrafteoHerramientas {

    protected HashMap<Posicion, Material> crafteo;
    protected ConstructorHerramientas constructor = new ConstructorHerramientas();
    public abstract Herramienta crearHerramienta();

    public boolean igual(HashMap<Posicion, Material> crafteo_){
        boolean igual = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                Posicion posicion = new Posicion(i,j);
                Material materialDeHerramienta = crafteo.get(posicion);
                Material materialRecibido = crafteo_.get(posicion);

                if((materialDeHerramienta != materialRecibido) || (materialDeHerramienta.getClass() != materialRecibido.getClass())){
                    igual = false;
                }
            }
        }
        return igual;
    }
}
