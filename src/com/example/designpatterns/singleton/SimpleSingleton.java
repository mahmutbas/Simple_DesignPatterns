package com.example.designpatterns.singleton;

public class SimpleSingleton {

	private static SimpleSingleton myUnqObject;

	//create private constructor to district access
	private SimpleSingleton() {
	}

	public static SimpleSingleton getInstance() {
		if (myUnqObject == null)
			myUnqObject = new SimpleSingleton();
		return myUnqObject;
	}

	public void ekranaYaz() {
		System.out.println("Singleton has invoke!..");
	}

	public static void main(String[] args) {
		SimpleSingleton nesne = SimpleSingleton.getInstance();
		nesne.ekranaYaz();
	}
}
