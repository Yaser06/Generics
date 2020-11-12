package com.yaser.model;

import java.util.Collection;

public class GeneretorUtil {

	public static <T> Collection<T> fillCollection (Collection collection, Generator generator,int n){
		for (int i = 0; i < n; i++) {
			collection.add(generator.next());
		}
		
		return collection;
		
	}
}
