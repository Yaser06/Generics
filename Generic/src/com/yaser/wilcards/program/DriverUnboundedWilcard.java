package com.yaser.wilcards.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yaser.wilcards.model.Apple;
import com.yaser.wilcards.model.Orange;

public class DriverUnboundedWilcard {

	public static void main(String[] args) {
		// ? wilcard ile herhangi birsey
		List<?> fruits = new ArrayList<Apple>();
		List<?> fruits2 = new ArrayList<Orange>();
		// Bu sekilde eklemeye izin vermiyor.Cünkü herhangi birsey olabilir.
		// fruits.add(new Apple());
		// fruits.add(new Fruit());
		fruits.get(0);

		// BEFORE JAVA 1.5
//				List list =new ArrayList();
//				list.add(new Apple());
//				list.add(new Orange());
		// ...

		Map<?, ?> map = new HashMap<Object, Object>();
//				map.put(new Apple(), "1");
//				map.put(new Fruit(), new Orange());
	}
}
