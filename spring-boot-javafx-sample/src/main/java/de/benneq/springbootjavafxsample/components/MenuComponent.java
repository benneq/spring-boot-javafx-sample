package de.benneq.springbootjavafxsample.components;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.benneq.springbootjavafxsample.common.SpringFXMLLoader;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;

@Component
public class MenuComponent extends MenuBar implements InitializingBean {
	@Autowired SpringFXMLLoader fxmlLoader;
	
	public MenuComponent() {
		super();
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		fxmlLoader.load(getClass().getResource("menu.fxml"), this, this);
	}
	
	@FXML
	public void quit(Event event) {
		Platform.exit();
	}
		
}