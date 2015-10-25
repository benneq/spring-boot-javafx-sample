package de.benneq.springbootjavafxsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import de.benneq.springbootjavafxsample.views.MainController;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class Application extends javafx.application.Application {
	@Autowired Config config;
	@Autowired MainController mainController;


    private static String[] savedArgs;
    private ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        savedArgs = args;
        launch(Application.class, args);
    }

    @Override
    public void init() throws Exception {
        applicationContext = SpringApplication.run(getClass(), savedArgs);
        applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @Override
    public void start(Stage stage) throws Exception {
    	stage.setTitle(config.getWindow().getTitle());
        stage.setScene(new Scene(mainController.getView(), 640, 480));
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
    }

}