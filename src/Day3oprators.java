
public class Day3oprators {

	public static void main(String[] args) {
		/* Aithmatic oprator + - % 
		 * logical opratoers && || |
		 * Assignment op = += -= %= *= /=
		 * Increment decrement ++ --
		 * Relational op > < >= <= 
		 * comparison == != > < >= <= (Return true or false values)
		 * [precedience + - * ()
		 */
		
		int num1=10,num2=20;
		System.out.println(num1+num2);
		System.out.println(num1%num2);
		System.out.println(num1 -num2);
		System.out.println(num1/num2);
		System.out.println(num1*num2);
		
		
		 num1+=10; // num1 value 20;
		 num2*=2;
		 System.out.println("using assignment op");
		 System.out.println("num1 " +num1);
		 System.out.println("num2 "+num2);
		
		 
		 System.out.println("Comparesion"); 
		 System.out.println(num1>=num2); //FALSE
		 System.out.println(num1!=num2); //TRUE (! it mean it num1 not equal value to num2)
		 System.out.println(num1==num2); //FALSE

		 
		 
		 System.out.println("Logical operators");
		boolean status1=true;
		boolean status2=false;
		
		System.out.println(status1 && status2);
		System.out.println(status1 || status2);
		System.out.println(!status1); //replace it to true to false or false to true
		 
	}

}
