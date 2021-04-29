package HW6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P3 {
	static String[] k30_name = {"해피홈 SAFE365 핸드워시", "(G) LH원형유리화병 10호", "상투과자E", "더블링 나일론 깡 롤러", "농심 신라면 120g*5",
			"(대)국내산삼겹살찌개", "오뚜기 진비빔면 155g", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살(g)", 
			"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK22", "DZ주니어양말3족C_WH22", "프리미엄생연어초밥", "피코크 들깨미역국500g",
			"남양 맛있는 우유GT 저지방", "녹차원흑당시럽10입", "신라면소컵(매)65g*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루 우유",
			"자일로스갈색설탕500g", "CJ 비비고칩 20G", "피코크 들깨미역국500g", "흑원당 말차 밀크티", "1+ 등급란 10개입 특란",
			"포항시인증 한번얼린 손질오징어", "마이세프 중화풍 양장피","당도선별 성주 벽진참외 1.5kg", "곰곰 제주 흑돼지 두루치기 500g", "곰곰 머스크 멜론 1.5kg"};
	// 문자열형 배열 k30_name을 정의하고 값으로 물품의 이름을 저장한다.
	static int[] k30_price = {7500, 6900, 5980, 3300000, 3380, 6610, 2750, 10800, 4980, 2480, 
			7920, 4980, 4980, 7130, 3980, 4480, 4980, 3210, 6950, 2980,
			1990, 1980, 3980, 4480, 3480, 17400, 10900, 12800, 9990, 13900};
	// 숫자형 배열 k30_price을 정의하고 값으로 물품의 가격을 저장한다.
	static int[] k30_amount = {19, 20, 1, 1, 1, 1, 1, 1, 1, 1, 
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	// 숫자형 배열 k30_amount을 정의하고 값으로 물품의 수량을 저장한다.
	static boolean[] k30_taxfree = {false, false, false, false, false, true, false, true, true, false, 
			false, false, false, false, false, true, false, false, false, false,
			false, false, false, false, false, true, false, true, false, true};
	
	static int k30_count = 0;//숫자형 변수 k30_count을 정의하고 값을 0으로 초기화한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k30_itemCount = 30;
		TitlePrint();
		TimeStamp();
		HeaderPrint();
		
		for(int k30_i = 0; k30_i < k30_itemCount; k30_i++) {
			ItemPrint(k30_i);
		}
		
		TotalPrint();
	}
	
	public static void TitlePrint() {
		System.out.printf("%34s\n", "이마트 죽전점 (031)888-1234");//이마트 죽전점 번호와 줄바꿈을 화면에 출력한다.
		System.out.printf("%9s%20s\n",  "emart", "206-86-50913 강희석");//이마트 죽전점 사업자명과 사업자번호와 줄바꿈을 화면에 출력한다.
		System.out.printf("%28s\n", "용인 수지구 포은대로 552");//이마트 죽전점 주소와 줄바꿈을 화면에 출력한다.
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");//교환환불 정보와 줄바꿈을 화면에 출력한다.
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n\n", "교환/환불 구매점에서 가능(결제카드 지참)");
	}
	
	public static void TimeStamp() {
		Date k30_d = new Date();//시스템의 날짜 및 시간을 읽을 수 있도록 java.util 패키지의 Date 클래스를 생성한다.
	    //Date 생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만든다.
		SimpleDateFormat k30_sf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
	    //Format형식을 ("yyyy/MM/dd HH:mm")로 지정한다.
		System.out.printf("[구매]%s  %17s\n", k30_sf1.format(k30_d), "POS:0011-9861");//날짜를 받아온 변수 k30_d에 아까 지정한 SimpleDateFormat으로 yyyy.MM.dd HH:mm 형태로 출력한다.
		System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.

	}
	
	public static void HeaderPrint() {
		System.out.printf(" %-16s  %3s %2s %6s\n", "상품명", "단 가", "수량", "금 액");//상품명, 단가, 수량, 금액을 화면과 줄바꿈을 출력한다.
		System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
	}
	
	public static void ItemPrint(int k30_i) {
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###");// 3자리 수마다 , comma를 찍기 위해서 DecimalFormat 클래스를 생성하고
	      //Format형식을 (###,###,###,###")로 지정한다.

		String k30_temp = k30_name[k30_i] + "                   ";//문자열형 변수 k30_temp를 정의하고 값을 k30_name[k30_i]값에 공백을 추가한 값으로 초기화한다.
	    byte[] k30_bb = k30_temp.getBytes();//바이트형 배열 k30_bb를 정의하고 k30_temp의 바이트값을 배열에 순서대로 저장한다.
	    int k30_cnt = 0;//한글의 갯수를 세기위해서 숫자형 변수 k30_cnt를 정의하고 값을 0으로 초기화한다.
	        
	    for(int k30_j = 0; k30_j < 17; k30_j++) {//for반복문을 k30_j는 0부터 k30_j이 17보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
	    	if(k30_bb[k30_j] < 0)// 만약에 k30_bb[k30_j]가 0보다 작다면 k30_cnt의 값을 1만큼 증가시킨다.
	        		k30_cnt++;//한글을 바이트로 바꾸었을때는 음수로 표시되고 한글은 2바이트이기때문에 한글 하나당 k30_cnt가 2개씩 증가한다. 
	    }
	    if (k30_cnt % 2 == 0) {//만약 k30_cnt가 짝수이면(한글이 잘리지 않고 정상적으로 다 출력된 경우라면)
	    	k30_temp = new String(k30_bb, 0, 17) + " ";//바이트를 18번째에서 자르고 string으로 변환하여 k30_temp에 저장한다.
	    } else if (k30_bb[17] < 0) {//만약 바이트로 잘랐을 때 18번째의 부분이 한글이라면 (한글이 반으로 잘렸을 경우라면)
	        k30_temp = new String(k30_bb, 0, 16) + "  ";//바이트를 17번째에서 자르고 string으로 변환하고 덜 잘린 부분에 대해서 공백을 하나 더 추가해서 k30_temp에 저장한다.
	    }

		if (k30_taxfree[k30_i] == true) {//만약에 k30_taxfree[k30_i]가 true라면(면세가 되는 제품이라면)
			System.out.printf("*%s%9s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]));
			//변수 k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]와 줄바꿈을 화면에 출력한다.

		} else {//만약에 위의 조건 k30_taxfree[k30_i]가 false라면(면세가 되지 않는 제품이라면)
			System.out.printf(" %s%9s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]));
			//변수 k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]와 줄바꿈을 화면에 출력한다.

		}
		
		if((k30_i + 1) % 5 == 0) {//만약에 k30_i + 1을 5로 나누었을때 나머지가 0이라면(5번째 마다)
			System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
			}
		}
	
	
	public static void TotalPrint() {
		Calendar k30_cal = Calendar.getInstance();//달력을 표현한 abstract 클래스이기 때문에 new 연산자를 사용해서 인스턴스를 생성할 수 없고
	      //Calendar 클래스의 static 메서드인 getInstance() 메서드를 통해 운영체제에 설정되어 있는 시간대를 기준으로 한 Calendar 하위 객체를 얻을 수 있다.
		k30_cal.add(Calendar.HOUR_OF_DAY, -1);//Calendar 클래스를 통해 가져온 시간에 1시간을 빼서 주차 시간을 표시한다.
		Date k30_date = k30_cal.getTime();//Date 변수에 위에서 14일을 더한 날짜를 받아온다.
		SimpleDateFormat k30_sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
	      //Format형식을 ("yyyy/MM/dd HH:mm:ss")로 지정한다.
		SimpleDateFormat k30_sf3 = new SimpleDateFormat("yyyyMMdd");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
	      //Format형식을 ("yyyyMMdd")로 지정한다.
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###");// 3자리 수마다 , comma를 찍기 위해서 DecimalFormat 클래스를 생성하고
	      //Format형식을 (###,###,###,###")로 지정한다.
		int k30_count = 0;//숫자형 변수 k30_count을 정의하고 값을 0으로 초기화한다.
		int k30_taxfreesum = 0;//숫자형 변수 k30_taxfreesum을 정의하고 값을 0으로 초기화한다.
		int k30_taxsum = 0;//숫자형 변수 k30_taxsum을 정의하고 값을 0으로 초기화한다.
		double k30_taxrate = 0.1;// 실수형 변수 k30_taxrate를 정의하고 값을 0.1로 초기화한다.
		int k30_beforetax = (int)(k30_taxsum / (1 + k30_taxrate));//숫자형 변수 k30_beforetax를 정의하고 숫자형으로 형변환한 (k30_sum / (1 + k30_taxrate) 값을 저장한다.
		int k30_tax = k30_taxsum - k30_beforetax;//숫자형 변수 k30_tax를 정의하고 k30_taxsum - k30_beforetax 값을 저장한다.
		int k30_newpoint = (k30_taxfreesum + k30_taxsum) / 1000;//숫자형 변수 k30_newpoint를 정의하고 k30_taxfreesum과 k30_taxsum을 더한 값을 저장한다.
		int k30_point = 5743;//숫자형 변수 k30_point를 정의하고 값을 5743으로 초기화한다.
		
	
		for (int k30_i = 0; k30_i < k30_price.length; k30_i++) {//for반복문을 k30_i는 0부터 k30_i이 k30_itemname.length보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.

			if (k30_taxfree[k30_i] == true) {//만약에 k30_taxfree[k30_i]가 true라면(면세가 되는 제품이라면)
				k30_taxfreesum += (k30_amount[k30_i] * k30_price[k30_i]);// 변수_taxfreesum에 k30_amount[k30_i]과 k30_price[k30_i] 곱한 값을 더해서 저장한다.
			} else {//만약에 위의 조건 k30_taxfree[k30_i]가 false라면(면세가 되지 않는 제품이라면)
				k30_taxsum += (k30_amount[k30_i] * k30_price[k30_i]);// 변수_taxsum에 k30_amount[k30_i]과 k30_price[k30_i] 곱한 값을 더해서 저장한다.
			}
			k30_count++;
		}

			
		System.out.println();//줄바꿈을 화면에 출력한다.
		System.out.printf("%20s%16d\n","총품목수량", k30_count);//변수 k30_count를 화면에 출력한다. 
		System.out.printf("%21s%16s\n","(*)면세  물품",k30_df.format(k30_taxfreesum));// 3자리마다 ,를 찍는 format으로 k30_taxfreesum를 화면에 출력한다.
		System.out.printf("%21s%16s\n","과세  물품", k30_df.format(k30_beforetax));// 3자리마다 ,를 찍는 format으로 k30_beforetax를 화면에 출력한다.
		System.out.printf("%22s%16s\n","부  가  세", k30_df.format(k30_tax));// 3자리마다 ,를 찍는 format으로 k30_tax를 화면에 출력한다.
		System.out.printf("%23s%16s\n","합      계", k30_df.format(k30_taxfreesum + k30_taxsum));// 3자리마다 ,를 찍는 format으로 k30_taxfreesum과 k30_taxsum의 더한 값을 화면에 출력한다.
		System.out.printf("결 제 대 상 금 액%24s\n", k30_df.format(k30_taxfreesum + k30_taxsum));// 3자리마다 ,를 찍는 format으로 k30_taxfreesum과 k30_taxsum의 더한 값을 화면에 출력한다.
		System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
		System.out.printf("%-17s %17s", "0012 KEB 하나", "541707**0484/35860658\n");//카드 번호와 카드사와 줄바꿈을 화면에 출력한다.
		System.out.printf("%-14s%20s\n","카드결제(IC)", "일시불 / " + k30_df.format(k30_taxfreesum + k30_taxsum));// 3자리마다 ,를 찍는 format으로 k30_taxfreesum과 k30_taxsum의 더한 값을 화면에 출력한다.
		System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
		System.out.printf("%21.33s\n" , "[신세계포인트 적립]");//신세계포인트와 줄바꿈을 화면에 출력한다.
		System.out.printf("%-33s\n" , "홍*두 고객님의 포인트 현황입니다.");//포인트현황과 줄바꿈을 화면에 출력한다.
		System.out.printf("금회발생포인트       %10s     %5s\n", "9350**9995", k30_df.format(k30_newpoint));// 3자리마다 ,를 찍는 format으로 k30_newpoint의 더한 값을 화면에 출력한다.
		System.out.printf("누계(가용)포인트    %10s(    %s)\n", k30_df.format(k30_newpoint + k30_point), k30_df.format(k30_point));
		// 3자리마다 ,를 찍는 format으로 k30_newpoint와 k30_point의 더한 값과 k30_point를 화면에 출력한다.
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");//신세계포인트의 유효기간과 줄바꿈을 화면에 출력한다.
		System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
		System.out.printf("%22.33s\n" , "구매금액기준 무료주차시간 자동부여");//무료주차시간정보와 줄바꿈을 화면에 출력한다.
		System.out.printf("차량번호 : %29s\n", "244두6241");//차량번호와 줄바꿈을 화면에 출력한다.
		System.out.printf("입차시간 : %30s\n", k30_sf2.format(k30_date));//날짜를 받아온 변수 k30_d에 아까 지정한 SimpleDateFormat으로 yyyy-MM-dd HH:mm:ss 형태로 출력한다.
		System.out.printf("-----------------------------------------\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
		System.out.printf("캐셔:084599 양00 %25s", "1150\n");//캐셔정보와 줄바꿈을 화면에 출력한다.
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");//바코드와 줄바꿈을 화면에 출력한다.
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("%15s/00119861/00164980/31\n", k30_sf3.format(k30_date));//날짜를 받아온 변수 k30_d에 아까 지정한 SimpleDateFormat으로 yyyyMMdd 형태로 출력한다.
		
	}

}
