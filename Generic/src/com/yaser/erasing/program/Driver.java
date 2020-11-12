package com.yaser.erasing.program;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		
		Class clazz1 = new ArrayList<Integer>().getClass();
		Class clazz2 = new ArrayList<String>().getClass();

		if (clazz1 == clazz2) {
			System.out.println("Yes they are same class");// Paremetreler siliniyor.Ayný görüyor.
		}

		System.out.println(Arrays.toString(clazz1.getTypeParameters())); // Parametre Integer yazmasýna ragmen [E]
		// Görüyoruz sebebi erasing islemi arka tarafa gecerken obje olarak
		// gecmektedir.Eskiye uyumluluk.
		System.out.println(Arrays.toString(clazz2.getTypeParameters()));
	}

}
