package programs;

public class ReverseAnumber {

	public static void main(String[] args) {
     
		int num=1234;
		int rev=0;
		 
		while(num!=0)     //rem--> 1 , store--> rev= 4321,
		{
			int rem=num%10;   //get the last digit , not removing
			rev=rev*10+rem;  //to store the last value as well;
			num=num/10;    //remove the last digit 
			
		}
		
		System.out.println(rev);
		
	}

}
