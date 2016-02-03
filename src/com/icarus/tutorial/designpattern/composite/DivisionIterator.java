package com.icarus.tutorial.designpattern.composite;

import java.util.Iterator;

public class DivisionIterator implements Iterator {
	
	private Coporate[] coporate;
	private int location = 0;
	
	public DivisionIterator(Coporate[] c) {
		coporate = c;
	}
	
	public Coporate next() {
		return coporate[location++];
	}
	
	public boolean hasNext() {
		if (location < coporate.length && coporate[location] != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void remove() {
		
	}

}
