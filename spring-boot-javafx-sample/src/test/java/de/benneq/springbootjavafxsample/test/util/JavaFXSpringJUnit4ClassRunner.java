package de.benneq.springbootjavafxsample.test.util;

import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javafx.stage.Stage;

public class JavaFXSpringJUnit4ClassRunner extends SpringJUnit4ClassRunner {

	public JavaFXSpringJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}
	
	@Override
	protected Statement withBeforeClasses(Statement statement) {
		statement = super.withBeforeClasses(statement);
		new Thread() {
			@Override
			public void run() {
				javafx.application.Application.launch(FXRunnerApplication.class);
			}
		}.start();
		return statement;
	}
	
	public static class FXRunnerApplication extends javafx.application.Application {
		@Override
		public void start(Stage paramStage) throws Exception {
		}
	}
	
}