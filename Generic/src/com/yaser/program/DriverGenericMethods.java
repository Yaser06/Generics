package com.yaser.program;

import com.yaser.model.Apple;
import com.yaser.model.Computer;
import com.yaser.model.GenericMethods;

public class DriverGenericMethods {

	public static void main(String[] args) {
		GenericMethods genericMethods=new GenericMethods();
		// Genericlestirmeyle bize sagladigi kolaylik.
		genericMethods.f(new Apple());
		genericMethods.f(new Computer());
		genericMethods.f(4);// Buna �zel metodu var ona girdi.O olmasayd� 4 ciktisini alirdik.
	}
}
