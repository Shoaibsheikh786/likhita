package operators;

public class ArthimaticOp {

	public static void main(String[] args) {
   
		// + - * / 
		// % moduls --> 
		
		
		int a=100;
		float b=3f;
		
//		int c= a+b;
//		System.out.print(c);
//		System.out.println("subtraction");
		
		System.out.println(a-b);
		
		System.out.println(a*b);
		
		float d= a/b;      // Rule: -> int / int =int 
		System.out.println(d);
		
	 int p=10;
	 int q=5;
	 
	 int r=p%q;
	 int s=p/q;
	 
	 System.out.println("the value of r % ->"+r); // 0
	 System.out.println("the value of s / ->"+s); // 2
	}

}
