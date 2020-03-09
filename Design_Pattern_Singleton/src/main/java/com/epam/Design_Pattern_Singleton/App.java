package com.epam.Design_Pattern_Singleton;

/**
 * Hello world!
 *
 */
public class App 
{
	private static App ourInstance = new App();
	public static App getInstance() {
	    return ourInstance;
	}
	private App() {
	}
}
