package Day20;

//enum String browser ={Chrome, firefox, safari};

public class Enumexample {
	enum browser {Chrome, firefox, safari};

	public static void main(String[] args) {

	
		browser b= browser.Chrome;
		 
		switch(b)
		{
		case firefox:{
			System.out.println("browser is firefox");
			break;
		}
		case Chrome:{
		System.out.println("Browser is chrome");
		break;
		}
		default: System.out.println("Browser not found");
		
		}
		

	}

}
