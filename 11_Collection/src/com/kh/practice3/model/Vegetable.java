package com.kh.practice3.model;

public class Vegetable extends Farm {

	public Vegetable() {
	}

	public Vegetable(String kind, String name) {
		super(kind, name);
		
	}

	@Override
	public String toString() {
		return "Vegetable [getKind()=" + getKind() + ", getName()=" + getName();
	}

	
}
