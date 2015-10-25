package de.benneq.springbootjavafxsample.model;

import org.springframework.stereotype.Component;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@Component
public class GlobalModel {

	private StringProperty text = new SimpleStringProperty();
	public String getText() { return text.get(); }
	public void setText(String text) { this.text.set(text); }
	public StringProperty getTextProperty() { return text; }
	
}
