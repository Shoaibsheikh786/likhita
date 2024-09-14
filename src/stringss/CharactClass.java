package stringss;

public class CharactClass {
	
	public static void main(String[] args) {
		//To check how many character are there in uppercase
		// same for lower case
		//count special char and numbers and letters 
		//reverse a string with while loop
		//check is the string plaindrome or not 
		// reverse a string if it starts with character 'a'
		
		//split a string on the basis of spaces and print 
		//the length of each string 
		
		//repalce the string characters with replace methods
		
		//** practice old concepts as well ..** 
		
//		char ch='A';
//		
//		boolean b=Character.isDigit(ch);
//		System.out.println(b);
//		
//		System.out.println(Character.isLowerCase(ch)); 
		
		String s=new String("ShoIaB");
		int cout=0;
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			
			if(Character.isUpperCase(ch))
			{  
				System.out.println(ch);
				cout++;
			}
		}
		System.out.println(cout);
		
	}

}
