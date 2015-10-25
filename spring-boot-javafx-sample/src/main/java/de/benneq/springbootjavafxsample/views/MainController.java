package de.benneq.springbootjavafxsample.views;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.benneq.springbootjavafxsample.common.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

@Component
public class MainController extends FXMLController implements Initializable {
	@Autowired View1Controller view1;
	@Autowired View2Controller view2;
	
	@FXML Pane content;
	
	
	public MainController() {
		super("main.fxml");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showView1(null);
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
	
}