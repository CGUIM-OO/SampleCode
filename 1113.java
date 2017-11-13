/**
   This program demonstrates the FinalExam class,
   which extends the GradedActivity class.
*/

public class FinalExamDemo
{
   public static void main(String[] args)
   {

	    
	    Animal [] aniArray={
	    	new Dog(),
	    	new Cat()
	    };
	    for(Animal a : aniArray){
	    	a.Bark();
	    	System.out.println(a.name);
	    }
	    
	    giveShot(new Dog());
	    giveShot(new Cat());
	  Animal myAnimal = new Dog();
	    giveShot(myAnimal);
	    
	    //myAnimal.Bark();
	    //System.out.println(myAnimal.name);
   }
   public static void giveShot(Animal a){
	   a.Bark();
   }
}
class Cat extends Animal
{
	public String name="Cat Name";
   public Cat()
   {

   }
   public void Bark(){
	   System.out.println("Cat");
   }
}
class Dog extends Animal
{
	public String name="Dog Name";
   public Dog()
   {

   }
   public void Bark(){
	   System.out.println("Dog");
   }
}

class Animal
{
	public String name="Animal Name";

   public Animal()
   {
   }
   public void Bark(){
	   System.out.println("Animal");
   }
}
