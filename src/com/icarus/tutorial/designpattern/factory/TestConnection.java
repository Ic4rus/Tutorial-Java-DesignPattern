package com.icarus.tutorial.designpattern.factory;

public class TestConnection {
	
	public static void main(String[] args) {
		
		FirstFactory factory;
		
		factory = new FirstFactory("Oracle");
		
		Connection connection = factory.createConnection();
		
		System.out.println("You're connectiong with " + connection.description());
		
	}

}
