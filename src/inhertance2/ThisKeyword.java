package inhertance2;

class A
{  
	int len;
	public void fun1()
	{
		System.out.println("hello world");
	}
}
public class ThisKeyword extends A{
	
	int len,bre;      //instance variable
	
	public void fun(int len,int bre)  //local 
	{
		this.len=len;   //len class vari
		this.bre=bre;
		super.len=len;
		
		System.out.println(len+bre);
		
	
	}
	
	public void fun1()
	{
		System.out.println("hello world");
	}
	
	
	
	

	public static void main(String[] args) {
		
		ThisKeyword obj1=new ThisKeyword();
		obj1.fun(5, 6);
		
		System.out.println(obj1.len);
		System.out.println(obj1.bre);

	}

}
