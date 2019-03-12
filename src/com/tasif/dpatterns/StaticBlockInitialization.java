package com.tasif.dpatterns;

public class StaticBlockInitialization {
	
	private static StaticBlockInitialization INSTANCE ;
	
	private StaticBlockInitialization() {}
	
	static {
		INSTANCE = new StaticBlockInitialization();
	}
	
	public static StaticBlockInitialization getInstance() {
		return INSTANCE;
	}

}
