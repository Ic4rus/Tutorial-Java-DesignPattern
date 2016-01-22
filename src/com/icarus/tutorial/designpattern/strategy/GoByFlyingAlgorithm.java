package com.icarus.tutorial.designpattern.strategy;

public class GoByFlyingAlgorithm implements GoAlgorithm {

	@Override
	public void go() {
		System.out.println("Now I'm flying.");
	}
}
