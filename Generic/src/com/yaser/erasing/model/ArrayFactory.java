package com.yaser.erasing.model;

import java.lang.reflect.Array;

public class ArrayFactory <T> {
	
	private Class <T> type;
	
	public ArrayFactory(Class <T> type) {
		this.type=type;
	}

	public T[] createArray (int size) {
		
		return (T[])Array.newInstance(type, size);
	}
	
}
