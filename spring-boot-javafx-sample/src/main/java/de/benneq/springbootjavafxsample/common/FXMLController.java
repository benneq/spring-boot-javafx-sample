package de.benneq.springbootjavafxsample.common;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.scene.Parent;

@Component
public abstract class FXMLController implements InitializingBean {

	@Autowired SpringFXMLLoader fxmlLoader;
	
	private final String fxml;
	private Parent view;

	public FXMLController(String fxml) {
		this.fxml = fxml;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.view = fxmlLoader.load(getClass().getResource(fxml), this);
	}

	public Parent getView() {
		return view;
	}
	
}