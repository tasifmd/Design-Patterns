package com.tasif.dpatterns;

public class EagerInitialization {
	
	private static final EagerInitialization EAGERINITOBJECT= new EagerInitialization();
	
	private EagerInitialization() {}
	
	public static EagerInitialization getInstance() {
		return EAGERINITOBJECT;
	}

}
