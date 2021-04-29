package HW4;

public class pyramid1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_n, k30_m;//숫자형 변수 k30_n과 k30_m을 정의한다.
		k30_m = 20;//변수 k30_m에 값인 20을 저장한다.
		k30_n = 1;//변수 k30_n에 값인 1을 저장한다.
		
		while (true) {//while 반복문의 조건을 true로 설정하여 계속해서 반복문이 수행되도록 한다.
			for (int k30_i = 0; k30_i < k30_m; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_m의 값보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
				System.out.printf(" ");//" "인 빈칸 한칸을 화면에 출력한다.
			}
			
			for (int k30_i = 0; k30_i < k30_n; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_n의 값보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
				System.out.printf("*");//"*"인 빈칸 한칸을 화면에 출력한다.
			}
			
			System.out.printf("\n");//for문 2개가 끝날 때마다 줄바꿈을 화면에출력한다.
			k30_m = k30_m - 1;//k30_m에 k30_m - 1 값을 저장한다.(k30_m -= 1로 바꿔서 작성할 수 있다.)
			k30_n = k30_n + 2;//k30_n에 k30_n + 2 값을 저장한다.(k30_m += 2로 바꿔서 작성할 수 있다.)
			
			if (k30_m < 0) {//만약 k30_m가 0보다 작으면
				break;// break문을 수행한다.
			}
		}
	}

}
