package TreeSet;

import java.util.TreeSet;

public class TreeeSet1 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(24);
		ts.add(45);
		ts.add(56);
		ts.add(78);
		ts.add(21);
		ts.add(78);
		ts.add(24);
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.descendingSet());
		System.out.println(ts.size());

	}

}
