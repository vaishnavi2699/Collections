package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet5
{

	public static void main(String[] args)
	{

		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add(23);
		lhs1.add(78);
		lhs1.add(45);
		lhs1.add(67);
		LinkedHashSet lhs2=new LinkedHashSet();
		lhs2.add(8);
		lhs2.add(34);
		lhs2.add(65);
		lhs2.add(58);
		lhs2.add(34);
		System.out.println(lhs1.containsAll(lhs2));
		System.out.println(lhs1.removeAll(lhs2));
		System.out.println(lhs1.size());
		System.out.println(lhs2.size());

	}

}
