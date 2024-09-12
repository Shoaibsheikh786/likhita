package methods;

public class Method1Example {
	
	static void printMyName()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Likhita");
		}
	}
	
	static void printBatchDet()
	{
		System.out.println("My Batch Details");
	}
	
	public static void main(String[] args) {
		printMyName();
		
		System.out.println("*********************");
		printMyName();
		
		printBatchDet();
	}

}
