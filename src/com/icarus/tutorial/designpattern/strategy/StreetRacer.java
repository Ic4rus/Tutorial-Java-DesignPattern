package com.icarus.tutorial.designpattern.strategy;

public class StreetRacer extends Vehicle {
	
	public StreetRacer() {
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}

}
