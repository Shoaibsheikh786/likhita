package accessSpe2;

import accessSpe.ClassA;

public class DirPro extends ClassA {
	
	//All code is present 
	
	public void myMethod()
	{
		//pr=4;
		p=5;
	//	d=5;  // because in different package
		pro=6;  //pro can be acccess via sub class
	}

	public static void main(String[] args) {
    
		//1. Directly to use/access in different package
		
		ClassA obj1=new ClassA();  //cnt + shift + o
		
		obj1.p=5;
	//	obj1.pro=5; outside the package  , directly we cant access 
	//	obj1.d=5 ; also not accessable from the differnt 
		
		
		
	}

}
