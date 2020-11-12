package com.yaser.model;

public class GenericCargoTruck<T> {
	private T object;

	public GenericCargoTruck(T obkject) {
		this.object = object;
	}
	
	
	public T getObject() {
		return object;
	}
	
	public void setObject(T object) {
		this.object = object;
	}

}
