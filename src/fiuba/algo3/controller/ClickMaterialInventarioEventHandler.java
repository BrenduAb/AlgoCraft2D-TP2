package fiuba.algo3.controller;

import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ClickMaterialInventarioEventHandler implements EventHandler<MouseEvent> {
    VistaInventario vistaInventario;
    Material material;
    BotoneraInventarioViewModel botonera;

    public ClickMaterialInventarioEventHandler(BotoneraInventarioViewModel botonera, Material material,
                                               VistaInventario vista) {
        this.vistaInventario = vista;
        this.material = material;
        this.botonera = botonera;
    }

    @Override
    public void handle(MouseEvent event) {

        this.botonera.botonPonerEn.setDisable(false);
        BotonPonerEnHandler boton = new BotonPonerEnHandler(this.botonera, this.material, this.vistaInventario);
        this.botonera.botonPonerEn.setOnAction(boton);
    }
}
