package oopConcepts;

class Box
{
	//what all things i can keep in the class 
	//1. variables 
	//2. methods 
	int length;
	int breadth;
	int height;
	
	void printLength()
	{
		System.out.println("length of box "+length);
	}
	void printBreadth()
	{
		System.out.println("length of box "+breadth);
	}
	
	
}



public class ClassAndObjects {
	
	public static void main(String[] args) {
		//1. class and object
		//class name refVar=new className();
		Box b1=new Box();
		Box b2=new Box();
		b1.length=10;
		b1.breadth=20;
		b1.height=30;
		
		b2.length=20;
		b2.breadth=40;
		b2.height=50;
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		b1.printBreadth();
		b2.printBreadth();
		
		
		
	}

}
