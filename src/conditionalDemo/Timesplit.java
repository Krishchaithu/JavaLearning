package conditionalDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Timesplit {

	public static void main(String[] args) {


		Calendar  now1 = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("HH:mm");
		now1.add(Calendar.HOUR_OF_DAY, -3);		
		now1.add(Calendar.MINUTE, -30);
		Date date =now1.getTime();
		String latestdate= format1.format(date);
		String store[] =latestdate.split(":");
		System.out.println(latestdate);
		String mins=(latestdate.substring(latestdate.indexOf(":")+1,latestdate.length()));
		float mins1=Float.valueOf(mins)/10;
		System.out.println(mins1);
		int min = (int) Math.ceil(mins1);
		System.out.println(min);
		System.out.println(store[0]+":"+min+"0");

	}

}
