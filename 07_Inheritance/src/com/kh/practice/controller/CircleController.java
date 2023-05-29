package com.kh.practice.controller;

import com.kh.practice.model.Circle;

public class CircleController {
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = (c.getRadius() * c.getRadius()) * Math.PI;
		
		return c.toString() + " / " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = (c.getRadius() * 2) * Math.PI;
		
		return c.toString() + " / " + circum;
	}
}
