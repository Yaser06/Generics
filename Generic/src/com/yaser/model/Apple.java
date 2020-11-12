package com.yaser.model;

public class Apple implements Generator<Apple> {
	private static int count;
	private int id=count++;
	@Override
	public Apple next() {
		// TODO Auto-generated method stub
		return new Apple();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Apple" + id;
	}
	

}
