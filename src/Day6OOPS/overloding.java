package Day6OOPS;

public class overloding {
	
	//Polymorphism-1. overloading, 2. overriding
	//Overloading-in same calss we can declare methods and parameters

	void login()   //Methods
	{
		System.out.println("Enter product:"+"iOS");
		System.out.println("Product:"+"iPhone 17Pro");
		System.out.println("---------------");
	}
	void login(String product) //Added parameters
	{
		System.out.println("Product name:"+product);
		System.out.println("Product displayed");
		System.out.println("Buy product");
		System.out.println("---------------");
	}
	
void login(String pro, double r, String review) //r represent product rating
{
	System.out.println("Product name:"+pro);
	System.out.println("Produt Rating:"+r);
	System.out.println("Product Review:"+review);
}

public static void main(String[]args)
{
	overloding ov=new overloding(); //Created object
	ov.login();
	ov.login("17Pro");    //call method and given parameter values
	ov.login("17Pro", 4.3,"Good");
}
	
}
