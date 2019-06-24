package fiuba.algo3.controller;

import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ClickNadaMesaSetPosicionEventHandler implements EventHandler<MouseEvent> {
    BotoneraInventarioViewModel botonera;
    VistaInventario vistaInventario;
    Posicion posicion;

    public ClickNadaMesaSetPosicionEventHandler(BotoneraInventarioViewModel botonera,
                                                VistaInventario vistaInventario,
                                                Posicion posicion) {
        this.botonera = botonera;
        this.posicion = posicion;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(MouseEvent event) {
        this.botonera.filaPonerMesa.setValue(posicion.y() + 1);
        this.botonera.columnaPonerMesa.setValue(posicion.x() + 1);
        if(!botonera.botonPonerEn.isDisabled()){
            this.botonera.botonPonerEn.fire();
        }
    }
}
