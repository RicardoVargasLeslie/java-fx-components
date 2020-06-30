package com.imricki.fx.magnifyingglass.main;

import com.imricki.fx.magnifyingglass.controller.MagnifyingglassController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	
	/**
	 * To Run execute mvn compile exec:java
	 */

	private String title = "Magnifyingglass";
	private MagnifyingglassController magnifyingglassController = new MagnifyingglassController();

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle(title);
		primaryStage.getIcons().getClass().getResource("/images/glass.png");
		primaryStage.setResizable(false);
		primaryStage.setScene(new Scene(magnifyingglassController.getComponentView()));
		primaryStage.show();
	}

}
