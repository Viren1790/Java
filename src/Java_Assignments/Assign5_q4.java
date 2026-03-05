package Java_Assignments;

import java.util.ArrayList;

//Create an ArrayList of student names and:
//• Add 5 names
//• Print all names
//• Remove one name

public class Assign5_q4
{
public static void main(String[] args) {
	
 ArrayList<String> objarr=new ArrayList<>();
 objarr.add("Viren");
 objarr.add("Adi");
 objarr.add("Yash");
 objarr.add("Rohan");
 objarr.add("Tanish");
for(String i:objarr)
{
	System.out.println(i);
}
 System.out.println(objarr.remove(3));
 
 System.out.println("After removing");
 for(String i:objarr)
 {
 	System.out.println(i);
 }

 
// System.out.println(objarr.reversed());
// System.out.println(objarr.get(0));
// System.out.println(objarr.removeLast());
 
 

	

}
}
