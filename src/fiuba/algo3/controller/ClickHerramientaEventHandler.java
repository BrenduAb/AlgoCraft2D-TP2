package fiuba.algo3.controller;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ClickHerramientaEventHandler implements EventHandler<MouseEvent> {

    BotoneraInventarioViewModel botonera;
    Herramienta herramienta;
    VistaInventario vistaInventario;

    public ClickHerramientaEventHandler(BotoneraInventarioViewModel botonera, Herramienta herramienta,
                                        VistaInventario vista) {
        this.botonera = botonera;
        this.herramienta = herramienta;
        this.vistaInventario = vista;
    }

    @Override
    public void handle(MouseEvent event) {
        this.botonera.botonEquipar.setDisable(false);
        BotonEquiparEventHandler botonEquiparEventHandler = new BotonEquiparEventHandler(botonera, herramienta,
                vistaInventario);
        botonera.botonEquipar.setOnAction(botonEquiparEventHandler);
    }
}
