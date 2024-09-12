package basics;

public class FloatPractice {

	public static void main(String[] args) {
   
		// 10.5 + 3.8;
		
		float num1=10.5f;
		float num2=5.8f;
		
		float num3=num1+num2;
		System.out.print("The sum is ");
		System.out.println(num3);  // The sum is 14.3
		
		//we can write in one method
		System.out.println("The sum is "+ num3);
		
		//14.3 is the sum 
		
		System.out.println(num3+" is the sum");
		
		boolean b=num1<num2;   // true / false
		System.out.println(b);
		
	}

}
