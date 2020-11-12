package com.yaser.bounds.program;

import com.yaser.bounds.model.GeometricShape;
import com.yaser.bounds.model.Square;
import com.yaser.bounds.model.Triangle;

public class DriverBound {
	public static void main(String[] args) {
		GeometricShape<Triangle> geometricShape =new GeometricShape<Triangle>();
		Triangle triangle =geometricShape.create();
		System.out.println(triangle);
		System.out.println(triangle.getColor());//Blue RGBT
		System.out.println(triangle.calculateArea());
		
		//Square square =geometricShape.create(); // izin vermez cünkü Triangle olusturduk.
	}

}
