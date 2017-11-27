
public class E1127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bark();
		//Bark("hahaha");
		Super s1=new Super();
		System.out.println(s1.varA);
		Sub s2=new Sub();
		System.out.println(s2.varA);
		Super s3=new Sub();
		System.out.println(s3.varA);
		System.out.println(s3.methodM());
	}
	public static void Bark(){
		System.out.println("test");
	}
	public static void Bark(String s){
		System.out.println("test and "+s);
	}
}


class Test implements Relatable{

	@Override
	public boolean equals() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGreater() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLess() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

interface Relatable
{
   boolean equals();
   boolean isGreater();
   boolean isLess();
}

/**
This class holds data for a computer science student.
*/

class CompSciStudent extends Student
{
// Required hours
private final int MATH_HOURS = 20;   // Math hours
private final int CS_HOURS = 40;     // Comp sci hours
private final int GEN_ED_HOURS = 60; // Gen ed hours

// Hours taken
private int mathHours;  // Math hours taken
private int csHours;    // Comp sci hours taken
private int genEdHours; // General ed hours taken

/**
   The Constructor sets the student's name, 
   ID number, and the year admitted.
   @param n The student's name.
   @param id The student's ID number.
   @param year The year the student was admitted.
*/

public CompSciStudent(String n, String id, int year)
{
   super(n, id, year);
}

/**
   The setMathHours method sets the number of 
   math hours taken.
   @param math The math hours taken.
*/

public void setMathHours(int math)
{
   mathHours = math;
}

/**
   The setCsHours method sets the number of 
   computer science hours taken.
   @param cs The computer science hours taken.
*/

public void setCsHours(int cs)
{
   csHours = cs;
}

/**
   The setGenEdHours method sets the number of 
   general ed hours taken.
   @param genEd The general ed hours taken.
*/

public void setGenEdHours(int genEd)
{
   genEdHours = genEd;
}

/**
   The getRemainingHours method returns the
   the number of hours remaining to be taken.
   @return The hours remaining for the student.
*/

@Override
public int getRemainingHours()
{
   int reqHours,        // Total required hours
       remainingHours;  // Remaining hours

   // Calculate the required hours.
   reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
   
   // Calculate the remaining hours.
   remainingHours = reqHours - (mathHours + csHours
                      + genEdHours);
                      
   return remainingHours;
}

/**
   The toString method returns a string containing
   the student's data.
   @return A reference to a String.
*/

@Override
public String toString()
{
   String str;

   str = super.toString() +
      "\nMajor: Computer Science" +
      "\nMath Hours Taken: " + mathHours +
      "\nComputer Science Hours Taken: " + csHours +
      "\nGeneral Ed Hours Taken: " + genEdHours;

   return str;
}
}

/**
The Student class is an abstract class that holds
general data about a student. Classes representing
specific types of students should inherit from
this class.
*/

abstract class Student
{
	private String name;       // Student name
	private String idNumber;   // Student ID
	private int yearAdmitted;  // Year admitted

/**
   The Constructor sets the student's name,
   ID number, and year admitted.
   @param n The student's name.
   @param id The student's ID number.
   @param year The year the student was admitted.
*/

public Student(String n, String id, int year)
{
   name = n;
   idNumber = id;
   yearAdmitted = year;
}

/**
   The toString method returns a String containing
   the student's data.
   @return A reference to a String.
*/

public String toString()
{
   String str;

   str = "Name: " + name
      + "\nID Number: " + idNumber
      + "\nYear Admitted: " + yearAdmitted;
   return str;
}

/**
   The getRemainingHours method is abstract.
   It must be overridden in a subclass.
   @return The hours remaining for the student.
*/

	public abstract int getRemainingHours();
}



class Super {
	int varA = 10;
	int varB = 20;
	int methodM() { return varA; }
	int methodN() { return varB; }
}
class Sub extends Super {
	int varA = 30;
	int varC = 40;
	int methodM() { return varA; }
	int methodK() { return varC; }
}
