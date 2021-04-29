package HW5;

public class gugudan2 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_cnt = 1;//숫자형 변수 k30_cnt를 정의하고 값을 1로 초기화한다.
		for (int k30_i = 1; k30_i < 10; k30_i++) {//for반복문을 k30_i는 1부터 k30_i이 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			if (k30_cnt > 3) {//3번만 구구단을 수행하기 위해서 k30_cnt가 3보다 커지면 break문을 수행한다.
				break;
			}
			System.out.printf("*************** *************** ***************\n");
			System.out.printf("  구구단 %d 단 \t  구구단 %d 단 \t  구구단 %d 단 \t\n", k30_i, k30_i + 3, k30_i + 6);//변수 k30_i, k30_i + 3, k30_i + 6를 화면에 출력한다.
			System.out.printf("***************\t***************\t***************\n");
			for (int k30_j = 1; k30_j < 10; k30_j++) {//for반복문을 k30_j는 1부터 k30_j이 10보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf(" %d * %d = %2d      ", k30_i, k30_j, k30_i * k30_j);//변수 k30_i, k30_j, k30_i * k30_j를 화면에 출력한다.
				System.out.printf(" %d * %d = %2d      ", k30_i + 3, k30_j, (k30_i + 3) * k30_j);//변수 k30_i + 3, k30_j, (k30_i + 3) * k30_j를 화면에 출력한다.
				System.out.printf(" %d * %d = %2d      ", k30_i + 6, k30_j, (k30_i + 6) * k30_j);//변수 k30_i + 6, k30_j, (k30_i + 6) * k30_j를 화면에 출력한다.
				System.out.println();
			}
			k30_cnt++;//내부의 반복문이 끝날때마다 k30_cnt를 하나씩 증가시킨다.
		}
	}

}
