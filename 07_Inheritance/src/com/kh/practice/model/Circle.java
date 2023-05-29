package com.kh.practice.model;

public class Circle extends Point{
	private int radius;
	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", 반지름 : " + radius;
	}
	
	public String draw() {
		return super.draw() + ", 반지름 : " + this.radius;
	}
	
	
	
}
