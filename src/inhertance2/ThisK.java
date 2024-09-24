package inhertance2;

class Super1
{
	int num1;
	public void fun1()
	{
		System.out.println("hello world");
	}
}
public class ThisK extends Super1{
	
	
	int num1;
	
	public void fun2(int a,int b)
	{   
		this.num1=a;
		super.num1=b;
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisK obj1=new ThisK();
		obj1.fun2(10, 12);
		
		System.out.println(obj1.num1 +"  "+ obj1.num1);

	}

}
