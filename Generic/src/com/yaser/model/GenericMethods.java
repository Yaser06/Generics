package com.yaser.model;

public class GenericMethods {
	
	public <E> void f(E e) {
		System.out.println(e);
	}

	//Generic kullanmazsak asagidakileri tek tek özel özel yazmamiz gerekir.Her nesne icin.
	
	
	public void f (int a){
		System.out.println("HERE int");
	}
	
//	public void f(Computer computer) {
//		System.out.println("Computer private state");
//	}
//	
//	public void f(Apple apple) {
//		System.out.println("Apple private state");
//	}
}
