package com.imricki.fx.configurationpanel.controller;

import com.imricki.fx.configurationpanel.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class PanelController {

	@FXML
	private BorderPane componenetView;

	public PanelController() {

		LoaderUtils.viewLoader("/fxml/panelview.fxml", this);
	}

	public BorderPane getComponenetView() {
		return this.componenetView;
	}
}
