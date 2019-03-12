package com.tasif.facadepattern;

public class Television implements ElectronicShop {

	@Override
	public void modelNo() {
		System.out.println("TV model is Sony");
	}

	@Override
	public void price() {
		System.out.println("Mobile price is 50000");
	}

}
