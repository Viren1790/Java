package Day16;

import Day2.SYSO;

enum Browser{ //If we used enum then we cannot change define enum data from statments
	CHROOME,  //If we want to avoid typo error then we will use enum so on statemnts you cant not change the values
	FIREFOX,
	Edge
}

public class Enum {

	public static void main(String[] args) {
		browsername(Browser.Edge);
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
