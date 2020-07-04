package com.imricki.fx.configurationpanel.main;

import com.imricki.fx.configurationpanel.controller.PanelController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		PanelController panelController = new PanelController();
		primaryStage.setTitle("Config Panel");
		primaryStage.getIcons().getClass().getResource("");
		primaryStage.setResizable(false);
		primaryStage.setScene(new Scene(panelController.getComponentView()));
		primaryStage.show();

	}

}