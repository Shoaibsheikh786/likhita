package keboard;

import java.util.Scanner;

public class MoreKeyboardInputs {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		if(s.equals("chrome"))
		{
			System.out.println("Run my test on chrome browser");
		}
		else if(s.equals("opera"))
		{
			System.out.println("Run my test on opera browser");
		}
		else if(s.equals("Firefox"))
		{
			System.out.println("Run my tests on firefox");
		}
		else
		{
			System.out.println("Browser not found");
		}
	}
}
