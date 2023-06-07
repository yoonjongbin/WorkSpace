package com.kh.practice3.model;

public class Nut extends Farm {

	public Nut() {
	}

	public Nut(String kind, String name) {
		super(kind, name);
		
	}

	@Override
	public String toString() {
		return "Nut [getKind()=" + getKind() + ", getName()=" + getName();
	}
	
}
