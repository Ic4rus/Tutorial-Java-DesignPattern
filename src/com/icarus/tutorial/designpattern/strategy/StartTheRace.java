package com.icarus.tutorial.designpattern.strategy;

public class StartTheRace {
	
	public static void main(String[] args) {
		StreetRacer streetRacer = new StreetRacer();
		FormulaOne formulaOne = new FormulaOne();
		Helicoper helicoper = new Helicoper();
		Jet jet = new Jet();
		
		streetRacer.go();
		formulaOne.go();
		helicoper.go();
		jet.go();
	}

}
