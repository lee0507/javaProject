package HW5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test111 {
//굴림체로 출력하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date k30_d = new Date();
		Calendar k30_cal = Calendar.getInstance();
		k30_cal.add(Calendar.HOUR_OF_DAY, -1);
		Date k30_date = k30_cal.getTime();
		SimpleDateFormat k30_sf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat k30_sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat k30_sf3 = new SimpleDateFormat("yyyyMMdd");
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###");
		String[] k30_name = {"해피홈 SAFE365 핸드워시", "(G) LH원형유리화병 10호", "상투과자E", "더블링 나일론 깡 롤러", "농심 신라면 120g*5",
				"(대)국내산삼겹살찌개", "오뚜기 진비빔면 155g", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살(g)", 
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK22", "DZ주니어양말3족C_WH22", "프리미엄생연어초밥", "피코크 들깨미역국500g",
				"남양 맛있는 우유GT 저지방", "녹차원흑당시럽10입", "신라면소컵(매)65g*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루 우유",
				"자일로스갈색설탕500g", "CJ 비비고칩 20G", "피코크 들깨미역국500g", "흑원당 말차 밀크티", "1+ 등급란 10개입 특란",
				"포항시인증 한번얼린 손질오징어", "마이세프 중화풍 양장피","당도선별 성주 벽진참외 1.5kg", "곰곰 제주 흑돼지 두루치기 500g", "곰곰 머스크 멜론 1.5kg"};
		int[] k30_price = {7500, 6900, 5980, 3300000, 3380, 6610, 2750, 10800, 4980, 2480, 
				7920, 4980, 4980, 7130, 3980, 4480, 4980, 3210, 6950, 2980,
				1990, 1980, 3980, 4480, 3480, 17400, 10900, 12800, 9990, 13900};
		int[] k30_amount = {19, 20, 1, 1, 1, 1, 1, 1, 1, 1, 
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		boolean[] k30_taxfree = {false, false, false, false, false, true, false, true, true, false, 
				false, false, false, false, false, true, false, false, false, false,
				false, false, false, false, false, true, false, true, false, true};
		int k30_taxfreesum = 0;
		int k30_taxsum = 0;
		int k30_count = 0;
		System.out.printf("%s%20s\n", "┌-┐ ***** **** *** *  ", "이마트 죽전점 (031)888-1234");
		System.out.printf("%s%20s\n", "* * * * *    * *   ***", "   이마트 죽전점 (031)888-1234");
		System.out.printf("%s%20s\n", "*** * * * **** *   *", "206-86-50913 강희석");
		System.out.printf("%s%24s\n", "*   * * * *  * *   *", "용인 수지구 포은대로");
		System.out.printf("%s%20s\n", "*** * * * **** *   ***", " 이마트 죽전점 (031)888-1234");
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "*일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("[구매]%s  %17s\n", k30_sf1.format(k30_d), "POS:0011-9861");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-18s %3s %2s %6s\n", "상품명", "단가", "수량", "금액");
		System.out.printf("-----------------------------------------\n");
		
		for (int k30_i = 0; k30_i < k30_name.length; k30_i++) {
			String k30_temp = k30_name[k30_i] + "                   ";
	        byte[] k30_bb = k30_temp.getBytes();
	        int k30_cnt = 0;
	        
	        for(int k30_j = 0; k30_j < 17; k30_j++) {
	        	if(k30_bb[k30_j] < 0)
	        		k30_cnt++;
	        }
	        if (k30_cnt % 2 == 0) {
		        k30_temp = new String(k30_bb, 0, 17) + " ";
	        } else if (k30_bb[17] < 0){
	        	k30_temp = new String(k30_bb, 0, 16) + "  ";
	        } else {
	        	k30_temp = new String(k30_bb, 0, 17) + " ";
	        }

			if (k30_taxfree[k30_i] == true) {
				System.out.printf("*%s%9s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]));
				k30_taxfreesum += (k30_amount[k30_i] * k30_price[k30_i]);
			} else {
				System.out.printf(" %s%9s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]));
				k30_taxsum += (k30_amount[k30_i] * k30_price[k30_i]);
			}
			k30_count++;
			if(k30_count % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
		}
		double k30_taxrate = 0.1;
		int k30_beforetax = (int)(k30_taxsum / (1 + k30_taxrate));
		int tax = k30_taxsum - k30_beforetax;
		int newpoint = (k30_taxfreesum + k30_taxsum) / 1000;
		int point = 5743;
		System.out.println();
		System.out.printf("%20s%16d\n","총품목수량", k30_count);
		System.out.printf("%21s%16s\n","(*)면세  물품",k30_df.format(k30_taxfreesum));
		System.out.printf("%21s%16s\n","과세  물품", k30_df.format(k30_beforetax));
		System.out.printf("%22s%16s\n","부  가  세", k30_df.format(tax));
		System.out.printf("%23s%16s\n","합      계", k30_df.format(k30_taxfreesum + k30_taxsum));
		System.out.printf("결 제 대 상 금 액%24s\n", k30_df.format(k30_taxfreesum + k30_taxsum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-17s %17s", "0012 KEB 하나", "541707**0484/35860658\n");
		System.out.printf("%-14s%20s\n","카드결제(IC)", "일시불 / " + k30_df.format(k30_taxfreesum + k30_taxsum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%21.33s\n" , "[신세계포인트 적립]");
		System.out.printf("%-33s\n" , "홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("금회발생포인트       %10s     %5s\n", "9350**9995", k30_df.format(newpoint));
		System.out.printf("누계(가용)포인트    %10s(    %s)\n", k30_df.format(newpoint + point), k30_df.format(point));
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22.33s\n" , "구매금액기준 무료주차시간 자동부여");
		System.out.printf("차량번호 : %29s\n", "244두6241");
		System.out.printf("입차시간 : %30s\n", k30_sf2.format(k30_date));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084599 양00 %25s", "1150\n");
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("%15s/00119861/00164980/31\n", k30_sf3.format(k30_date));
		
		

		
		
	}
	
}
