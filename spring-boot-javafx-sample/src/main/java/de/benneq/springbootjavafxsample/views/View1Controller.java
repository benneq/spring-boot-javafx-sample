package de.benneq.springbootjavafxsample.views;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.benneq.springbootjavafxsample.common.FXMLController;
import de.benneq.springbootjavafxsample.model.GlobalModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

@Component
public class View1Controller extends FXMLController implements Initializable {
	@Autowired GlobalModel model;
	
	@FXML TextField text;
	
	
	
	public View1Controller() {
		super("view1.fxml");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		text.textProperty().bindBidirectional(model.getTextProperty());
	}
	
}