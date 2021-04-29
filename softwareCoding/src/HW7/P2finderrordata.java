package HW7;

import java.text.DecimalFormat;

public class P2finderrordata {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		String [] k30_OneRec = {//배열 k30_OneRec을 정의하고 값을 이전의 영수증에서 복사해서 저장한다.
				" 해피홈 SAFE365 핸     7,500 19   142,500",
				" (G) LH원형유리화      6,900 20   138,000",
				" 상투과자E             5,980  1     5,980",
				" 더블링 나일론 깡  3,300,000  1 3,300,000",
				" 농심 신라면 120g*     3,380  1     3,380",
				"*(대)국내산삼겹살      6,610  1     9,610",
				" 오뚜기 진비빔면 1     2,750  1     2,750",
				"*GAP 죽장사과 4-6     10,800  1    10,800",
				"*순 유기농 바나나(     4,980  1     4,980",
				" 피코크 탄두리 닭      2,480  1     2,480",
				" (달콤)순살닭강정(     7,920  1     7,920",
				" DZ주니어양말3족C_     4,980  1     4,980",
				" DZ주니어양말3족C_     4,980  1     4,980",
				" 프리미엄생연어초      7,130  1     7,130",
				" 피코크 들깨미역국     3,980  1     3,980",
				"*남양 맛있는 우유G     4,480  1     5,480",
				" 녹차원흑당시럽10      4,980  1     4,980",
				" 신라면소컵(매)65g     3,210  1     3,210",
				" 케라시스 앰플 트      6,950  1     6,950",
				" 푸르밀 미숫가루       2,980  1     2,980",
				" 자일로스갈색설탕5     1,990  1     1,990",
				" CJ 비비고칩 20G       1,980  1     1,980",
				" 피코크 들깨미역국     3,980  1     3,980",
				" 흑원당 말차 밀크      4,480  1     4,480",
				" 1+ 등급란 10개입      3,480  1     3,480",
				"*포항시인증 한번얼    17,400  1    17,400",
				" 마이세프 중화풍      10,900  1    10,900",
				"*당도선별 성주 벽     12,800  1    12,800",
				" 곰곰 제주 흑돼지      9,990  1     9,990",
				"*곰곰 머스크 멜론     13,900  1    13,900",
				
		};
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###");// 3자리 수마다 , comma를 찍기 위해서 DecimalFormat 클래스를 생성하고
	      //Format형식을 (###,###,###,###")로 지정한다.
		String[] k30_name = new String[k30_OneRec.length];//문자열 배열 k30_name을 정의하고 k30_OneRec의 길이만큼 배열을 생성한다.
		int[] k30_price = new int[k30_OneRec.length];//숫자형 배열 k30_price을 정의하고 k30_OneRec의 길이만큼 배열을 생성한다.
		int[] k30_amount = new int[k30_OneRec.length];//숫자형 배열 k30_amount을 정의하고 k30_OneRec의 길이만큼 배열을 생성한다.
		int[] k30_sum = new int[k30_OneRec.length];//숫자형 배열 k30_sum을 정의하고 k30_OneRec의 길이만큼 배열을 생성한다.
		int[] k30_comsum = new int [k30_OneRec.length];//숫자형 배열 k30_comsum을 정의하고 k30_OneRec의 길이만큼 배열을 생성한다.
		
		for(int k30_i = 0; k30_i < k30_OneRec.length; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 OneRec 길이보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			byte[] k30_bb = k30_OneRec[k30_i].getBytes();//getBytes를 이용하여 k30_word를 바이트값으로 받아 바이트배열 k30_wdcount에 저장하였다.
			k30_name[k30_i] = new String(k30_bb, 0, 19);//k30_name 배열의 인덱스 i번에 0부터 19만큼 길이의 내용을 잘라서 추가한다.
			k30_price[k30_i] = Integer.parseInt(new String(k30_bb, 19, 9).trim().replace(",", ""));
			//k30_price 배열의 인덱스 i번에 19부터 9만큼길이의 내용을 자르고 양쪽의 공백을 trim으로 제거하고 ,는 replace로 없애준다음 추가한다. 
			k30_amount[k30_i] = Integer.parseInt(new String(k30_bb, 28, 3).trim());
			//k30_amount 배열의 인덱스 i번에 28부터 3만큼길이의 내용을 자르고 양쪽의 공백을 trim으로 제거하고 ,는 replace로 없애준다음 추가한다. 
			k30_sum[k30_i] = Integer.parseInt(new String(k30_bb, 31, 10).trim().replace(",", ""));
			//k30_sum 배열의 인덱스 i번에 31부터 10만큼길이의 내용을 자르고 양쪽의 공백을 trim으로 제거하고 ,는 replace로 없애준다음 추가한다. 
		}
		
		for(int k30_i = 0; k30_i < k30_OneRec.length; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 OneRec 길이보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_comsum[k30_i] = k30_price[k30_i] * k30_amount[k30_i];//k30_comsum의 인덱스 k30_i번째에 k30_price인덱스 i번째와 k30_amount 인덱스 k30_i번째의 곱을 저장한다.
			if(k30_comsum[k30_i] != k30_sum[k30_i]) {//만약 k30_comsum의 인덱스 k30_i번째와 sum의 인덱스 k30_i번째가 같지 않다면
				System.out.printf("************************\n");//*선과 줄바꿈을 화면에 출력한다.
				System.out.printf("오류[%s]\n", k30_OneRec[k30_i]);//OneRec의 인덱스 k30_i번째를 화면에 출력한다.
				System.out.printf("수정[%s%9s%3d%10s]\n", k30_name[k30_i], k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_comsum[k30_i]));
				//새로 계산을 하여서 제대로 된 계산값 k30_comsum의 인덱스 k30_i번째를 다른변수들과 함께 화면에 출력한다.
				System.out.printf("************************\n");//*선과 줄바꿈을 화면에 출력한다.
			}
		}
		
	}
	
}


