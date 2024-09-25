package polymorphisim;

public class Cat extends Animal{
	
	// mewo meow
	//methods name and arguments should be same
	//they should in differnt calsses 
	
	//override
	@Override
	void makeSound()
	{
		System.out.println("meow meow");
	}
	
	public static void main(String[] args) {
		Cat obj1=new Cat();
		obj1.eat();
		obj1.makeSound();
		
		System.out.println("Hello");
		System.out.println(1);
		System.out.println(4.5);
	}

}
