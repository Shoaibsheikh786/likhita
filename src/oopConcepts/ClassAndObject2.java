package oopConcepts;

class Student
{  
   static String school="kv school";  //----------------------------> static varible 
	int roll_no;     //instance variables 
	String name;
	
	
   void printfDetails()     //instance methods will be created 
   {
	   System.out.println("roll_no "+roll_no +" name "+name);
   }
}

public class ClassAndObject2 {
   
	
	public static void main(String[] args) {
		
		Students s1=new Students();
		Students s2=new Students();
	
		s1.roll_no=123;
		s1.name="jhon";
		
		
		

		s2.roll_no=23;
		s2.name="sahil";
		
		s1.printfDetails();
		s2.printfDetails();
		
		System.out.println("****************");
		
	
		
		
		
		

	}

}
