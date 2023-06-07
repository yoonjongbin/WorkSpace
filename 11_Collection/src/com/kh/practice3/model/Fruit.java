package com.kh.practice3.model;

public class Fruit extends Farm {

	public Fruit() {
	}

	public Fruit(String kind, String name) {
		super(kind, name);
		
	}

	@Override
	public String toString() {
		return "Fruit [getKind()=" + getKind() + ", getName()=" + getName();
	}
	
	
	
	
}
