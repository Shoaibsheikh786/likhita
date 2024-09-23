package inheritance;

public class Cat extends Dog {
	
	

	
	void meow()
	{
		System.out.println("meow meow ");
	}

	public static void main(String[] args) {
		
		Cat cat1=new Cat();
		
		cat1.eat();
		cat1.takeWater();
		
		
    
	}

}
