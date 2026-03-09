package Java_Assignments;

import java.util.TreeMap;

//2️⃣ Use TreeMap to sort test case IDs.    ans-Its sort data automaticly 

public class Assign11_q2 {
	
	public static void main(String[]args)
	{
		
		TreeMap<String, String> objtree= new TreeMap<>();
		objtree.put("TC111" ,"Login");
		objtree.put("TC108", "Email");
		objtree.put("TC122" ,"registration");

		//objtree.sequencedKeySet();
		
		for(String j: objtree.keySet())
		{
			System.out.println(j);
		}	
		for( String i:objtree.values())
		{
			System.out.println(i);
		}
		System.out.println("Keyset:"+ objtree.keySet()+"Values:"+ objtree.values());
	}
}
