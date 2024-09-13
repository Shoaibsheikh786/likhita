package loopsStructure;

public class BreakKeyword {

	public static void main(String[] args) {
		
		int a=10;
		
		for(int i=0;i<a;i++)  //i--> 0,1,2
		{  
		  if(i!=0)   // value i ==2   // 
		  {
			  break;  
		  }
		  
		  System.out.println(i);   // 0 1 hello world
			
		}
		
		System.out.println("hello wrod ");
  
	}

}
