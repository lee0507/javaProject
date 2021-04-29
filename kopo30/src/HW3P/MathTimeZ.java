package HW3P;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MathTimeZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		time = TimeZone.getTimeZone("Asia/Seoul");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("America/New_York");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("Europe/London");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
		
	}

}
