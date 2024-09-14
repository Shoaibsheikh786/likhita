package stringss;

public class StringArry {

	public static void main(String[] args) {
   
		String  s[]= {"shaoib","likhita"};
		
		System.out.println(s.length);
		
		System.out.println(s[0].length());
		System.out.println(s[1].length());
		
		String s2="hello world i am learning java ";
	
		
		String arr[]=s2.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
