package fiuba.algo3.model.MesaDeCrafteo;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;

import java.util.*;

public class CrafteadorHerramientas {

    List<CrafteoHerramientas> crafteos = Arrays.asList(
         new CrafteoHachaMadera(),
         new CrafteoHachaPiedra(),
         new CrafteoHachaMetal(),
         new CrafteoPicoMadera(),
         new CrafteoPicoPiedra(),
         new CrafteoPicoMetal(),
         new CrafteoPicoFino()
    );

    public CrafteadorHerramientas(){

    };

    public Herramienta crear(HashMap<Posicion, Material> crafter){
        Herramienta herramienta = null;
        for(CrafteoHerramientas objeto: crafteos){

            if(objeto.igual(crafter)){
                herramienta = objeto.crearHerramienta();
            }
        }

        return herramienta;
    }
}
