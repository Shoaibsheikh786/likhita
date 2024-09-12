package programs;

public class PlanidromeNumber {

	public static void main(String[] args) {
    
		// 12321 ---> 12321   //palindrome
		
		int num=1239;
		int onum=num;  
		int rev=0;
		
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
	
		
		if(rev==onum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("it is not plaindrome");
		}
		
		
	}

}
