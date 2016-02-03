package com.icarus.tutorial.designpattern.composite;

public class TestCoporation {
	
	Coporation coporation;
	
	public static void main(String[] args) {
		TestCoporation t = new TestCoporation();
	}
	
	public TestCoporation() {
		
		coporation = new Coporation();
		
		Division rnd = new Division("R&D");
		rnd.add(new VP("Steve", "R&D"));
		rnd.add(new VP("Mike", "R&D"));
		rnd.add(new VP("Nancy", "R&D"));
		
		Division sales = new Division("Sales");
		sales.add(new VP("Ted", "Sales"));
		sales.add(new VP("Bob", "Sales"));
		sales.add(new VP("Carol", "Sales"));
		sales.add(new VP("Alice", "Sales"));
		
		Division western = new Division("Western Sales");
		western.add(new VP("Wally", "Western Sales"));
		western.add(new VP("Andre", "Western Sales"));
		sales.add(western);
		
		VP vp = new VP("Cary", "At large");
		
		coporation.add(rnd);
		coporation.add(sales);
		coporation.add(vp);
		
		coporation.print();
	}

}
