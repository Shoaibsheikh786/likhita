package accessSpe;

public class ClassA {

	//access Specifiers/Modifiers 
	// determine the visiblity or scope of constructors 
	//methods , variables of a class 
	
	//1. public 
	//2. private 
	//3. protected 
	//4. _______ Default
	
	int d;                     //default;
	public int p;
	private int pr;
	protected int pro;
	
	void fun1()                 //access spec --> defalut 
	{
		System.out.println("access the private "+pr);
	}
	void defMethod()
	{
		System.out.println("i am defalut one");
	}
	public static void main(String[] args) {
    
	}

}
