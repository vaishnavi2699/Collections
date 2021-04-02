package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet3 
{

	public static void main(String[] args)
	{

		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add(23);
		lhs1.add(78);
		lhs1.add(45);
		lhs1.add(67);
		LinkedHashSet lhs2=new LinkedHashSet();
	     System.out.println(lhs1.contains(23));
	     System.out.println(lhs1.contains(45));
	     System.out.println(lhs1.isEmpty());
	     System.out.println(lhs2.isEmpty());
		 System.out.println(lhs1.size());
		 System.out.println(lhs2.size());
       

	}

}
