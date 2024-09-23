package oopConcepts;

class Employee {

	int id;
	float salry;
	static String company;

	static void staticMethod() {
		System.out.println("this is a staic method");
	}
	
	void nonStatic()
	{
		System.out.println("Non static method");
	}
}

public class Emp {

	public static void main(String[] args) {
		Employeeee.staticMethod();
//		Employee.nonStatic();
		
		
		Employeeee.company = "Hp";

		Employeeee e1 = new Employeeee();
		e1.id = 12;
		e1.salry = 2222.4f;
		System.out.println(Employeeee.company);

		Employeeee e2 = new Employeeee();
		e2.id = 13;
		e2.salry = 2222.5f;
		System.out.println(Employeeee.company);

	}

}
