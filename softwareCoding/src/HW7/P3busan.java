package HW7;

public class P3busan {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		String[] k30_OneRec = {//배열 k30_OneRec을 정의하고 값을 이전의 영수증에서 복사해서 저장한다.
				"순번,상호명,소재지(도로명),연락처",
				"1,샤랄랄라,부산광역시 북구 금곡대로 469 농협하나로클럽 2층 (금곡동),070-7450-8460",
				"2,꼬마다락방,부산광역시 북구 구포시장길 48, 3층 (구포동),051-338-5559",
				"3,아이점프 부산북구점,부산광역시 북구 낙동북로 736 유림노르웨이숲상가 401호 (구포동),070-8805-1188",
				"4,파리봉봉(화명점),부산광역시 북구 금곡대로303번길 2 시티타워 1201호 (화명동),051-363-0060",
				"5,더놀다 부산화명점,부산광역시 북구 화명대로 32 다운타운프라자 5층 502호 (화명동),051-363-3631",
				"6,아이점프 만덕점,부산광역시 북구 만덕3로16번길 11 4층(만덕동 벽산라인훼미리타운),070-8252-3921",
				"7,키즈파크,부산광역시 북구 만덕대로 23 폴라렉스 5층 (덕천동), 070-8424-5518",
				"8,디지털팡팡 화명점,부산광역시 북구 금곡대로 230 금용복합스포츠타운 6층 (화명동),051-365-7272",
				"9,주니어킹덤,부산광역시 북구 화명대로 17 목양프라자 4층,051-363-2288"
				};
		String[] k30_field_name = k30_OneRec[0].split(",");//문자열 배열 k30_field_name을 정의하고 k30_OneRec 인덱스 0번을 , 기준으로 나누고 저장한다.
		//맨 위에 헤더부분을 저장하기 위해 0번을 미리 저장해놓는다.
		for (int k30_i = 1; k30_i < k30_OneRec.length - 1; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 OneRec길이의 - 1보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			//k30_i는 1부터이고 OneRec길이보다 마이너스 1인 이유는 맨처음에 헤더부분을 제외하였기 때문이다.
			String[] k30_field = k30_OneRec[k30_i].split(",");//문자열 배열 k30_field를 정의하고 k30_OneRec 인덱스 k30_i번을 , 기준으로 나누고 저장한다.
			System.out.printf("************************\n");//*선과 줄바꿈을 화면에 출력한다.
			for(int k30_j = 0; k30_j < k30_field_name.length; k30_j++) {//for반복문을 k30_j는 0부터 k30_j가 k30_field_name길이의 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf(" %s : %s\n", k30_field_name[k30_j], k30_field[k30_j]);//변수들을 화면에 출력한다.
			}
			System.out.println("************************\n");//*선과 줄바꿈을 화면에 출력한다.
		}
		}
	}


