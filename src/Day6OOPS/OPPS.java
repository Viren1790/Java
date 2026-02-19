package Day6OOPS;

public class OPPS {
	
	void search(String sphone, String s1phn)
	{
		System.out.println("Search phone:"+sphone);
		System.out.println("Search phone type:"+s1phn);
		System.out.println("Phone are avaialbe");
		System.out.println("Phone displayed");
		
		System.out.println("----------------");
	}
	
	void addtocart(String phone)
	{
		System.out.println("Cart added:"+phone);
		System.out.println("Buy the product");
	}
	
	public static void main(String[]args)
	{
		OPPS op=new OPPS();
		op.search("iphone11", "iOS");
		op.addtocart("iPhone16pro");
	}

}
