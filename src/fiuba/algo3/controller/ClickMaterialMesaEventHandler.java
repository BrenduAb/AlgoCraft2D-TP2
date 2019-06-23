package fiuba.algo3.controller;

import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ClickMaterialMesaEventHandler implements EventHandler<MouseEvent> {
    Posicion posicion;
    VistaInventario vistaInventario;
    Inventario inventario;
    Material material;
    MesaDeCrafteo mesaDeCrafteo;

    public ClickMaterialMesaEventHandler(Inventario inventario,
                                         Material material,
                                         MesaDeCrafteo mesaDeCrafteo,
                                         VistaInventario vistaInventario,
                                         Posicion posicion) {
        this.vistaInventario = vistaInventario;
        this.inventario = inventario;
        this.material = material;
        this.mesaDeCrafteo = mesaDeCrafteo;
        this.posicion = posicion;
    }

    @Override
    public void handle(MouseEvent event) {
        this.inventario.agregarAlInventario(material);
        this.mesaDeCrafteo.removerMaterial(posicion);
        this.vistaInventario.actualizar(this.inventario);
    }
}
