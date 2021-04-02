package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet4 
{

	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(89);
		lhs.add(56);
		lhs.add(56);
		lhs.add(23);
		lhs.add(12);
		System.out.println(lhs);
        System.out.println("Size is: "+lhs.size());
        lhs.remove(12);
        System.out.println(lhs);
        System.out.println("Size is: "+lhs.size());
        lhs.clear();
        System.out.println(lhs);
        System.out.println("Size is: "+lhs.size());
	}

}
