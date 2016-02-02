package com.icarus.tutorial.designpattern.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRobotBuilder {
	
	public static void main(String[] args) {
		
		RobotBuilder builder;
		RobotBuildable robot;
		String response = "a";
		
		System.out.println("Do you want a cookie robot [c] or an automotive robot [a]? ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			response = reader.readLine();
		} catch (IOException e) {
			System.err.println("Error");
		}
		
		if (response.equals("c")) {
			builder = new CookieRobotBuilder();
		} else {
			builder = new AutomotiveRobotBuilder();
		}
		
		builder.addStart();		
		builder.addTest();
		builder.addAssemble();
		builder.addStop();
		
		robot = builder.getRobot();
		
		robot.go();
	}

}
