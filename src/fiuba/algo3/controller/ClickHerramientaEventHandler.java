package fiuba.algo3.controller;

import fiuba.algo3.model.Herramientas.Herramienta;
import fiuba.algo3.model.Jugador.Jugador;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ClickHerramientaEventHandler implements EventHandler<MouseEvent> {
    BotoneraInventarioViewModel botonera;
    Herramienta herramienta;
    Jugador jugador;
    VistaInventario vistaInventario;

    public ClickHerramientaEventHandler(Jugador jugador,
                                        BotoneraInventarioViewModel botonera,
                                        Herramienta herramienta,
                                        VistaInventario vistaInventario) {
        this.botonera = botonera;
        this.jugador = jugador;
        this.herramienta = herramienta;
        this.vistaInventario = vistaInventario;
    }

    @Override
    public void handle(MouseEvent event) {
        this.botonera.botonEquipar.setDisable(false);
        EquiparBotonEventHandler equiparBotonEventHandler = new EquiparBotonEventHandler(jugador,
                botonera,
                herramienta,
                vistaInventario);
        botonera.botonEquipar.setOnAction(equiparBotonEventHandler);
    }
}
