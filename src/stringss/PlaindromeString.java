package stringss;

public class PlaindromeString {
	
	
  public static void main(String[] args) {
	String s="shaoib";
	String s2="";  //
	for(int i=s.length()-1;i>=0;i--) //i=4,3
	{
		s2=s2+s.charAt(i);
	}
	
//	System.out.println(s2);
	
	if(s.equals(s2))
	{
	System.out.println("plaindrome");	
	}
	else
	{
		System.out.println("it is not plaindrome");
	}
  }
}
