package Generic;

import java.util.LinkedHashSet;

public class LinkedHashSet1 
{

	public static void main(String[] args)
	{
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(89);
		lhs.add(23);
		lhs.add(12);
		lhs.add(89);
		lhs.add(78);
		lhs.add(13);
		lhs.add(90);
		System.out.println(lhs);
		
	}

}
