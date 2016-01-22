package com.icarus.tutorial.designpattern.strategy;

public class FormulaOne extends Vehicle {
	
	public FormulaOne() {
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
}
