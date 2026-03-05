package Day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateandtime {

	public static void main(String[] args) {

		
//		LocalDate obj= LocalDate.now();
//		System.out.println("Todays date is:"+obj);
//		
//		LocalDate obj2=LocalDate.of(2026, 01, 17);
//		System.out.println(obj2);
		
		LocalDateTime time=LocalDateTime.now();
		System.out.println("Current date and time:"+time);
		
		
		DateTimeFormatter objformat=DateTimeFormatter.ofPattern("dd-mm-yy HH:mm:ss");
		System.out.println(time.format(objformat));
	}

}
