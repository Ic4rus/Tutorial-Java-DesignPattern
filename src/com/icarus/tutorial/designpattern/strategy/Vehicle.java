package com.icarus.tutorial.designpattern.strategy;

public abstract class Vehicle {
	
	private GoAlgorithm goAlgorithm;
	
	public Vehicle() {
		
	}
	
	public void setGoAlgorithm(GoAlgorithm algorithm) {
		goAlgorithm = algorithm;
	}
	
	public void go() {
		goAlgorithm.go();
	}

}
