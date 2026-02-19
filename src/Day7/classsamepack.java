package Day7;

public class classsamepack {

	public String name;
	private int id=17;
	
	public void get()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+17);
	}
	
	public static void mian(String[]args) {
		classsamepack obj=new classsamepack();
		obj.name = "viren";
		obj.get();
	}
}
