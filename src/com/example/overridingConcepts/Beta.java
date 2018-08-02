package com.example.overridingConcepts;

public class Beta extends Alpha {

	public int x=20;
	@Override
	 public void show() {
		System.out.println("This is Beta Implementation");
	}
}
