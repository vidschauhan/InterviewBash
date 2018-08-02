package com.example.coreJava;

public class ThreadSafeSingleton {

	public static void main(String[] args) {
	
		ASingleton singleton = ASingleton.getInstance();
		System.out.println(singleton);

	}

}

class ASingleton {

	private static volatile ASingleton instance;
	private static Object mutex = new Object();

	private ASingleton() {
	}

	public static ASingleton getInstance() {
		ASingleton result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new ASingleton();
			}
		}
		return result;
	}

}

