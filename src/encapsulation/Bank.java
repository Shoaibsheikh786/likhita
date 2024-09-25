package encapsulation;

class Divison
{
	private int num1,num2;   // 4/0--> Undefined
	
	public void getter(int a,int b)
	{
		if(b!=0)
		{
			num1=a;
			num2=b;
	    System.out.println(num1/num2);
		}
		else
		{
			System.out.println("num2 cant be zero");
		}
	}
	
   
}


public class Bank {
	
   
	public static void main(String[] args) {
		
		Divison obj1=new Divison();
		obj1.getter(10,2);

		
		

	}

}
