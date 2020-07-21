package streamApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class SA10 {
	public static void main(String args[]) {
		
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		LocalDate d1=LocalDate.of(1989,Month.FEBRUARY,28);
		System.out.println(d1);
		
		LocalTime t=LocalTime.of(12,35,10,999);
		System.out.println(t);
		
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
	
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		

		LocalTime t2=LocalTime.now(ZoneId.of("US/Pacific"));
		System.out.println(t2);
		
		Instant i=Instant.now();
		System.out.println(i);
	}

}
