package HashSet;

import java.util.HashSet;

public class Hashset3 
{

	public static void main(String[] args) 
	{
		HashSet hs1=new HashSet();
		HashSet hs2=new HashSet();
		hs2.add(23);
		hs2.add(56);
		hs2.add(23);
		hs2.add(80);
		hs2.add(87);
		System.out.println(hs1.size());
		System.out.println(hs2.size());
		System.out.println(hs2.contains(23));
		System.out.println(hs2.contains(80));
		System.out.println(hs2.isEmpty());
		System.out.println(hs1.isEmpty());
		

	}

}
