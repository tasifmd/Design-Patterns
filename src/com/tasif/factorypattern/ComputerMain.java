package com.tasif.factorypattern;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer pc = CoputerFactory.createComputer(ComputerType.PC, "8GB" , "2TB" , "Intel");
		Computer server = CoputerFactory.createComputer(ComputerType.SERVER , "20GB" , "100GB" , "Rayzen");
		System.out.println(pc);
		System.out.println(server);
	}
}
