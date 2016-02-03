package com.icarus.tutorial.designpattern.composite;

import java.util.Iterator;

public class Division extends Coporate {
	
	private Coporate[] coporate = new Coporate[100];
	private int number = 0;
	private String name;
	
	public Division(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void add(Coporate c) {
		coporate[number++] = c;
	}
	
	public Iterator iterator() {
		return new DivisionIterator(coporate);
	}
	
	public void print() {
		Iterator iterator = iterator();
		
		while (iterator.hasNext()) {
			Coporate c = (Coporate) iterator.next();
			c.print();
		}
	}

}
