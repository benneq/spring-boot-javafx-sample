package de.benneq.springbootjavafxsample.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

import de.benneq.springbootjavafxsample.Application;
import de.benneq.springbootjavafxsample.model.GlobalModel;
import de.benneq.springbootjavafxsample.test.util.JavaFXSpringJUnit4ClassRunner;
import de.benneq.springbootjavafxsample.views.MainController;
import de.benneq.springbootjavafxsample.views.View1Controller;

@RunWith(JavaFXSpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class MyTest {
	@Autowired GlobalModel model;
	@Autowired MainController mainCtrl;
	@Autowired View1Controller view1Ctrl;
	
	
	
	@Test
	public void test1() {
		mainCtrl.getText().textProperty().set("foo");
		Assert.assertEquals("foo", model.getText());
	}
	
	@Test
	public void test2() {
		model.setText("bar");
		Assert.assertEquals("bar", mainCtrl.getText().getText());
	}
	
	@Test
	public void test3() {
		model.setText("baz");
		Assert.assertEquals("baz", view1Ctrl.getText().getText());
	}
	
}