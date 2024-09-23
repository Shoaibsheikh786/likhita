package inhertance2;

public class Cat1 extends Animal1 {
	
	// ? methods 
	//2.
	
	Cat1()
	{  
		//enter ---> 
		System.out.println("Cat1 Constructor");
	}
	
	void meow()
	{
		System.out.println("meow meow");
	}
	
	public static void main(String[] args) {
		
	//	Animal1 obj1=new Animal1();
		
		
		Cat1 obj1 =new Cat1();   // --> ? 
		obj1.eat();
		obj1.takeWater();
		obj1.meow();
		
		//2 . ref --> parent , obj--> child class
		//we can call only prent's classes methods 
		
		
		Animal1 obj2=new Cat1();
		obj2.takeWater();
		obj2.eat();
	//	obj2.meow();  
		
		
		
		
	}

}
