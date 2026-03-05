package Day16;

interface classex{
	
	public void m1();
}
public class Anonymous {

	public static void main(String[] args) {
		
		classex obj=new classex()
		{
			
			public void m1()
			{
				System.out.println("Hi anoynoums class");
			}
		};
		obj.m1();

	}

}
