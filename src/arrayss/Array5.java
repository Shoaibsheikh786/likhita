package arrayss;

public class Array5 {

	public static void main(String[] args) {
   
		int arr[]= {1,2,3,4};
		
		System.out.println(arr[3]);
		System.out.println(arr[2]);
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		
		System.out.println("**********************");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	

}
