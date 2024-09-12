package controlStructrure;

public class NestingIff {
	
	public static void main(String[] args) {
	//nesting of if
		//if inside the if
		
		
		//  age --> 18 and you names first char starts with 'a'
		// you will get scholorship 
		
		// && 
		
		int age=28;
		char ch='b';
		
		if(age>18)     //true
		{
			
			if(ch=='a')
			{
				System.out.println("You are eligible for scholorishp");
			}
			
		}
		else    // x
		{
			System.out.println(" you are not eligible");
		}
		
		
	}

}
