package HW4;

public class calendar2 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		for (int k30_i = 1; k30_i < 13; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 13보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" %d월 =>", k30_i);//변수 k30_i를 화면에 출력한다.
			for (int k30_j = 1; k30_j < 32; k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 32보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf("%d,", k30_j);//변수 k30_j를 화면에 출력한다.
				
				if(k30_i == 4 || k30_i == 6 || k30_i == 9 || k30_i == 11) {//변수 k30_i가 4이거나 6이거나 9이거나 11이면
					if(k30_j == 30) break;// k30_j를 30에서 멈춘다.
				}
				
				if(k30_i == 2) {//변수 k30_i가 2이면
					if(k30_j == 28) break;// k30_j를 28에서 멈춘다.
				}
			}
			System.out.printf("\n");//월별로 출력을 다했을때는 줄바꿈을 출력한다.
		}
	}

}
