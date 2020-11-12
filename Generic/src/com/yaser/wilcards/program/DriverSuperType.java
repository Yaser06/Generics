package com.yaser.wilcards.program;

import java.util.ArrayList;
import java.util.List;

import com.yaser.wilcards.model.A;
import com.yaser.wilcards.model.Apple;
import com.yaser.wilcards.model.Fruit;
import com.yaser.wilcards.model.GoldenGrannySmith;
import com.yaser.wilcards.model.GrannySmith;
import com.yaser.wilcards.model.Orange;

public class DriverSuperType {
	
	static void writeTo(List < ? super Fruit > apples) {
					//List <T super Fruit > apples // Olmaz bu sekilde
					//? Herhangi bir diyoruz bu sekilde.
		apples.add(new Apple());
		apples.add(new GrannySmith());
		apples.add(new GoldenGrannySmith());
		
		//
		apples.add(new Fruit());
		apples.add(new Orange());
		//apples.add(new A()); Not fruit
		apples.get(0);
		
	}
	public static void main(String[] args) {
		
		writeTo(new ArrayList<Fruit>());
		
		
		
	}

}
