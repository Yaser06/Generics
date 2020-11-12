package com.yaser.erasing.program;

import java.util.Arrays;

import com.yaser.erasing.model.ArrayFactory;

public class DriverArrayFactory {
	public static void main(String[] args) {
		
		ArrayFactory<String> factory=new ArrayFactory<String>(String.class);
		String [] array=factory.createArray(10);
		System.out.println(Arrays.toString(array));
		
	}
}
