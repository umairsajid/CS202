package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass2 {

	public static void main(String[] args) {
		DateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
    	Date time1 = new Date();
    	String date1 = dateFormat1.format(time1);
    	
    	DateFormat dateFormat2 = new SimpleDateFormat("MM");
    	String date2 = dateFormat2.format(time1);
    	
    	int month = Integer.parseInt(date2);
    	String monthString = monthS(month);
    	
    	DateFormat dateFormat3 = new SimpleDateFormat(" dd, yyyy");
		String date3 = dateFormat3.format(time1);
    	
       
        
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(monthString + date3);

	}
	
	public static String monthS(int month){
		String monthString;
		if(month == 1){
	    	   monthString = "Jan";
	       }
	       else if(month == 2){
	    	   monthString = "Feb";
	       }
	       else if(month == 3){
	    	   monthString = "Mar";
	       }
	       else if(month == 4){
	    	   monthString = "Apr";
	       }
	       else if(month == 5){
	    	   monthString = "May";
	       }
	       else if(month == 6){
	    	   monthString = "Jun";
	       }
	       else if(month == 7){
	    	   monthString = "Jul";
	       }
	       else if(month == 8){
	    	   monthString = "Aug";
	       }
	       else if(month == 9){
	    	   monthString = "Sept";
	       }
	       else if(month == 10){
	    	   monthString = "Oct";
	       }
	       else if(month == 11){
	    	   monthString = "Nov";
	       }
	       else{
	    	   monthString = "Dec";
	       }
		return monthString;
		
	}

}
