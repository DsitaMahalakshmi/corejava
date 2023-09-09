package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Date {

	public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	System.out.println("current Date="+today);
	
	LocalDate firstDay_2023=LocalDate.of(2023, 9, 1);
	System.out.println("specific Date="+firstDay_2023);
	
	LocalDate todayKolkata=LocalDate.now(ZoneId.of("Asia/Kolkata"));
	System.out.println("current date in IST="+todayKolkata);
	
    //Time
	LocalTime time=LocalTime.now();
	System.out.println("current Time="+time);
	
	LocalTime specificTime=LocalTime.of(12, 20, 25, 40);
	System.out.println("specific Time of Day="+specificTime);
	
	LocalTime timeChicago=LocalTime.now(ZoneId.of("America/Chicago"));
	System.out.println("current Time in IsT="+timeChicago);
	
	//DateTime
	
	
	LocalDateTime today1=LocalDateTime.now();
	System.out.println("current DateTime="+today1);
	
	LocalDateTime specificDate=LocalDateTime.of(2023, Month.AUGUST, 1, 10,10);
	System.out.println("specific Date="+specificDate);
	}
	

}
