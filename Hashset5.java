package HashSet;

import java.util.HashSet;

public class Hashset5 
{

	public static void main(String[] args)
	{
		HashSet hs1=new HashSet();
		hs1.add(454);
		hs1.add(786);
		hs1.add("hello");
		HashSet hs2=new HashSet();
		hs2.add(454);
		hs2.add(786);
		hs2.add("hello");
		System.out.println(hs1.containsAll(hs2));
		System.out.println(hs1.removeAll(hs2));
		System.out.println(hs1.size());
		System.out.println(hs2.size());
		

	}

}
