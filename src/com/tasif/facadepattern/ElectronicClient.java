package com.tasif.facadepattern;

import com.tasif.utility.Utility;

public class ElectronicClient {

	public static void main(String[] args) {
		Store store = new Store();
		boolean flag = false;
		
		while(flag == false ) {
			System.out.println("Enter your choice \n 1.Mobile \t 2.Television \t 3.Exit");
			int choice = Utility.inputInteger();
			switch(choice) {
			case 1 :
				store.mobileSale();
				break;
			case 2 :
				store.tvSale();
				break;
			case 3 :
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
		

	}

}
