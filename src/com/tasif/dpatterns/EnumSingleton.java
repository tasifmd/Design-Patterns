package com.tasif.dpatterns;

public class EnumSingleton {

	public static void main(String[] args) {
		  SingletonEnum singleton = SingletonEnum.INSTANCE;
	      System.out.println(singleton);

	}

}
enum SingletonEnum {
    INSTANCE;
    
    
}
