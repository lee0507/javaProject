package HW5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class receipt1 {// 클래스 선언

   public static void main(String[] args) {//메인으로부터 프로그램시작
      int k30_iPrice = 33000;//숫자형 변수 k30_iPrice를 정의하고 값을 33000으로 초기화한다.
      Date k30_d = new Date();//시스템의 날짜 및 시간을 읽을 수 있도록 java.util 패키지의 Date 클래스를 생성한다.
      //Date 생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만든다.
      int k30_netPrice = (int)((k30_iPrice / 11.) * 10.);//세전 금액을 계산하기 위해 숫자형 변수 k30_netPrice를 정의하고
      //숫자형으로 형변환한 ((k30_iPrice / 11.) * 10.)을 값으로 저장한다.
      SimpleDateFormat k30_sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
      //Format형식을 ("yyyy/MM/dd HH:mm:ss")로 지정한다.
      DecimalFormat k30_df = new DecimalFormat("###,###,###,###,###");// 3자리 수마다 , comma를 찍기 위해서 DecimalFormat 클래스를 생성하고
      //Format형식을 ("###,###,###,###,###")로 지정한다.
      System.out.printf("신용승인\n");//신용승인와 줄바꿈을 화면에 출력한다.
      System.out.printf("%-16s %17s\n" , "단말기 : 2N68665898", "전표번호 : 041218");//단말기와 줄바꿈을 화면에 출력한다.
      System.out.printf("%-15s\n", "가맹점 : 한양김치찌개");//가맹점와 줄바꿈을 화면에 출력한다.
      System.out.printf("%-15s\n", "주  소 : 경기 성남시 분당구 황새울로351번길 10 , 1층");//주소와 줄바꿈을 화면에 출력한다.
      System.out.printf("%-15s\n", "대표자 : 유창신");//대표자와 줄바꿈을 화면에 출력한다.
      System.out.printf("%-18s%20s\n" , "사업자 : 752-53-00558", "TEL : 7055695");//사업자와 줄바꿈을 화면에 출력한다.
      System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("%-22s%14s 원\n", "금  액", k30_df.format(k30_netPrice));//변수 k30_netPrice에 아까 지정한 DecimalFormat으로 3자리수마다 ,를 찍게한다.
      System.out.printf("%-23s%12s 원\n", "부가세", k30_df.format(k30_iPrice - k30_netPrice));//변수 (k30_iPrice - k30_netPrice)에 아까 지정한 DecimalFormat으로 3자리수마다 ,를 찍게한다.
      System.out.printf("%-22s%14s 원\n", "합  계", k30_df.format(k30_iPrice));//변수 k30_netPrice에 아까 지정한 DecimalFormat으로 3자리수마다 ,를 찍게한다.
      System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("우리카드\n");//우리카드와 줄바꿈을 화면에 출력한다.
      System.out.printf("%-25s%5s\n", "카드번호 : 5387-20**-****-4613(S)", "일시불");//카드번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("거래일시 : %s\n", k30_sf.format(k30_d));//날짜를 받아온 변수 k30_d에 아까 지정한 SimpleDateFormat으로 yyyy/MM/dd HH:mm:ss 형태로 출력한다.
      System.out.printf("%s\n" , "승인번호 : 70404427");//승인번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("%s\n" , "거래번호 : 357734873739");//거래번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("매입 : 비씨카드사    가맹 : 702068568\n");//카드사와 줄바꿈을 화면에 출력한다.
      System.out.printf("알림 : EDC매출표\n");//알림과 줄바꿈을 화면에 출력한다.
      System.out.printf("문의 : TEL)1544-4700\n");//문의번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("%14s%s%14s\n" ," ", "* 감사합니다 *", " ");//감사합니다와 줄바꿈을 화면에 출력한다.
      System.out.printf("%39s\n" , "표준V2.08_20200212");//표준V2.08_20200212와 줄바꿈을 화면에 출력한다.
      
   }

}