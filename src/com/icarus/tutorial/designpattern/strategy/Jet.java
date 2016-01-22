package com.icarus.tutorial.designpattern.strategy;

public class Jet extends Vehicle {

	public Jet() {
		setGoAlgorithm(new GoByFlyingFastAlgorithm());
	}
}
