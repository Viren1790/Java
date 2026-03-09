package Java_Assignments;

import java.util.TreeSet;

public class Assign10_q2 {

	//2️⃣ Use TreeSet to sort a list of integers.
//	✔ Stores unique elements
//	✔ Automatically sorts elements (ascending order)
//	❌ Does not allow duplicates

	public static void main(String[] args) {

		
		TreeSet <Integer> objtset=new TreeSet<>();
		objtset.add(5);
		objtset.add(3);
		objtset.add(4);
		objtset.add(2);
		objtset.add(3);
		objtset.add(1);
		
		for(int i:objtset) {
			System.out.println(i);
		}
	}

}
