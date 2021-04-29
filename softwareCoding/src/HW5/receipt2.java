package HW5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class receipt2 {//클래스 선언
//courier new로 출력하기
   public static void main(String[] args) {//메인으로부터 프로그램시작
      // TODO Auto-generated method stub
      Date k30_d = new Date();//시스템의 날짜 및 시간을 읽을 수 있도록 java.util 패키지의 Date 클래스를 생성한다.
      //Date 생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만든다.
      Calendar k30_cal = Calendar.getInstance();//달력을 표현한 abstract 클래스이기 때문에 new 연산자를 사용해서 인스턴스를 생성할 수 없고
      //Calendar 클래스의 static 메서드인 getInstance() 메서드를 통해 운영체제에 설정되어 있는 시간대를 기준으로 한 Calendar 하위 객체를 얻을 수 있다.
      k30_cal.add(Calendar.DAY_OF_MONTH, +14);//Calendar 클래스를 통해 가져온 날짜에 14일을 더하여서 교환/환불 기간인 2주 뒤의 날짜를 표시한다.
      Date k30_date = k30_cal.getTime();//Date 변수에 위에서 14일을 더한 날짜를 받아온다.
      SimpleDateFormat k30_sf1 = new SimpleDateFormat("MM월dd일");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
      //Format형식을 ("MM월dd일")로 지정한다.
      SimpleDateFormat k30_sf2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
      //Format형식을 ("yyyy/MM/dd HH:mm:ss")로 지정한다.
      DecimalFormat k30_df = new DecimalFormat("###,###,###,###,###");// 3자리 수마다 , comma를 찍기 위해서 DecimalFormat 클래스를 생성하고
      //Format형식을 ("###,###,###,###,###")로 지정한다.
      String k30_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";//문자열형 변수 k30_itemname1에 값을 퓨어에어 비말차단용마스크 (최고급형)으로 초기화한다.
      String k30_itemcode1 = "1031615";//문자열형 변수 k30_itemcode1에 값을 1031615로 초기화한다.
      int k30_price1 = 30000;//숫자형 변수 k30_price1에 값을 30000으로 초기화한다.
      int k30_amount1 = 4;//숫자형 변수 k30_amount1에 값을 4로 초기화한다.
      
      String k30_itemname2 = "슬라이드식명찰(가로형)(100호)";//문자열형 변수 k30_itemname2에 값을 슬라이드식명찰(가로형)(100호)으로 초기화한다.
      String k30_itemcode2 = "1008152";//문자열형 변수 k30_itemcode2에 값을 1008152로 초기화한다.
      int k30_price2 = 10000;//숫자형 변수 k30_price2에 값을 10000으로 초기화한다.
      int k30_amount2 = 1;//숫자형 변수 k30_amount2에 값을 1로 초기화한다.
      
      String k30_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";//문자열형 변수 k30_itemname3에 값을 매직흡착 인테리어후크(알루미늄타입)으로 초기화한다.
      String k30_itemcode3 = "1020800";//문자열형 변수 k30_itemcode3에 값을 1020800로 초기화한다.
      int k30_price3 = 10000;//숫자형 변수 k30_price3에 값을 10000으로 초기화한다.
      int k30_amount3 = 20;//숫자형 변수 k30_amount3에 값을 20로 초기화한다.
      
      String[] k30_itemname = {k30_itemname1, k30_itemname2, k30_itemname3};// 문자열형 배열 k30_itemname을 생성하고 k30_itemname1 ~ 3까지의 값을 순서대로 저장한다.
      String[] k30_itemcode = {k30_itemcode1, k30_itemcode2, k30_itemcode3};// 문자열형 배열 k30_itemcode을 생성하고 k30_itemcode1 ~ 3까지의 값을 순서대로 저장한다.
      int[] k30_price = {k30_price1, k30_price2, k30_price3};// 숫자형 배열 k30_price을 생성하고 k30_itemprice1 ~ 3까지의 값을 순서대로 저장한다.
      int[] k30_amount = {k30_amount1, k30_amount2, k30_amount3};// 숫자형 배열 k30_amount을 생성하고 k30_amount1 ~ 3까지의 값을 순서대로 저장한다.
      int k30_sum = 0;
      
      
      System.out.printf("%22s\n" , "\"국민가게, 다이소\"");//국민가게, 다이소와 줄바꿈을 화면에 출력한다.
      System.out.printf("%s\n", "(주)아성다이소_분당서현점");//(주)아성다이소_분당서현점과 줄바꿈을 화면에 출력한다.
      System.out.printf("전화:031-702-6016\n");//전화번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");//본사주소와 줄바꿈을 화면에 출력한다.
      System.out.printf("대표:박정부,신호섭 213-81-52063\n");//대표와 줄바꿈을 화면에 출력한다.
      System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");//매장주소와 줄바꿈을 화면에 출력한다.
      System.out.printf("=========================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("%24s\n", "소비자중심경영(CCM) 인증기업");//소비자중심경영(CCM) 인증기업와 줄바꿈을 화면에 출력한다.
      System.out.printf("%26s\n", "ISO 9001 품질경영시스템 인증기업");//ISO 9001 품질경영시스템 인증기업와 줄바꿈을 화면에 출력한다.
      System.out.printf("=========================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("       교환/환불 14일(%s)이내,\n", k30_sf1.format(k30_date));//날짜를 받아온 변수 k30_date에 아까 지정한 SimpleDateFormat으로 MM월dd일 형태로 출력한다.
      System.out.printf("%24s\n", "(전자)영수증, 결제카드 지참 후");//환불시 주요내용과 줄바꿈을 화면에 출력한다.
      System.out.printf("%21s\n", "구입매장에서 가능");//환불시 주요내용과 줄바꿈을 화면에 출력한다.
      System.out.printf("%24s\n", "포장/가격 택 훼손시 교환/환불 불가");//환불시 주요내용과 줄바꿈을 화면에 출력한다.
      System.out.printf("%24s\n", "체크카드 취소 시 최대 7일 소요");//환불시 주요내용과 줄바꿈을 화면에 출력한다.
      System.out.printf("=========================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("%-21s%20s\n", "[POS 1058231]", k30_sf2.format(k30_d));//날짜를 받아온 변수 k30_d에 아까 지정한 SimpleDateFormat으로 yyyy.MM.dd HH:mm:ss 형태로 출력한다.
      System.out.printf("=========================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      
      for (int k30_i = 0; k30_i < k30_itemname.length; k30_i++) {//for반복문을 k30_i는 0부터 k30_i이 k30_itemname.length보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
         String k30_temp = k30_itemname[k30_i] + "                   ";//문자열형 변수 k30_temp를 정의하고 값을 k30_itemname[k30_i]값에 공백을 추가한 값으로 초기화한다.
           byte[] k30_bb = k30_temp.getBytes();//바이트형 배열 k30_bb를 정의하고 k30_temp의 바이트값을 배열에 순서대로 저장한다.
           int k30_cnt = 0;//한글의 갯수를 세기위해서 숫자형 변수 k30_cnt를 정의하고 값을 0으로 초기화한다.
           
           for(int k30_j = 0; k30_j < 20; k30_j++) {//for반복문을 k30_j는 0부터 k30_j이 20보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
              if(k30_bb[k30_j] < 0)// 만약에 k30_bb[k30_j]가 0보다 작다면 k30_cnt의 값을 1만큼 증가시킨다.
                 k30_cnt++;//한글을 바이트로 바꾸었을때는 음수로 표시되고 한글은 2바이트이기때문에 한글 하나당 k30_cnt가 2개씩 증가한다. 
           }
           if (k30_cnt % 2 == 0) {//만약 k30_cnt가 짝수이면(한글이 잘리지 않고 정상적으로 다 출력된 경우라면)
              k30_temp = new String(k30_bb, 0, 20) + " ";//바이트를 21번째에서 자르고 string으로 변환하여 k30_temp에 저장한다.
           } else if (k30_bb[19] < 0){//만약 바이트로 잘랐을 때 20번째의 부분이 한글이라면 (한글이 반으로 잘렸을 경우라면)
              k30_temp = new String(k30_bb, 0, 19) + "  ";//바이트를 20번째에서 자르고 string으로 변환하고 덜 잘린 부분에 대해서 공백을 하나 더 추가해서 k30_temp에 저장한다.
           }
           
         System.out.printf("%s%7s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_price[k30_i] * k30_amount[k30_i]));
         //변수 k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_price[k30_i] * k30_amount[k30_i]를 화면에 출력한다.
         System.out.printf("[%s]\n", k30_itemcode[k30_i]);// 변수 k30_itemcode[k30_i]를 화면에 출력한다.
         k30_sum = k30_sum + k30_price[k30_i] * k30_amount[k30_i];// 변수 k30_sum에 k30_price[k30_i]와 k30_amount[k30_i]를 곱한 값을 더해서 추가한다.
      }
      double k30_taxrate = 0.1;// 실수형 변수 k30_taxrate를 정의하고 값을 0.1로 초기화한다.
      int k30_beforetax = (int)(k30_sum / (1 + k30_taxrate));//숫자형 변수 k30_beforetax를 정의하고 숫자형으로 형변환한 (k30_sum / (1 + k30_taxrate) 값을 저장한다.
      int k30_tax = k30_sum - k30_beforetax;//숫자형 변수 k30_tax를 정의하고 k30_sum - k30_beforetax 값을 저장한다.
      System.out.printf("%22s %14s\n", "과세합계", k30_df.format(k30_beforetax));// 3자리마다 ,를 찍는 format으로 k30_beforetax를 화면에 출력한다.
      System.out.printf("%23s %14s\n", "부가세",  k30_df.format(k30_tax));// 3자리마다 ,를 찍는 format으로 k30_tax를 화면에 출력한다.
      System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("%-20s%17s\n", "판매합계", k30_df.format(k30_sum));// 3자리마다 ,를 찍는 format으로 k30_sum를 화면에 출력한다.
      System.out.printf("=========================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("%-20s%17s\n", "신용카드", k30_df.format(k30_sum));// 3자리마다 ,를 찍는 format으로 k30_sum를 화면에 출력한다.
      System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("%-20s%17s\n", "우리카드", "538720**********");//우리카드와, 카드번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("%-18s%15s\n", "승인번호 77982843(0)", "승인금액 " + k30_df.format(k30_sum));// 3자리마다 ,를 찍는 format으로 k30_sum를 화면에 출력한다.
      System.out.printf("=========================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("%24s %5s\n", k30_sf2.format(k30_d)," 분당서현점");//날짜를 받아온 변수 k30_d에 아까 지정한 SimpleDateFormat으로 yyyy.MM.dd HH:mm:ss 형태로 출력한다.
      System.out.printf("상품 및 기타 문의 : 1522-4400\n");//상품 및 기타 문의번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");//멤버십 관련 문의번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("%32s\n", "|||||||||||||||||||||||");//바코드와 줄바꿈을 화면에 출력한다.
      System.out.printf("%32s\n", "|||||||||||||||||||||||");
      System.out.printf("%32s\n", "|||||||||||||||||||||||");
      System.out.printf("%29s\n", "2112820610158231");//바코드번호와 줄바꿈을 화면에 출력한다.
      System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
      System.out.printf("◈ 다이소 멤버십 앱 또는\n");//다이소 광고문구를 화면에 출력한다.
      System.out.printf("   홈페이지에 접속하셔서 회원가입 후\n");
      System.out.printf("   다양한 혜택을 누려보세요! ◈\n");

   }

}