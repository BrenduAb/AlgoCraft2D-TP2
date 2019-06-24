package fiuba.algo3.controller;

import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonPonerEnHandler implements EventHandler<ActionEvent> {
    BotoneraInventarioViewModel botonera;
    Material material;
    Inventario inventario;
    VistaInventario vistaInventario;
    Posicion posicion;
    MesaDeCrafteo mesa;

    public BotonPonerEnHandler(Inventario inventario, BotoneraInventarioViewModel botonera, Material material,
                               VistaInventario vistaInventario, Posicion posicion, MesaDeCrafteo mesa) {
        this.botonera = botonera;
        this.inventario = inventario;
        this.material = material;
        this.vistaInventario = vistaInventario;
        this.posicion = posicion;
        this.mesa = mesa;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.inventario.removerGuardable(material);
        this.mesa.agregarMaterial(posicion, material);
        this.botonera.botonPonerEn.setDisable(true);
        this.vistaInventario.actualizar(this.inventario);
    }
}
