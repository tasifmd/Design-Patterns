package com.tasif.facadepattern;

public class Mobile implements ElectronicShop {

	@Override
	public void modelNo() {
		System.out.println("Mobile model is Iphone");
	}

	@Override
	public void price() {
		System.out.println("Mobile price is 70000");
	}

}
