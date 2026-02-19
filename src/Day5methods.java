
public class Day5methods {

	
	void login() {
		System.out.println("Enter user name");

	}
		void search()
		
		{
			System.out.println("Enter product name");
			
		}
		
		void addtocart()
		{
			System.out.println("iOS");
		}
		
		void logout() {
			System.out.println("click log out");
		}
		
		public static void main(String[]args) {
			
			Day5methods obj=new Day5methods(); //We are just calling methods in main
			obj.login();
			obj.search();
			obj.login();
			obj.addtocart();
			obj.logout();
		}

}
