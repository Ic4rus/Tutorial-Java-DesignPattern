package com.icarus.tutorial.designpattern.strategy;

public class Helicoper extends Vehicle {
	
	public Helicoper() {
		setGoAlgorithm(new GoByFlyingAlgorithm());
	}
}
