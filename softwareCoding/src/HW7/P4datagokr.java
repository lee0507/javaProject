package HW7;

public class P4datagokr {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub

		String[] k30_OneRec = {//배열 k30_OneRec을 정의하고 값을 이전의 영수증에서 복사해서 저장한다.
				"연번,농장명,농장주,장소,신청기간,1구좌기준(5평/원),운영구좌,분양면적(단위:평),데이터기준일자" ,
				"1,찬우물골농원,이지천,경기도 성남시 수정구 고등동 191,연중,8평/12만원,100,8,2021-01-29" ,
				"2,논골주말농장,이광열,경기도 성남시 수정구 고등동 산6-1,연중,5평/5만원,100,5,2021-01-29" ,
				"3,고등주말농장,이종득,경기도 성남시 수정구 시흥동 166-1,연중,5평/10만원,200,5,2021-01-29" ,
				"4,서현 행복 주말농장,김갑성,경기도 성남시 분당구 서현동 113번지,연중,5평/10만원,200,5,2021-01-29" ,
				"5,둔전주말농장,조민자,경기도 성남시 수정구 시흥동 4-1,연중,5평/13만원,200,5,2021-01-29" ,
				"6,분당자연농원,유한석,경기도 성남시 분당구 율동 23,연중,1평/1만원,100,1,2021-01-29" ,
				"7,쌈지주말농장,한만종,경기도 성남시 분당구 서현동 73,연중,5평/12만원,250,5,2021-01-29" ,
				"8,여수동 주말농장,김태환,경기도 성남시 중원구 여수동 1번지,연중,6평/11만원,200,6,2021-01-29" ,
				"9,여수 주말농장,김도현,경기도 성남시 중원구 여수동 415-4번지,연중,5평/15만원,200,5,2021-01-29" ,
				"10,분당 주말 농장,이병진,경기도 성남시 분당구 분당동 11번지,연중,10평/14만원,100,10,2021-01-29"

		};
		int k30_iNumVal;//숫자형 변수 k30_iNumVal을 정의한다.
		
		String[] k30_field_name = k30_OneRec[0].split(",");//문자열 배열 k30_field_name을 정의하고 k30_OneRec 인덱스 0번을 , 기준으로 나누고 저장한다.
		
		for (int k30_i = 1; k30_i < k30_OneRec.length - 1; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 OneRec길이의 - 1보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			//k30_i는 1부터이고 OneRec길이보다 마이너스 1인 이유는 맨처음에 헤더부분을 제외하였기 때문이다.
			String[] k30_field = k30_OneRec[k30_i].split(",");//문자열 배열 k30_field를 정의하고 k30_OneRec 인덱스 k30_i번을 , 기준으로 나누고 저장한다.
			k30_iNumVal = Integer.parseInt(k30_field[6]);//변수 k30_iNumVal에 숫자형으로 형변환한 k30_field의 인덱스 6번을 저장한다.
			String k30_sNumVal = String.valueOf(k30_iNumVal);// 문자열형 변수 k30_sNumVal을 정의하고 값을 문자열로 형변환한 k30_iNumVal으로 초기화한다.
		    String k30_sNumVoice = "";//문자열형 변수 k30_sNumVoice를 정의하고 ""로 값을 초기화한다.
		    int k30_num1, k30_num2;//숫자형 변수 k30_i와 k30_j를 정의한다.
		      
		      String [] k30_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};//문자열형 배열 k30_units을 정의하고 값을 순서대로 저장한다.
		      String [] k30_unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};//문자열형 배열 k30_unitX을 정의하고 값을 순서대로 저장한다.
		      
		      k30_num1 = 0;//변수 k30_i의 값을 0으로 초기화한다.
		      k30_num2 = k30_sNumVal.length() - 1;//변수 k30_j의 값을 k30_sNumVal의 길이 - 1 로 초기화한다.
		      
		      while (true) {//while 반복문의 조건을 k30_i >=0으로 설정하여 k30_i가 0과 같거나 크다면 반복문이 수행되도록 한다.
		         if(k30_num1 >= k30_sNumVal.length()) break;// 만약 k30_i가 k30_sNumVal의 길이와 같거나 크다면 break문을 수행한다.
		         
		         if(k30_sNumVal.substring(k30_num1, k30_num1 + 1).equals("0")) {//만약 k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값이 0과 같다면
		            if(k30_unitX[k30_num2].equals("만") || k30_unitX[k30_num2].equals("억")) {//만약 k30_unitX의 [k30_j]인덱스 값이 만이거나 k30_unitX의 [k30_j]인덱스 값이 억이면
		               k30_sNumVoice = k30_sNumVoice + k30_unitX[k30_num2];//k30_sNumVoice값에 k30_unitX[k30_j]인덱스 값을 저장한다. (k30_sNumVoice += k30_unitX[k30_j]로 바꿔서 작성할 수 있다)
		            } else {//만약 if조건을 만족하지 않는다면
		               //아무것도 하지않는다.
		            }
		         } else if (k30_sNumVal.substring(k30_num1, k30_num1 + 1).equals("1") && k30_num2 > 5) {//추가한 부분으로 //만약 k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값이 1과 같거나
		            k30_sNumVoice = k30_sNumVoice + k30_unitX[k30_num2];// k30_j가 5보다 크다면 k30_sNumVoice값에 k30_unitX[k30_j]인덱스 값을 저장한다. 
		            //(k30_sNumVoice += k30_unitX[k30_j]로 바꿔서 작성할 수 있다)
		            
		         } else {//만약 k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값이 0과 같지 않다면
		            k30_sNumVoice = k30_sNumVoice//k30_sNumVoice의 값에 
		                  + k30_units[Integer.parseInt(k30_sNumVal.substring(k30_num1, k30_num1 + 1))]//k30_units의 숫자형으로 형변환한 (k30_sNumVal의 k30_i부터, k30_i에 1을 더한 값까지 문자열을 자른 값)의 인덱스]의 값을 더하고
		                  + k30_unitX[k30_num2];//k30_unitX[k30_j]의 값을 더한다.
		         }
		         k30_num1++;//k30_i의 값을 1 증가시킨다.
		         k30_num2--;//k30_j의 값을 1 감소시킨다.
		      }
		         
			System.out.printf("************************\n");//*선과 줄바꿈을 화면에 출력한다.
			
			for(int k30_j = 0; k30_j < k30_field_name.length; k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 k30_field_name길이보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				if(k30_j == 6) {//k30_j가 6과 같다면
					System.out.printf(" %s : [%s][%s]\n", k30_field_name[k30_j], k30_field[k30_j], k30_sNumVoice);// 숫자를 한글로 바꾸어서 저장한 변수 k30_sNumVoice과 나머지 변수를 화면에 출력한다.
				} else {//만약 if조건을 만족하지 않는다면
					System.out.printf(" %s : %s\n", k30_field_name[k30_j], k30_field[k30_j]);// 변수들을 화면에 출력한다.
				}

			}
			System.out.println("************************\n");//*선과 줄바꿈을 화면에 출력한다.
			
		}
	}
}



