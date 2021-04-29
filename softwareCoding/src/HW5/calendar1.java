package HW5;

public class calendar1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		int k30_iWeekday = 5;//숫자형 변수 k30_iWeekday를 정의하고 값을 5로 초기화한다.
		int [] k30_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//숫자형 배열 k30_iEnd를 정의하고 값을 초기화한다.

		
		for (int k30_iMon = 0; k30_iMon < 12; k30_iMon++) {//for반복문을 k30_iMon는 0부터 k30_iMon이 12보다 작을 때까지 k30_iMon를 1씩 증가시키면서 수행한다.
			System.out.printf("\n\n         %d월\n", k30_iMon + 1);//변수 k30_iMon + 1과 줄바꿈을 화면에 출력한다. 
			System.out.printf("=====================\n");//=======과 줄바꿈을 화면에 출력한다. 
			System.out.printf(" 일 월 화 수 목 금 토\n");//일 월 화 수 목 금 토과 줄바꿈을 화면에 출력한다. 
			
			int k30_count = 7 - k30_iWeekday;//숫자형 변수 k30_count를 정의하고 값을 7 - k30_iWeekday로 초기화한다.
			if (k30_iWeekday == 0) {//만약에 k30_iWeekday가 == 0 이면 k30_count를 0으로 초기화한다.
				k30_count = 0;//초기화하는 이유는 k30_iWeekday가 0이면 k30_count가 7이 되기 때문에 k30_i % 7 == 0이 되어서 줄바꿈이 일어나지 않기때문에 초기화한다.
			}
			
			for (int k30_i = 0; k30_i < k30_iWeekday; k30_i++) {//for반복문을 k30_i는 0부터 k30_i이 k30_iWeekday보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
				System.out.printf("   ");//첫 시작 요일을 k30_iWeekday와 k30_icount로 계산하고 뒤로 띄어쓰기 해준다.
			}
			
			for(int k30_i = 1; k30_i <= k30_iEnd[k30_iMon]; k30_i++) {//for반복문을 k30_i는 1부터 k30_iEnd이 k30_iMon와 같거나 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
				System.out.printf("%3d", k30_i);//변수 k30_i를 화면에 출력한다.
				
				if(k30_i % 7 == k30_count) {//만약에 k30_i % 7 == k30_count면 줄바꿈을 한다.
					System.out.println();//요일의 마지막인 토요일이 2라면 나머지가 2일경우에 줄바꿈을 한다.
				}
				k30_iWeekday++;//k30_iWeekday를 1씩 추가한다.
				if(k30_iWeekday == 7) {//만약에 k30_iWeekday가 7이면 0으로 값을 초기화한다.
					k30_iWeekday = 0;//마지막으로 끝나는 요일을 계산하기 위해서 값을 초기화해야한다.
				}
				
			}
		}
	}
}

