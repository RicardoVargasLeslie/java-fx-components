package com.imricki.fx.vmadministrator.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.imricki.fx.vmadministrator.utils.LoaderUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class AdministratorController implements Initializable {

	@FXML
	private BorderPane viewComponent;

	@FXML
	private Button settingsbtn;

	@FXML
	private Button importbtn;

	@FXML
	private Button exportbtn;

	@FXML
	private Button newbtn;

	@FXML
	private Button addbtn;

	@FXML
	void onAdd() {

	}

	@FXML
	void onExport() {

	}

	@FXML
	void onImport() {

	}

	@FXML
	void onNew() {

	}

	@FXML
	void onSettings(ActionEvent event) {

	}

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
