package HW3P;

import java.util.Calendar;
import java.util.Scanner;

public class HW3P6 {

	public static void main(String[] args){
	       Calendar calendar = Calendar.getInstance();
	       Scanner scan = new Scanner(System.in);
	       
	       int year = scan.nextInt();
	       int month = scan.nextInt();
	       calendar.set(Calendar.YEAR, year);
	       calendar.set(Calendar.MONTH, month);
	       System.out.println("Sun Mon Tue Wen Thu Fri Sat");
	       calendar.set(year, month-1, 1);
	       
	       int end = calendar.getActualMaximum(Calendar.DATE);
	       int dayweek = calendar.get(Calendar.DAY_OF_WEEK);

	       for (int i = 1; i <= end; i++) {
	    	   if (i == 1) {
	    		   for (int j = 1; j < dayweek; j++) {
	    			   System.out.print("    ");
	    		   }
	    	   }
	    	   if(i < 10) {
	    		   System.out.print(" ");
	    	   }
	    	   System.out.print(" " + i + " ");
	    	   if(dayweek % 7 == 0) {
	    		   System.out.println();
	    	   }
	    	   dayweek++;
	       }
	}
}