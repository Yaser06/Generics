package com.yaser.bounds.model;

public class GeometricShape <T extends Dimension & Colorable> {
	
	public	T create(){
		Dimension dimension =new Triangle();
		return (T) dimension;
	}
	

}
