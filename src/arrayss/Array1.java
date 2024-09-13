package arrayss;

public class Array1 {

	public static void main(String[] args) {
    
		// Array 
		
		//Array is colletion of elements with simlar dataType
		
		// DataType var_name[]=new int[size];
		
		int a[]=new int[400];
		
		int b=12;
		int c=14;
		int d=55;
		
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("***************");
		
		a[0]=12;
		a[1]=13;
		a[2]=15;
		a[3]=16;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("***************");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	 
		
		
		
		
	}

}
