package Day16;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter browser name");
	String browser=sc.next();
				
			}	
			public static void browsername(Browser BrowserNamme) {
				
				switch(BrowserNamme)
				{
				case CHROOME:
					System.out.println("Chrome browser");
							break;
				case Edge:
					System.out.println("Edge browser");
						break;
						
				case FIREFOX:
					System.out.println("Firefox browser");
						break;
				default:
					System.out.println("Browser not found");
				
				}
			}
}

		

		
		
		



