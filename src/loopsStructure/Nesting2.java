package loopsStructure;

public class Nesting2 {

	public static void main(String[] args) {
   
		for(int i=0;i<2;i++)      //i=0,1,2
		{  
			System.out.println("for 1");  
			for(int j=1;j<2;j++)  //j=1,2,1,2;
			{
				System.out.println("Hello world");
			}
			
		}
		
		//--->
	}

}


//output --->
/*for 1
 *Hello world
 *for 1 
 *Hello world 
 * */
