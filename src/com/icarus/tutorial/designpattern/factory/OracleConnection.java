package com.icarus.tutorial.designpattern.factory;

public class OracleConnection extends Connection {
	
	public OracleConnection() {
		
	}
	
	public String description() {
		return "Oracle";
	}

}
