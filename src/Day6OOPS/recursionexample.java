package Day6OOPS;

public class recursionexample {

	void method1countdown(int num)
	{
		if(num==0) {
			System.out.println("Countdown completed");
			return;
		}
		
		System.out.println(num);
		num--;
		method1countdown(num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recursionexample obj=new recursionexample();
		obj.method1countdown(10);
		

	}

}
