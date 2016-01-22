package com.icarus.tutorial.designpattern.factory.gof;

public class SecureMySqlConnection extends Connection {
	
	public SecureMySqlConnection() {
		
	}
	
	public String description() {
		return "MySQL secure";
	}

}
