package loopsStructure;

public class NestingLoop {

	public static void main(String[] args) {
    
		//nesting of for loop
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("j -> "+j+" i--> " +i);
			}
		}
	}

}
