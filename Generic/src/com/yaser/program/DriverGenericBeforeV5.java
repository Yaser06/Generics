package com.yaser.program;

import com.yaser.model.Apple;
import com.yaser.model.CargoTruckWithObject;
import com.yaser.model.Computer;

public class DriverGenericBeforeV5 {
	
	public static void main(String[] args) {
		CargoTruckWithObject cargoTruckWithObject=new CargoTruckWithObject(new Apple());// apple objesi
		CargoTruckWithObject cargoTruckWithObject2=new CargoTruckWithObject(new Computer());// Computer objesi
		
		Computer object=(Computer)cargoTruckWithObject2.getObject();
		Apple object2 =(Apple)cargoTruckWithObject.getObject();
		
		
		checkCargoApple(cargoTruckWithObject2); //Apple ekleniyor mu diye kontrol ediyorum.Ama computer ekliyorum.
		// Suan class cast exception aldik.Cünkü ben computer objesi eklemeye calisiyorum.
		// Genericler gelmeden tek tek kontrol edip. Casting islemi yapiyorduk.
		checkCargoApple(cargoTruckWithObject); // Sorunsuz calisir.Cünkü apple objesi
	}
	
	public static void checkCargoApple(CargoTruckWithObject cargoTruckWithObject) {
		Apple apple =(Apple)cargoTruckWithObject.getObject();
	}

}
