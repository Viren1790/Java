package Day15;

import java.util.HashMap;

public class interfacehasmap {
	
	public static void main(String[]args)
	{
		
		HashMap<Integer,String> objhmap=new HashMap<>();
		objhmap.put(1, "Viren");
		objhmap.put(2,"Rahul");
		objhmap.put(3,"Rohit");
		
		for(int i:objhmap.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println("****Values of employee****");
		for(String s: objhmap.values())
		{
			System.out.println(s);
		}
		
		System.out.println("**********************");
		for(int i:objhmap.keySet())
		{
			System.out.println("For key:"+i +"  The value is:" +objhmap.get(i)); //get will return the values that we pass
		}
	}

}
