package methods;

public class Method2 {

	
	//method 2 ---> void methodName(DataType varibale)
	
static	void add(int p,int q)
	{
		int a=p;
		int b=q;
		
		System.out.println(a+b);
		
		
	}

static	void subFloat(float p,float q)
{
	float a=p;
	float b=q;
	
	System.out.println(a-b);
	
	
}
	
	public static void main(String[] args) {
		
		add(5,6);
		add(100,34);
		
		subFloat(100f,20.5f);

	}

}
