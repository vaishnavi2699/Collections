package Map;

import java.util.TreeMap;

public class TreeMap1 
{

	public static void main(String[] args) 
	{
		TreeMap tm=new TreeMap();
		tm.put(23,"aaa");
		tm.put(89,"ddd");
		tm.put(27,"aaa");
		tm.put(63,"ddd");
		tm.put(23,"aaa");
		tm.put(90,"ccc");
		tm.put(45,"aaa");
		tm.put(87,"bbb");
		System.out.println(tm);
		System.out.println(tm.descendingMap());

	}

}
