package Day15;

import java.util.LinkedHashMap;

public class Linkedhasmap {

	public static void main(String[] args) {
	

		LinkedHashMap <Integer, String> objlinkmap= new LinkedHashMap<>();
		objlinkmap.put(2,"https://download.java.net/java/GA/jdk14/docs/api/index.html");
		objlinkmap.put(1, "Viren");
		objlinkmap.put(3,"Rohit");
		
		System.out.println("**Values**");
		
		for(int i: objlinkmap.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println("**All emp values");
		
		for(int s: objlinkmap.keySet())
		{
			System.out.println("Key is:"+s+ " Values is:"+objlinkmap.get(s));
		}
		
		//System.out.println(objlinkmap.entrySet());
		
	}

}
