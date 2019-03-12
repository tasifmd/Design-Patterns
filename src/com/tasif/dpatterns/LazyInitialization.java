package com.tasif.dpatterns;

public class LazyInitialization {
	
	private static LazyInitialization INSTANCE ;
	
	private LazyInitialization() {}
	
	public static LazyInitialization getInstance() {
		
		if(INSTANCE == null) {
			INSTANCE = new LazyInitialization();
		}
		
		return INSTANCE;
		
	}

}
