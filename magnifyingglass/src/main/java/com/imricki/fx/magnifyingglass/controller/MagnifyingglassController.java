package com.imricki.fx.magnifyingglass.controller;

import java.io.IOException;

import com.imricki.fx.magnifyingglass.service.MagnifyService;
import com.imricki.fx.magnifyingglass.utils.LoaderUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class MagnifyingglassController  {

	@FXML
	private HBox componentView;

	@FXML
	private Button zoomOutbtn;

	@FXML
	private Button zoomInbtn;

	@FXML
	private Button settingsbtn;

	@FXML
	private Label percentageLabel;

	@FXML
	private ComboBox<?> viewsCombobox;
	
	private MagnifyService service;

	public MagnifyingglassController() throws IOException {

		LoaderUtils.viewLoader("../view/MagnifyingglassView.fxml", this);

	}

	@FXML
	void onSettings(ActionEvent event) {

		service.showSeeting();
	}

	@FXML
	void onViews(ActionEvent event) {

		service.showViews();
	}

	@FXML
	void onZoomIn(ActionEvent event) {

		service.zoomIn();
	}

	@FXML
	void onZoomOut(ActionEvent event) {

		service.zoomOut();
	}

	public HBox getComponentView() {
		return componentView;
	}

}
