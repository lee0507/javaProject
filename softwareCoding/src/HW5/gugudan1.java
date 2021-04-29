package HW5;

public class gugudan1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		for (int k30_i = 1; k30_i < 10; k30_i = k30_i + 3) {//for반복문을 k30_i는 1부터 k30_i이 10보다 작을 때까지 k30_i를 3씩 증가시키면서 수행한다.
			System.out.printf("***************\t***************\t***************\n");
			System.out.printf("  구구단 %d 단 \t  구구단 %d 단 \t  구구단 %d 단 \t\n", k30_i, k30_i + 1, k30_i + 2);//변수 k30_i, k30_i + 1, k30_i + 2를 화면에 출력한다.
			System.out.printf("***************\t***************\t***************\n");
			for (int k30_j = 1; k30_j < 10; k30_j++) {//for반복문을 k30_j는 1부터 k30_j이 10보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf(" %d * %d = %-7d", k30_i, k30_j, k30_i * k30_j);//변수 k30_i, k30_j, k30_i * k30_j를 화면에 출력한다.
				System.out.printf(" %d * %d = %-7d", k30_i + 1, k30_j, (k30_i + 1) * k30_j);//변수 k30_i, k30_j, (k30_i + 1) * k30_j를 화면에 출력한다.
				System.out.printf(" %d * %d = %-7d", k30_i + 2, k30_j, (k30_i + 2) * k30_j);//변수 k30_i, k30_j, (k30_i + 2) * k30_j를 화면에 출력한다.
				System.out.println();//줄바꿈을 화면에 출력한다.
				
			}
		}
	}

}
