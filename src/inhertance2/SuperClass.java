package inhertance2;


class Super3
{
	Super3()
	{
		System.out.println("Hello Super 3");
	}
	
	Super3(int a)
	{
		System.out.println("Constructor with argument "+a);
	}
}
public class SuperClass extends Super3{
	
	SuperClass()
	{
		//super(6) ; //parents default constructor
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		SuperClass obj1=new SuperClass();
	}

}
