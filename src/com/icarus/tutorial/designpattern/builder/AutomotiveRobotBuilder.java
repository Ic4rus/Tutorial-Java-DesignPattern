package com.icarus.tutorial.designpattern.builder;

import java.util.ArrayList;

public class AutomotiveRobotBuilder implements RobotBuilder {
	
	AutomotiveRobotBuildable robot;
	ArrayList<Integer> actions;
	
	public AutomotiveRobotBuilder() {
		robot = new AutomotiveRobotBuildable();
		actions = new ArrayList<Integer>();
	}

	public void addStart() {
		actions.add(new Integer(1));
	}

	public void addGetParts() {
		actions.add(new Integer(2));
	}

	public void addAssemble() {
		actions.add(new Integer(3));
	}

	public void addTest() {
		actions.add(new Integer(4));
	}

	public void addStop() {
		actions.add(new Integer(5));
	}

	public RobotBuildable getRobot() {
		robot.loadActions(actions);
		return robot;
	}

}
