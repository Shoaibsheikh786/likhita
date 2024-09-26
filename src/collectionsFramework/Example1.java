package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
     
		int arr[]=new int[100];
		
		// resizable
		// homogenous data 
	
		//collections frameworkd provides 
		  //heterogenou data
		// resizeable
		ArrayList<Integer> ar=new ArrayList<>(); //square brackers [] !=
		LinkedList<Float> fl=new LinkedList<>();
		
		
		Iterator<Integer> it=ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		fl.add(12.4f);
		fl.add(34.5f);
		
		System.out.println(fl.get(0));
		
		ar.add(2);
		ar.add(3);
		ar.add(6);
		ar.add(3);
		ar.add(4);
		
		//loop concepts
		
		
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
	
		System.out.println("For Each");
		//for Each
		for(Integer a:ar)
		{
			System.out.println(a);
		}
		
	}

}
