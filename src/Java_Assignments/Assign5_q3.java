package Java_Assignments;

// Create an abstract class Bank with abstract method getInterestRate() and implement it in two child classes.
//Java_Assignments
// Abstract method must have return type

abstract class bank{
	
	abstract void getInterestRate();
	
	}

class child1 extends bank{
	
	void getInterestRate()
	{
		System.out.println("First class");
		return;
	}
	
}
class child2 extends bank{
	void getInterestRate()
	{
		System.out.println("Second class");
		return;
	}
}


public class Assign5_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 obj=new child1();
		obj.getInterestRate();
		child2 obj2=new child2();
		obj2.getInterestRate();
		

	}

}
