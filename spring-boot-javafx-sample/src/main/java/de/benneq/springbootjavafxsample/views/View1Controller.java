package de.benneq.springbootjavafxsample.views;

import org.springframework.stereotype.Component;

import de.benneq.springbootjavafxsample.common.FXMLController;

@Component
public class View1Controller extends FXMLController {
	
	public View1Controller() {
		super("view1.fxml");
	}
	
}