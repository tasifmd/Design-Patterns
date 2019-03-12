package com.tasif.factorypattern;

public class Server  implements Computer {
	private String RAM;
	private String HDD;
	private String CPU;
	
	public Server(String ram, String hdd, String cpu) {
		super();
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}

	public String getRAM() {
		return this.RAM;
	}


	public String getHDD() {
		return this.HDD;
	}

	public String getCPU() {
		return this.CPU;
	}

	@Override
	public String toString() {
		return "Server [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}
	
	
}
