package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
     
	  Set<Integer> set=new HashSet<>();
	  
	  set.add(100);
	  set.add(1);
	  set.add(9);
	  set.add(4);
	  set.add(0);
	  
	  //  Iterator();
	  
	 Iterator<Integer> it= set.iterator();
	 
//	 System.out.println(it.next());
//	 System.out.println(it.next());
//	 System.out.println(it.next());
//	 System.out.println(it.next());
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next()); 
	 }
	  
	  
	}

}
