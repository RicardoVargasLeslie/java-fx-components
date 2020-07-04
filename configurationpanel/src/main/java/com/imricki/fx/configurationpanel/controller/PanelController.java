package com.imricki.fx.configurationpanel.controller;

import com.imricki.fx.configurationpanel.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class PanelController {

	@FXML
	private BorderPane componentView;

	public PanelController() {

		LoaderUtils.viewLoader("/fxml/panelvew.fxml", this);
	}

	public BorderPane getComponentView() {
		return this.componentView;
	}
}
