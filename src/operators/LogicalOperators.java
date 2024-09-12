package operators;

public class LogicalOperators {
  
	public static void main(String[] args) {
		// logical operators 
		//&& || 
		
		boolean a=true;
		boolean b=false;
		
		boolean c=a  && b;  //true && true ==> true
		boolean d=a || b;  //true && ?  --> true 
		
		System.out.println(c);
		System.out.println(d);
		
		
		boolean f= 5 > 4 && 6 < 4;
		System.out.println(f);
	}
}
