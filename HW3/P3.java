package HW3;

public class P3 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		int k30_ii = 1000 / 3; // k30_ii라는 숫자형 변수를 정의하고 1000 / 3이라는 값을 저장
		System.out.printf("#3-1 : %d\n" , k30_ii);//변수 k30_ii를 화면에 출력
		
		k30_ii = 1000 % 3; // k30_ii라는 숫자형 변수에 1000 % 3이라는 값을 저장
		System.out.printf("#3-2 : %d\n" , k30_ii);//변수 k30_ii를 화면에 출력
		
		for(int k30_i = 0; k30_i < 20; k30_i++) {//k30_i를 0부터 19까지 1씩 더해서 화면에 출력
			System.out.printf("#3-3 : %d  ", k30_i);//k30_i를 화면에 출력
			
			if ((k30_i + 1) % 5 == 0) {//단, k30_i + 1일때마다 줄바꿈을 출력 (5개씩만 찍고 줄바꿈)
				System.out.printf("\n");//줄바꿈을 화면에 출력
			}
		}

	}

}
