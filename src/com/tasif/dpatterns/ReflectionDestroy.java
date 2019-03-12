package com.tasif.dpatterns;

import java.lang.reflect.Constructor;

public class ReflectionDestroy {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.INSTANCE; 
        Singleton instance2 = null; 
        try
        { 
            Constructor[] constructors = Singleton.class.getDeclaredConstructors(); 
            for (Constructor<Singleton> constructor : constructors)  { 
                constructor.setAccessible(true); 
                instance2 = (Singleton) constructor.newInstance(); 
                break; 
            } 
        } 
      
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
          
        System.out.println("instance1.hashCode():- " + instance1.hashCode()); 
        System.out.println("instance2.hashCode():- " + instance2.hashCode());

	}

}

class Singleton {
	public static final Singleton INSTANCE = new Singleton();
	private Singleton() {}
}
