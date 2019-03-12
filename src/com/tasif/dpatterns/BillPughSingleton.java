package com.tasif.dpatterns;

public class BillPughSingleton {
		private BillPughSingleton() {}
		private static class HelperClass{
			private static final BillPughSingleton INSTANCE = new BillPughSingleton();
		}
		public static BillPughSingleton getInstance(){
	        return HelperClass.INSTANCE;
	    }
}
