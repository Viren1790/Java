package Java_Assignments;

 class main {
	
//Create a class with public, private, and default variables. 
//Try accessing them from another class.
	
	 String nm="Viren     "; //shows an error
	public int id=17;
	double salary=1200000;
 }

	class assignment extends main
	{
		void put()
		{
		System.out.println("Employee name is:"+nm.trim());
		System.out.println(nm.charAt(2));
System.out.println(nm.contains("en"));
		System.out.println("Employee ID:"+ id);
		System.out.println("Employee salary:"+salary);
		}	
	}
	
	public class Asign4_q1
	{
	public static void main(String[] args) 
	{
		
		assignment obj=new assignment();
		obj.put();	
	}
	}
	

