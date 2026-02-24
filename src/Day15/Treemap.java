package Day15;

import java.util.TreeMap;

public class Treemap {
 //It will store values sequance wise
	public static void main(String[] args) {
		
		TreeMap<Integer,String> objtree=new TreeMap<>();
		objtree.put(1, "Viren");
		objtree.put(4,"Rahul");
		objtree.put(3, "Rohit");
		objtree.put(2, "Viren");

		
		System.out.println("***Emp key***");
		for(int i:objtree.keySet())
		{
			System.out.println(i);
		}
		
		for(int s:objtree.keySet())
		{
			System.out.println("Key is:"+s+ " Values is:"+objtree.get(s));
		}
	}

}
