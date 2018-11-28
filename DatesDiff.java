package testing1;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import org.joda.time.Days; 

public class DatesDiff {
	
	public int getDateDifference(Date one, Date two) {
		
		try {
		    
		    if(one==null || two==null) {
			return 0;
		    }
		       
		    
		    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		    Timestamp t1 = new Timestamp(one.getTime());
		    Timestamp t2 = new Timestamp(two.getTime());
		    
		   System.out.println("format.parse(t1.toString()) "+format.parse(t1.toString()));
		   System.out.println("format.parse(t2.toString()) "+format.parse(t2.toString()));
		    
		    java.util.Date d1 = format.parse(t1.toString());
		    java.util.Date d2 = format.parse(t2.toString());
		    DateTime dt1 = new DateTime(d1);
		    DateTime dt2 = new DateTime(d2);
		    
		   System.out.println("dt1 is "+dt1);
		   System.out.println("dt2 is "+dt2);
		   System.out.println("Days.daysBetween(dt1, dt2).getDays() is "+Days.daysBetween(dt2, dt1).getDays());
		    
		    return Days.daysBetween(dt2, dt1).getDays()+1;

		} catch (Exception e) {
		   e.printStackTrace();
		    return 0;
		}
		
	}
	
	public static Date sqlDatee(String input) {
		    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		    java.util.Date dt = null;
			try {
				dt = sdf.parse(input);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    java.sql.Date dtSql = new java.sql.Date(dt.getTime());
		    return dtSql;
	}
	
	
	
	public static void main(String[] args) {
		DatesDiff dd = new DatesDiff();
		String sDate1="16/07/2018";
		String sDate2="13/07/2018";
		try {
			Date date1=new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(sDate1).getTime());
			Date date2=new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(sDate2).getTime());
			dd.getDateDifference(date1,date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		dd.getDateDifference(sqlDatee("2018-07-16 00:00:00"),sqlDatee("2018-07-13 00:00:00"));
		
	}

}
