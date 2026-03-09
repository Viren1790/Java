package Java_Assignments;
//1️⃣ Write a program that demonstrates a , then fix it.

 class Assign7{
	
		int a, b, c;

 public void set()
 {
		
			a=10;
			b=20;
			c=30;
		
		}
 void put()
 {
	 int total;
	 total= a+b+c;
	 System.out.println("Total value is:"+total);
 }
 }
		public class Assign7_q1 {

			public static void main(String[] args) {

				Assign7 obj=new Assign7();
				obj.set();
				obj.put();

	}

}
