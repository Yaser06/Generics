package com.yaser.factory.model;

public class ClassFactory <T> {
	private Class <T> type;
	
	public ClassFactory(Class <T> type) {
		this.type=type;
	}
	
	public T create() throws InstantiationException,IllegalAccessException {
		return type.newInstance();
	}
	
}
