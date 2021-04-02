package HashSet;

import java.util.HashSet;

public class Hashset4
{

	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add("haii");
		hs.add("hello");
		hs.add(454);
		hs.add(786);
		hs.add("hello");
		System.out.println(hs);
		System.out.println("Size is: "+hs.size());
		hs.remove(23);
		System.out.println(hs);
		System.out.println("Size is: "+hs.size());
		hs.clear();
		System.out.println(hs);
		System.out.println("Size is: "+hs.size());

	}

}
