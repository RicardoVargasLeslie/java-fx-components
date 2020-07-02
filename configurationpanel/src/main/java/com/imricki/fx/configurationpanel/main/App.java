package com.imricki.fx.configurationpanel.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application  {

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Config Panel");
		primaryStage.setScene(new Scene(null));
		primaryStage.show();


	}

}s