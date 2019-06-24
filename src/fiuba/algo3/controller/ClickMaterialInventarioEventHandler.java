package fiuba.algo3.controller;

import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class ClickMaterialInventarioEventHandler implements EventHandler<MouseEvent> {
    VistaInventario vistaInventario;
    Inventario inventario;
    Material material;
    MesaDeCrafteo mesaDeCrafteo;
    BotoneraInventarioViewModel botonera;
    BorderPane borderPane;

    public ClickMaterialInventarioEventHandler(Inventario inventario, Material material, MesaDeCrafteo mesaDeCrafteo,
                                               VistaInventario vistaInventario, BotoneraInventarioViewModel botonera,
                                               BorderPane borderPane) {
        this.vistaInventario = vistaInventario;
        this.inventario = inventario;
        this.material = material;
        this.mesaDeCrafteo = mesaDeCrafteo;
        this.botonera = botonera;
        this.borderPane = borderPane;
    }

    @Override
    public void handle(MouseEvent event) {
        int posicionX;
        int posicionY;

        this.botonera.botonPonerEn.setDisable(false);
        BotonPonerEnHandler boton = new BotonPonerEnHandler(this.inventario,
                this.botonera,
                this.material,
                this.vistaInventario,
                this.mesaDeCrafteo);
        this.botonera.botonPonerEn.setOnAction(boton);
    }
}
