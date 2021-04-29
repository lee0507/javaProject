package HW08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P7 extends Thread {

   public static void main(String[] args) throws InterruptedException, ParseException {
      P7 thread = new P7();
      Scanner scanner = new Scanner(System.in);
      SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
      
      thread.start();
      Date before = format.parse(getCurrentTime());
      //System.out.println(getCurrentTime());
      System.out.println(getCurrentTime());
      int n = scanner.nextInt();
      Date after = format.parse(getCurrentTime());
      
      long diff = after.getTime() - before.getTime();
      
      if(diff > n* 1000) {
         System.out.println("Time is already over(It's "+ getCurrentTime() + ")");
         n = scanner.nextInt();
         Thread.sleep(n*1000);
         System.out.println("Time is over(" + getCurrentTime() + ")");
         
      } else {
         Thread.sleep(n*1000);
         System.out.println("Time is over(" + getCurrentTime() + ")");
      }
   }
      
   public static String getCurrentTime() {
      SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
      Date time = new Date();
      String dateAndTime = format.format(time);
      return dateAndTime;
   }
}


