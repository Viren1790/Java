package Java_Assignments;
public class Assign3_q3 {
	
void set(int x, int y)
{
	System.out.println("Integer"+x);
	System.out.println(y);
	System.out.println("Euals"+(x+y));
}

void set(double x, double y)
{
	System.out.println("Double"+x);
	System.out.println(y);
	System.out.println("Euals"+(x+y));
}
//	//3️⃣ Write an overloaded method calculate() to add two integers and two doubles.
	public static void main(String[] args) {
		Assign3_q3 obj=new Assign3_q3();
		obj.set(11, 22.22);
		obj.set(20, 10);


	}

}
