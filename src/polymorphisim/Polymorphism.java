package polymorphisim;

public class Polymorphism {
	
	//for method overloading 
	  //1.method name should be , arugemnts diff.
	  //2. they both should be in same class
	  //3. it can be in the superclass
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	//takes 2 float 
	void add(float f,float f2)
	{
		System.out.println(f+f2);
	}
	
	void add(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}


	public static void main(String[] args) {
		
		Polymorphism obj1=new Polymorphism();
		obj1.add(12,15);
		obj1.add(5.3f, 4.4f);
		obj1.add(1,2,6);
		obj1.add(1, 3,6);
	}

	}


