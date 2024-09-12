package controlStructrure;

public class GreatestOfThreeDigit {

	public static void main(String[] args) {
   
		//1. Three numbers ___, ____, ____, greatestNUmbe
		
		int a,b,c;
		a=1000;
		b=1000;
		c=1000;
		
		//check for the equal 
		// even or odd ---> if --else ;   
		// check greatest of 4 digit number
		
		if(a>b&&a>c)  //true && true  --> true
		{
			System.out.println("a is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
		
		
		
	}

}
