package arrayss;

public class Array3 {
	
	public static void main(String[] args) {
		float f[] = new float[5];
		
		char ch[]=new char[100];
		
		ch[0]='a';
		ch[1]='b';
		
		f[0]=22.4f;
		f[1]=33.4f;
		f[2]=12.5f;
		f[3]=121.5f;
		f[4]=112.5f;
		
		
		//print all the values with the help of for loop
		
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		
		//adv loop
		System.out.println("*************************");
		
		for(float b:f)
		{
			System.out.println(b);
		}
		
		
	}

}
