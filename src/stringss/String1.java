package stringss;

public class String1 {

	public static void main(String[] args) {
   
		//char ch='likh';
		String s="likhita";
		String s2="shaoib";
		
		System.out.println(s);
		
		System.out.println(s.length());
		System.out.println(s2.length());
		
		System.out.println(s.charAt(4));
		
		char ch=s.charAt(5);
		
		System.out.println(ch);
		
		
		System.out.println(s.indexOf('k'));
		
		System.out.println(s.indexOf('i')); //left to right
		System.out.println(s.lastIndexOf('i'));//right to left
		
		System.out.println(s.contains("likhta"));
		
		System.out.println(s.equals(s2));
		System.out.println(s.equals("Likhita")); //value and case
		
System.out.println(s.equalsIgnoreCase("Likhita"));//value

System.out.println(s.isBlank());

System.out.println( s.replace('l','R'));
		
System.out.println(s);

System.out.println(s.substring(3));

System.out.println(s.substring(2,5));
System.out.println(s.toUpperCase());
		
	}

}
