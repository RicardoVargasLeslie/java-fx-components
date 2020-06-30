package com.imricki.fx.vmadministrator.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	
	/**
	 * To Run execute mvn compile exec:java
	 */
	
	public static void main(String[] args) {
	
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
	
		primaryStage.setTitle("VM Panel");
		primaryStage.setScene(new Scene(null));
		primaryStage.show();
		
	}

}
