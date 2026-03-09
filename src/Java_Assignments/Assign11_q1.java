package Java_Assignments;

import java.util.HashMap;

public class Assign11_q1 {
	
//1️⃣ Create a HashMap storing username-password pairs.   ans-it does not maintane any order and print randomlly
	
	public static void main(String[] args) {
		
		HashMap <String, String> objhash=new HashMap<>();
		objhash.put("Viren@1", "Viren");
		objhash.put("User@123", "User");
		
		for(String i: objhash.keySet())
		{
			System.out.println(i);
		}
		for(String s:objhash.values())
		{
			System.out.println(s);
		}
	}

}
