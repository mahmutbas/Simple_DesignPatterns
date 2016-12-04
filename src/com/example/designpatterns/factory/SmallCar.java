package com.example.designpatterns.factory;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
	}

}
