package com.icarus.tutorial.designpattern.strategy;

public class GoByDrivingAlgorithm implements GoAlgorithm {
	
	@Override
	public void go() {
		System.out.println("Now I'm driving.");
	}
}
