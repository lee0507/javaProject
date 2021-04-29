package HW4;

public class for1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_sum = 0;//숫자형 변수 k30_sum을 정의하고 값을 0으로 초기화한다.
		for (int k30_i = 0; k30_i < 10; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_sum = k30_sum + k30_i;// 변수 k30_sum에 k30_i를 더한 값을 저장한다.
		}//k30_sum += k30_i로도 축약해서 사용할 수 있다.
		System.out.printf("sum %d\n", k30_sum);//변수 k30_sum을 화면에 출력한다
		
		for (int k30_i = 1; k30_i < 10; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 10보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf("********************\n");// 변수를 출력하는 %가 ""안에 들어있지 않기 때문에 , k30_i는 적을 필요가 없다.
			System.out.printf("      구구단 %d 단\n", k30_i);//변수 k30_i를 화면에 출력한다.
			System.out.printf("********************\n");
			for (int k30_j = 1; k30_j < 10; k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 10보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf(" %d * %d = %d \n", k30_i, k30_j, k30_i * k30_j);//변수 k30_i, k30_j, k30_i * k30_j를 화면에 출력한다.
			}
		}
	}

}
