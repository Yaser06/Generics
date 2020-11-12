package com.yaser.wilcards.program;

import java.util.ArrayList;
import java.util.List;

import com.yaser.wilcards.model.Apple;
import com.yaser.wilcards.model.Fruit;
import com.yaser.wilcards.model.GrannySmith;
import com.yaser.wilcards.model.Orange;

public class DriverList {
	public static void main(String[] args) {
		//Compile time error.
		//List<Fruit>fruits =new ArrayList<Apple>();
		// Fruit diyoruz ama Apple ekliyoruz.
		
		List<Apple> apples =new ArrayList<Apple>();
		 //apples.add(new Orange());
		 apples.add(new GrannySmith());
		 
		 List<? extends Fruit> fruits =new ArrayList<Apple>();
		 fruits=new ArrayList<Orange>();
		 //E =? extends Fruit  oldu E-->> Tip
		 //fruits.add(new Apple()); -->> extends okumak icin yazmak icin super kullaniyoruz.
		 
		 fruits.add(null); // buna izin veriyor sadece kaynak kodda aciklamasi bulunmaktadir.
		 Fruit apple=fruits.get(0);
	}
}
