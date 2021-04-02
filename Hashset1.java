package HashSet;

import java.util.HashSet;

public class Hashset1 
{

	public static void main(String[] args) 
	{
		 HashSet hs1=new HashSet();
		 hs1.add(28);
		 hs1.add(45);
		 hs1.add(87.6);
		 hs1.add(34);
		 HashSet hs2=new HashSet();
		 hs2.add(67);
		 hs2.add("hai");
		 hs2.add(45);
		 hs2.add(90);
		 hs2.add("hello");
		 System.out.println(hs1);
		 System.out.println(hs2);
		 hs1.addAll(hs2);
		 System.out.println(hs1);
System.out.println(hs1.size());
System.out.println(hs2.size());
System.out.println(hs1.size());
	}

}
