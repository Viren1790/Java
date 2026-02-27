package Java_Assignments;

//2️⃣ Write a program using static and final variables and explain their behavior.



		class m1
		{
		static String nm="Viren"; //ststic method we cannot declare in main methos and its public so we can change the levels
		
		void m2()
		{
		final int id=17; //final keyword values we cannot change it it is default as its given
		System.out.println(nm);
		System.out.println(id);
		}
		}
		public class Assign_4q2 {

			public static void main(String[] args) {
				m1 obj=new m1();
				obj.m2();
				
			}
			}



