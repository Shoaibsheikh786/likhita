package oopConcepts;


class Box1
{
	int length;
	int breadth;
	int height;
	
	void add()            //return type ;  methodname
	{
		System.out.println("hello ");
	}
	
	//specail method (Constructor)
	//--> it doest not have return type 
	//1. --> methodName should be same as ClassName();
	//2. --> it will automatically be called, we cant call it 
	//3. --> it will invoked at the time of creating object 
	//4. --> one time , for each object 
	
	//Note : if we dont create constructor , 
	//java will automatically create (default Constructor)
	Box1(int a)
	{
		System.out.println("this is the value "+a);
	}
	
	Box1()
	{
		System.out.println("this is simple constructor");
	}
	
	
	
	
	
}
public class Constructors {

	public static void main(String[] args) {
	  
	
		
		
	}

}
