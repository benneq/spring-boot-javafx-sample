package de.benneq.springbootjavafxsample.views;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.benneq.springbootjavafxsample.common.FXMLController;
import de.benneq.springbootjavafxsample.model.GlobalModel;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

@Component
public class MainController extends FXMLController implements Initializable {
	@Autowired View1Controller view1;
	@Autowired View2Controller view2;
	@Autowired GlobalModel model;
	
	@FXML Pane content;
	@FXML TextField text;

	
	
	public MainController() {
		super("main.fxml");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showView1(null);
		text.textProperty().bindBidirectional(model.getTextProperty());
	}
	
	@FXML
	public void showView1(Event event) {
		content.getChildren().clear();
		content.getChildren().add(view1.getView());
	}
	
	@FXML
	public void showView2(Event event) {
		content.getChildren().clear();
		content.getChildren().add(view2.getView());
	}
	
	public TextField getText() {
		return text;
	}
	
}