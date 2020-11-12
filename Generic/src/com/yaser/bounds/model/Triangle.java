package com.yaser.bounds.model;

import java.awt.Color;

public class Triangle extends Dimension implements Colorable {
	
	private String name;
	
	public Triangle() {
		this.name = "None";
	}
	public Triangle(String color) {
		System.out.println("Beyaz");
	}
	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return super.calculateArea();
	}
	@Override
	public String toString() {
		return "Triangle " + name;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.blue;
	}

}
