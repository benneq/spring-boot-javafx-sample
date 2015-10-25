package de.benneq.springbootjavafxsample.components;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import de.benneq.springbootjavafxsample.common.SpringFXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

@Component
@Scope("prototype")
public class MyLabelComponent extends Label implements InitializingBean, Initializable {
	@Autowired SpringFXMLLoader fxmlLoader;
	
	public MyLabelComponent() {
		super();
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		fxmlLoader.load(getClass().getResource("label.fxml"), this, this);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setText(this.hashCode()+"");
	}
	
}