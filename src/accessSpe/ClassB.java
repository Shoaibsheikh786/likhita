package accessSpe;

public class ClassB  extends ClassA{

	
	
	/*
	 * int d;                     //default;
	public int p;
	private int pr;
	protected int pro;
	*/
	
	
	public void fun3()
	{
		System.out.println(pro);
		System.out.println(d);
		System.out.println(p);
	//	System.out.println(pr);   //pr is private only classA can access it
		
		defMethod();
	}
	public static void main(String[] args) {
		ClassA ob1=new ClassA();
		ob1.d=12;
		ob1.p=13;
		ob1.pro=14;
//		ob1.pr=15;
		
		
	}

}
