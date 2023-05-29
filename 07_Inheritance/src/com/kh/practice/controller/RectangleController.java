package com.kh.practice.controller;

import com.kh.practice.model.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		
		int area = r.getWidth() * r.getHeight();
		
		return r.toString() + " / " + area;
	}
	
	public String calcPerimeter(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		int perimeter = (r.getWidth() + r.getHeight()) * 2;
		
		
		return r.toString() + " / " + perimeter;
	}
}
