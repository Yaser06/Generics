package com.yaser.program;

import com.yaser.model.Apple;
import com.yaser.model.GenericStaticMethods;

public class DriverGenericStaticMethod {
	public static void main(String[] args) {
		GenericStaticMethods.StaticMethods(25); // static metodlar class ismiyle instance almadan cagirirlar.
		GenericStaticMethods.StaticMethods(new Apple());
	}
}
