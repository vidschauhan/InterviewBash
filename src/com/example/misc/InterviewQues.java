package com.example.misc;

public class InterviewQues {

	public static void main(String[] args) {
		int a = 10;
		Test t = new Test();
		t.input(a, t);
		System.out.println(a +" "+ t.x);
		
	}

	
	
}

class Test{

	public int x;
	public void input(int p,Test y) {
		x=5;
	}
}

