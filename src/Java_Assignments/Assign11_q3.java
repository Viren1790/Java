package Java_Assignments;

import java.util.LinkedHashMap;

public class Assign11_q3 {
//3️⃣ Demonstrate LinkedHashMap preserving order.  ans-order is same as we given in put

	public static void main(String[] args) {
		
		LinkedHashMap <String, Integer> objlinkh=new LinkedHashMap<String, Integer>();
		objlinkh.put("Logout", 123);
		objlinkh.put("Login", 111);
		for(String i:objlinkh.keySet())
		{
			System.out.println(i+":"+objlinkh.get(i));
		}
		

	}

}
