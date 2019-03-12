package com.tasif.factorypattern;

public class CoputerFactory {
	
	public static Computer createComputer(ComputerType type , String ram , String hdd , String cpu) {
		
		Computer computer = null;
		switch(type) {
		
		case PC:
			computer = new PC(ram,hdd,cpu);
		case SERVER:
			computer =  new Server(ram,hdd,cpu);
			
		}
		
		return computer;
	}
}
