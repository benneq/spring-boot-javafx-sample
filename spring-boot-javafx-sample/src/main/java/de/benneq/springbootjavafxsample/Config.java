package de.benneq.springbootjavafxsample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class Config {

	private Window window;
	public Window getWindow() { return window; }
	public void setWindow(Window window) { this.window = window; }
	
	
	
	public static class Window {
		private String title;
		public String getTitle() { return title; }
		public void setTitle(String title) { this.title = title; }
	}
	
}