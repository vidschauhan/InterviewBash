package com.example.coreJava;

public class ImmutableClass {

	public static void main(String[] args) {		
		Age age = new Age();
		age.setDay(1);
		age.setMonth(2);
		age.setYear(2019);
		Student student = new Student(11009010,"D2001",age);
		System.out.println("Before Modification : "+student.getAge().getYear());
		student.getAge().setYear(1993);
		System.out.println("After Modification : "+student.getAge().getYear());

		
	}

}

/*
 * To create immutable class in java, you have to do following steps.
 * 
 * 1.Declare the class as final so it can’t be extended. 
 * 2.Make all fields private so that direct access is not allowed. 
 * 3.Don’t provide setter methods for variables 
 * 4.Make all mutable fields final so that it’s value can be assigned only once. 
 * 5.Initialize all the fields via a constructor performing deep copy. 
 * 6.Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference. 
 * Source : https://dzone.com/articles/how-to-create-an-immutable-class-in-java 

 * Immutable class is good for caching purpose because you don’t need to worry about the
 * value changes. Other benefit of immutable class is that it is inherently
 * thread-safe, so you don’t need to worry about thread safety in case of
 * multi-threaded environment.
 */
final class Student{

	private final int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", section=" + section + ", getId()=" + getId()
				+ ", getSection()=" + getSection() + ", Year=" + getAge().getYear() + "]";
	}
	private final String section;
	private final Age age;
	
	public Student(int id,String section,Age age) {
		this.id=id;
		this.section=section;
	    this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public String getSection() {
		return section;
	}
	public Age getAge() {
		/*Always return a clone of the Instance variable rather than refrence for that mutable objects.
		Here returning clone object of age which refers to clone object rather than actual value.
		This will lead to complete Immutable class even if it has mutable objects.*/
		
		Age cloneAge = new Age();
	    cloneAge.setDay(this.age.getDay());
	    cloneAge.setMonth(this.age.getMonth());
	    cloneAge.setYear(this.age.getYear());
	    return cloneAge;
	}
	
	
	
}

final class Age{
	
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
