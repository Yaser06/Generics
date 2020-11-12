package com.yaser.program;

import com.yaser.model.Apple;
import com.yaser.model.Computer;
import com.yaser.model.GenericCargoTruck;

public class DriverGenericAfterV5 {
	
	// Generic kullanmak istememizin en b�y�k sebebi hatalari biz runtimede almak istemeyiz.Hatalar� 
	// Compiler time cekmek isteriz buda bize b�yle bir avantaj sa�lar.
	
	public static void main(String[] args) {
		GenericCargoTruck<Computer> cargo =new GenericCargoTruck<Computer>(new Computer());
		Computer computer =cargo.getObject();
		
		checkComputer(cargo);
		
		
		GenericCargoTruck<Apple> cargoApple=new GenericCargoTruck<Apple>(new Apple());
		Apple apple =cargoApple.getObject();
		
		
		//checkComputer(cargoApple); // izin vermez c�nk� Apple
		
		
		//Apple apple=(Apple)cargo.getObject();
		//�zin vermiyor.Generic ifadeler compiler tamda baska nesne eklememize izin vermez.
		//checkComputer(new Apple()); // izin vermiyor.Computer degil
		
		
		
		
	}
	public static void checkComputer(GenericCargoTruck<Computer> cargo) {
		Computer computer = cargo.getObject();
	}

}
