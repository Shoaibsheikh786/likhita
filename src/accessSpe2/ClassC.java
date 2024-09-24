package accessSpe2;



import accessSpe.ClassA;

public class ClassC extends ClassA{
	
/*
 * 	int d;                     //default;
	public int p;
	private int pr;
	protected int pro;
	*/
	
	
	
	
	
	public void fun1()
	{
		System.out.println(pro);
	//	System.out.println(d);    //outside the package you can access def one
		System.out.println(p);
	//	System.out.println(pr);   //pr is private only classA can access it 
	//   defMethod();
	}
	
	public static void main(String[] args) {
		ClassC obj1=new ClassC();
		obj1.p =4;//public 
		obj1.pro=5;//protected
	}

}
