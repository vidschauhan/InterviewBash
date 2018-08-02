package com.example.overridingConcepts;

/*So the order of Scope is private >protected>default>public
 * Incase of Protected derived class should not be default and parent class method protected. but can be vice-verca*/
public class OverridingExample {
	
	public static void main(String[] args) {
	Alpha alpha = new Alpha();
	alpha.show(); //Beta implementation. 
	System.out.println(alpha.x); // Inheritance doesn't work on instance variables.
	/*Beta beta = (Beta) new Alpha();
	beta.show(); // class cast exception
*/	
	}
}
