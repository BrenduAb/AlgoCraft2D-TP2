package fiuba.algo3.controller;

import fiuba.algo3.vista.VistaInventario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonInventarioHandler implements EventHandler<ActionEvent> {

    private final VistaInventario vista;

    public BotonInventarioHandler(VistaInventario vista) {
        this.vista = vista;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.vista.mostrar();
    }
}
