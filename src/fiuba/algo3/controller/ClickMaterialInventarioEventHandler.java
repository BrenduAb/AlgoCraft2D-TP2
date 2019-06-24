package fiuba.algo3.controller;

import fiuba.algo3.model.Jugador.Inventario;
import fiuba.algo3.model.Mapa.Posicion;
import fiuba.algo3.model.Materiales.Material;
import fiuba.algo3.model.MesaDeCrafteo.MesaDeCrafteo;
import fiuba.algo3.vista.BotoneraInventarioViewModel;
import fiuba.algo3.vista.VistaInventario;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class ClickMaterialInventarioEventHandler implements EventHandler<MouseEvent> {
    VistaInventario vistaInventario;
    Inventario inventario;
    Material material;
    MesaDeCrafteo mesaDeCrafteo;
    BotoneraInventarioViewModel botonera;
    BorderPane borderPane;

    public ClickMaterialInventarioEventHandler(Inventario inventario, Material material, MesaDeCrafteo mesaDeCrafteo,
                                               VistaInventario vistaInventario, BotoneraInventarioViewModel botonera,
                                               BorderPane borderPane){
        this.vistaInventario = vistaInventario;
        this.inventario = inventario;
        this.material = material;
        this.mesaDeCrafteo = mesaDeCrafteo;
        this.botonera = botonera;
        this.borderPane = borderPane;
    }

    @Override
    public void handle(MouseEvent event) {
        ChoiceBox choiceBox1 = new ChoiceBox();
        choiceBox1.setItems(FXCollections.observableArrayList(1, 2, 3));
        ChoiceBox choiceBox2 = new ChoiceBox();
        choiceBox2.setItems(FXCollections.observableArrayList(1, 2, 3));
        HBox contenedorHorizontal = new HBox(new Label("Fila: "),choiceBox1,
                new Label("Columna: "), choiceBox2);
        contenedorHorizontal.setSpacing(10);
        contenedorHorizontal.setPadding(new Insets(15));
        contenedorHorizontal.setAlignment(Pos.TOP_CENTER);
        this.borderPane.setBottom(contenedorHorizontal);
        int posicionX;
        int posicionY;
        posicionX = (int)choiceBox1.setOnAction('\n');
        posicionY = (int)choiceBox2.getValue();
        Posicion posicion = new Posicion(posicionX-1, posicionY-1);
        this.botonera.botonPonerEn.setDisable(false);
        BotonPonerEnHandler boton = new BotonPonerEnHandler(this.inventario, this.botonera, this.material,
                this.vistaInventario, posicion, this.mesaDeCrafteo);
        this.botonera.botonPonerEn.setOnAction(boton);
        choiceBox1.hide();
        choiceBox2.hide();
    }
}
