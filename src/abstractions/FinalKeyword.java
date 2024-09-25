package abstractions;


//3. final with class we cant extend it .
 class A
{  
	//2 final with methods , they can't be overridden 
final	void fun1()
	{
	 System.out.println("final fun1");	
	}
	void fun2()
	{
		System.out.println("without final");
	}
}



public class FinalKeyword extends A {
	
	//1.  final with varialbe ;
  final int a=5;
  
	void fun2()
	{
		System.out.println("without final is overridden");
	}
//		void fun1()
//	{
//	 System.out.println("final fun1");	
//	}
  
  
	public static void main(String[] args) {
		FinalKeyword obj1=new FinalKeyword();
		//obj1.a=10;
		System.out.println(obj1.a);
	}

}
