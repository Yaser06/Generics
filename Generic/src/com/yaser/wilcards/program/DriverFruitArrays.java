package com.yaser.wilcards.program;

import com.yaser.wilcards.model.A;
import com.yaser.wilcards.model.Apple;
import com.yaser.wilcards.model.Fruit;
import com.yaser.wilcards.model.GoldenGrannySmith;
import com.yaser.wilcards.model.GrannySmith;
import com.yaser.wilcards.model.Orange;

public class DriverFruitArrays {
	public static void main(String[] args) {
		Fruit[] fruits =new Apple[10];
		//Not up casting
		fruits[0] =new Apple();
		fruits[1]=new GrannySmith();
		//fruits[2]=new Orange(); //ArrayStoreException
		fruits[3]=new GoldenGrannySmith();
		//fruits[3]=new Fruit();//ArrayStoreException
		//fruits[4]=new A();//ArrayStoreException
		
	}

}
