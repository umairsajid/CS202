package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd:mm:ss");
		
		Date date = new Date();
		
		System.out.println(dateFormat.format(date));

	}

}
