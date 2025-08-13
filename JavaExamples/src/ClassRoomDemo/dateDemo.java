package ClassRoomDemo;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class dateDemo {
	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		
		date1=LocalDate.of(2025,12,1);
		System.err.println(date1);
		date1=LocalDate.parse("2025-07-30");
		System.out.println("parse"+date1);
		System.out.println(date1.getYear());
		

		LocalTime time=LocalTime.now();
		System.out.println(time);
		time=LocalTime.of(01, 12);
		System.out.println(time);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		ZonedDateTime zDate= ZonedDateTime.now();
		System.out.println(zDate);
	}
}