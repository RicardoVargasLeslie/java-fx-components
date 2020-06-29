package com.imricki.fx.magnifyingglass.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.imricki.fx.magnifyingglass.service.Magnify;
import com.imricki.fx.magnifyingglass.utils.LoaderUtils;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.HBox;

public class MagnifyingglassController  implements Initializable {

	@FXML
	private HBox componentView;

	@FXML
	private Button zoomOutbtn;

	@FXML
	private Button zoomInbtn;

	@FXML
	private Label percentageLabel;

	@FXML
	private MenuButton menubtn;

	@FXML
	private Button settingsbtn;

	private Magnify magnify;
	
	//Domain
	private SimpleIntegerProperty percent;

	public MagnifyingglassController() {

		LoaderUtils.viewLoader("/fxml/MagnifyingglassView.fxml", this);
		magnify = new Magnify();
		
	}
	
	
	

	@FXML
	void onSettings() {

		this.magnify.showSeeting();
	}

	@FXML
	void onViews() {

		this.magnify.showViews();
	}

	@FXML
	void onZoomIn() {

		this.magnify.zoomIn();
	}

	@FXML
	void onZoomOut() {

		this.magnify.zoomOut();
	}

	public HBox getComponentView() {
		return componentView;
	}




	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		percent=new SimpleIntegerProperty(this,"percent",0);
		percentageLabel.textProperty().bind(percent.asString());
		
	}

}
