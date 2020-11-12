package com.yaser.factory.driver;

import com.yaser.factory.model.ClassFactory;
import com.yaser.factory.model.Student;

public class DriverClassFactory {
	public static void main(String[] args) {
		ClassFactory<Student> factory= new ClassFactory<Student>(Student.class);
		Student student =null;
		try {
			factory.create();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(student);
	}

}
