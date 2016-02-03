package com.icarus.tutorial.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Coporation extends Coporate {
	
	private ArrayList<Coporate> coporate = new ArrayList<Coporate>();
	
	public Coporation() {
	}
	
	public void add(Coporate c) {
		coporate.add(c);
	}
	
	public void print() {
		Iterator iterator = coporate.iterator();
		while (iterator.hasNext()) {
			Coporate c = (Coporate) iterator.next();
			c.print();
		}
	}

}
