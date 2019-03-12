package com.tasif.facadepattern;

public class Store {
	
	private Mobile mobile;
	private Television tv;
	
	public Store() {
		mobile  = new Mobile();
		tv = new Television();
	}
	
	public void mobileSale(){  
		mobile.modelNo();  
		mobile.price();  
    }  
	
	public void tvSale(){  
		tv.modelNo();  
		tv.price();  
    }  
}
