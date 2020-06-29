package com.imricki.fx.magnifyingglass.main;

import com.imricki.fx.magnifyingglass.controller.MagnifyingglassController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private String title = "Magnifyingglass";
	private MagnifyingglassController magnifyingglassController;

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle(title);
		primaryStage.getIcons().getClass().getResource("glass.png");
		magnifyingglassController = new MagnifyingglassController();
		primaryStage.setScene(new Scene(this.magnifyingglassController.getComponentView()));
		primaryStage.show();
	}

}
