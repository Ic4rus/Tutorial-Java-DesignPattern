package com.icarus.tutorial.designpattern.factory.gof;

public abstract class ConnectionFactory {

	public ConnectionFactory() {
		
	}
	
	protected abstract Connection createConnection(String type);
	
}
