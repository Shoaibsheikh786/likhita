package programs;

public class PrintOddNumbers {

	public static void main(String[] args) {
     
		//print numbers from 1 to 100
		
		//System.out.println(1);
		
		for(int i=1;i<=100;i++)
		{
			
			if(i%2!=0)
			{
				System.out.println("Odd "+ i); //dependent 
			}
			
		}
	}

}
