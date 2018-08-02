package com.example.coreJava;

/*1.The objects which implement Cloneable interface are only eligible for cloning process.
2.Cloneable interface is a marker interface.
3.The default version of clone() method creates the shallow copy of an object.
4.To create the deep copy of an object, you have to override the clone() method.
5.clone() method of the object class support shallow copy of the object. 
If the object contains primitive as well as nonprimitive or reference type variable in shallow copy,
the cloned object also refers to the same object to which the original object refers
as only the object references gets copied and not the referred objects themselves
*/
public class ShallowCopy {

	public static void main(String[] args) {
		 Course science = new Course("Physics", "Chemistry", "Biology");
	     Students student1 = new Students(111, "John", science);
	 
	     Students student2 = null;
	 
	        try
	        {
	            //Creating a clone of student1 and assigning it to student2
	 
	            student2 = (Students) student1.clone();
	        }
	        catch (CloneNotSupportedException e)
	        {
	            e.printStackTrace();
	        }
	 
	        //Printing the subject3 of 'student1'
	 
	        System.out.println(student1.course.sub3);         //Output : Biology
	 
	        //Changing the subject3 of 'student2'
	 
	        student2.course.sub3 = "Maths";
	 
	        //This change will be reflected in original student 'student1'
	 
	        System.out.println(student1.course.sub3);       //Output : Maths

	}

}

/*If original object has any references to other objects as fields,
then only references of those objects are copied into clone object, copy of those objects are not created*/


class Students implements Cloneable{
	int id;
	String Section;
	Course course;
	
	public Students(int id, String section, Course course) {
		super();
		this.id = id;
		Section = section;
		this.course = course;
	}
	
	//The default version of clone() method creates the shallow copy of an object
	protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
}

class Course{
	String sub1;
	String sub2;
	String sub3;
	
	public Course(String sub1,String sub2,String sub3)
	{
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	public String getSub3() {
		return sub3;
	}

	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}

	
	
}