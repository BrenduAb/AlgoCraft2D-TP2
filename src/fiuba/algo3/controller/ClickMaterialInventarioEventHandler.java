package fiuba.algo3.controller;

import fiuba.algo3.model.Contratos.IGuardable;
import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ClickMaterialInventarioEventHandler implements EventHandler<MouseEvent> {

    Inventario inventario;
    IGuardable material;
    VistaInventario vistaInventario;
    public ClickMaterialInventarioEventHandler(Inventario inventario,
                                               IGuardable material,
                                               VistaInventario vistaInventario){
        this.inventario = inventario;
        this.material = material;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(MouseEvent event) {
        inventario.removerGuardable(material);
        this.vistaInventario.actualizar(this.inventario);
    }
}
