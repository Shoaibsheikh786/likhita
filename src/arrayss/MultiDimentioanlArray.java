package arrayss;

public class MultiDimentioanlArray {

	public static void main(String[] args) {
     
		// multidemtional row columns 
		
		int arr[][] =new int [3][3];
		arr[0][0]=1;  //hard code 
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		arr[2][0]=4;
		arr[2][1]=7;
		arr[2][2]=6;
		
	//	System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
		
		//row --> 0, 3
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				//System.out.println(i +"   " +j);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
