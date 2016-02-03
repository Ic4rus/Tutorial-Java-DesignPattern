package com.icarus.tutorial.designpattern.decorator;

public class Disk extends ComponentDecorator {
	
	Computer computer;
	
	public Disk(Computer c) {
		computer = c;
	}
	
	public String description() {
		return computer.description() + " and a disk";
	}

}
