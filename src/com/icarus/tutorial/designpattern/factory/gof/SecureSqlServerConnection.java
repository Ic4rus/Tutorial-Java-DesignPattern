package com.icarus.tutorial.designpattern.factory.gof;

public class SecureSqlServerConnection extends Connection {
	
	public SecureSqlServerConnection() {
		
	}
	
	public String description() {
		return "SQL Server secure";
	}

}
