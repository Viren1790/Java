package Java_Assignments;

import java.util.HashSet;

public class Assign10_q1 {

//   1️Create a HashSet and remove duplicate names.
//   ✔ Stores unique elements only
//   ❌ Does NOT allow duplicates
//	 ❌ Does NOT maintain order

	public static void main(String[] args) {

		HashSet<String> objh=new HashSet<>();
		objh.add("Viren");
		objh.add("Rahul");
		objh.add("Viren");
		
		for(String i:objh)
		{
			System.out.println(i);
		}
		
		
		
	}

}
