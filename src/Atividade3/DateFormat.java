package Atividade3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	
	public static void main(String[] args) {
		
		LocalDateTime data = LocalDateTime.of(2012, 9, 10, 12, 0);
		System.out.println(data.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		System.out.println(data.format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")));
		System.out.println(data.format(DateTimeFormatter.ofPattern("EEEE")));
		System.out.println(data.format(DateTimeFormatter.ofPattern("u")));
		System.out.println(data.format(DateTimeFormatter.ofPattern("G")));
	}

}
