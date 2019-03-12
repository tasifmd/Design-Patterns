package com.tasif.proxypatterns;

public class ProxtpatternClient {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Tasif Mohammed");  
        access.grantInternetAccess();  
	}

}
