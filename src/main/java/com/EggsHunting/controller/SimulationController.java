package com.EggsHunting.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.EggsHunting.util.CSVGarden;
import com.EggsHunting.view.DisplayGridSimulation;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;

public class SimulationController extends ControlledScreen implements Initializable {
	
	@FXML StackPane stackpane;
	
	private DisplayGridSimulation display;
	private static final Logger log = LoggerFactory.getLogger(SimulationController.class);

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		display = new DisplayGridSimulation(CSVGarden.getGarden("/csv/garden.csv"));
		resetGrid();
	}
	
	@FXML
	private void resetGrid(){
		stackpane.getChildren().clear();
		stackpane.getChildren().add(new Group(display.getPane()));
		display.diplayBoard();
		log.info("Reset grid");

	}

	@Override
	public void updateAfterLoadingScreen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDatas() {
		// TODO Auto-generated method stub

	}

}