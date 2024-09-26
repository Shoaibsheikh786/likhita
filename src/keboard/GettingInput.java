package keboard;

import java.util.Scanner;

public class GettingInput {

	//how to get input froom keyborad
	
	//Scanner class ---> object ---> methods to receive the input
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		
		float f;
		
		System.out.println("Enter the first number");
		a=sc.nextInt();
		
		System.out.println("Enter the second number");
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("The sum of two numbers are "+c);
		
		
		
		
		
		
  
	}

}
