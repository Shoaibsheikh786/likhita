package oopConcepts;

public class Students {
	
	int rollno;
	String name;
	String address;
	
	Students(int r,String n,String a)
	{
		rollno=r;
		name=n;
		address=a;
	}
	
	

	public static void main(String[] args) {
		Students s1=new Students(5,"shaoib","hyderabad");
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.address);
		
		
		
	//	Students s2=new Students();
		
		

	}

}
