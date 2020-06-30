package com.imricki.fx.vmadministrator.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.imricki.fx.vmadministrator.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class AdministratorController implements Initializable {

	@FXML
	private BorderPane viewComponent;

	public AdministratorController() {

		LoaderUtils.viewLoader("/fx/vmpanel.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public BorderPane getViewComponent() {
		return this.viewComponent;
	}
}
