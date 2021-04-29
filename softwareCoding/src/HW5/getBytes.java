package HW5;

public class getBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"해피홈 SAFE365 핸드워시", "(G) LH원형유리화병 10호", "상투과자E", "더블링 나일론 깡 롤러", "농심 신라면 120g*5",
				"(대)국내산삼겹살찌개", "오뚜기 진비빔면 155g", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살(g)", 
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK22", "DZ주니어양말3족C_WH22", "프리미엄생연어초밥", "피코크 들깨미역국500g",
				"남양 맛있는 우유GT 저지방", "녹차원흑당시럽10입", "신라면소컵(매)65g*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루 우유",
				"자일로스갈색설탕500g", "CJ 비비고칩 20G", "피코크 들깨미역국500g", "흑원당 말차 밀크티", "1+ 등급란 10개입 특란",
				"포항시인증 한번얼린 손질오징어", "마이세프 중화풍 양장피","당도선별 성주 벽진참외 1.5kg", "곰곰 제주 흑돼지 두루치기 500g", "곰곰 머스크 멜론 1.5kg"};
		
		for (int i = 0; i < name.length; i++) {
			String temp = name[i] + "              ";
	        byte[] bb = temp.getBytes();
	        
	        if (bb[15] < 0) {
		        temp = new String(bb, 0, 14);
	        } else {
	        	temp = new String(bb, 0, 15);
	        }
	        
	        System.out.println(temp);
	        System.out.println();
		}
	}
}
