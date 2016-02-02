package com.icarus.tutorial.designpattern.builder;

import java.util.ArrayList;
import java.util.Iterator;

public class AutomotiveRobotBuildable implements RobotBuildable {
	
	ArrayList<Integer> actions;
	
	public AutomotiveRobotBuildable() {
	}

	public final void go() {
		Iterator<Integer> itr = actions.iterator();
		while (itr.hasNext()) {
			switch (itr.next()) {
			case 1:
				start();
				break;
			case 2:
				getParts();
				break;
			case 3:
				assemble();
				break;
			case 4:
				test();
				break;
			case 5:
				stop();
				break;
			}
		}
		
	}
	
	public void start() {
		System.out.println("Starting...");
	}
	
	public void getParts() {
		System.out.println("Getting a carburetor...");
	}
	
	public void assemble() {
		System.out.println("Installing the carburetor...");
	}
	
	public void test() {
		System.out.println("Revving engine...");
	}
	
	public void stop() {
		System.out.println("Stopping...");
	}
	
	public void loadActions(ArrayList<Integer> a) {
		actions  = a;
	}

}
