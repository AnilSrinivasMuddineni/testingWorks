package testing1;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Dates {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		 Date todate = new Date(cal.getTime().getTime());
	    System.out.println("Today : " + todate);

	    // Substract 30 days from the calendar
	     cal.add(Calendar.DATE, -30);
	     Date fromdate = new Date(cal.getTime().getTime());
	    System.out.println("30 days ago: " + fromdate);
	    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	    /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");		
		Instant instant = todate.toInstant();
		LocalDateTime ldt = instant.atZone(ZoneId.of("CET")).toLocalDateTime();
		String formattedDate = ldt.format(formatter);
		System.out.println("formattedDate: " + formattedDate);*/
	    String d = sf.format(todate);
	    System.out.println(d);
	    
	}
}
