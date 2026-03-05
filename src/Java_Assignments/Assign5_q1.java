package Java_Assignments;

//1️⃣ Create a parent class Employee and child class Manager where salary calculation is overridden.

class employee
{
	void put(String emp, int sal) {
 
     System.out.println(emp);
     System.out.println(sal*2);
	}
}
class manager extends employee
{
	void put(String emp2,int rsal)
	{
		
System.out.println(emp2);
	System.out.println("Recalculation:"+rsal*3);
		
		
	}
}
public class Assign5_q1 {

	public static void main(String[] args) {
		
		manager obj=new manager();
		obj.put("Veeer", 1000000);
		obj.put("Viren",2000000);
	}

}
