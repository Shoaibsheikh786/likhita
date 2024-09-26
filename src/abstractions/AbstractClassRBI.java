package abstractions;


abstract class Rbi
{
	// abstract and non abstract methods 
	// variables 
	//constructors 
	//1.--> we cant create object of an abstract class/interface 
	//2. to define a class is an abstract --> abstract
	//3.0 ---> 100%
	
	
	//1. abstract methods 
	public abstract void credit();
	
	//2. Non abstract Methods
	
	public void debit()
	{
		System.out.println("Debit logic");
	}
	
	Rbi()
	{
		System.out.println("RBi Constructor ");
	}
	
	
}
public class AbstractClassRBI {
  
	public static void main(String[] args) {
		
	}

}
