package HW3;

public class P2 { //클래스 선언

	public static void main(String[] args) { //메인으로부터 프로그램시작
	int k30_sum; // k30_sum이라는 숫자형 변수 정의
	k30_sum = 0; // k30_sum의 값을 0으로 초기화
	
	for (int k30_i = 1; k30_i < 101; k30_i++) { //k30_sum에 k30_i의 값이 1씩 증가하면서 k30_sum에 
		k30_sum = k30_sum + k30_i;				//k30_i의 값인 1부터 100까지의 값을 더한다.
	}
	System.out.printf("#2 : %d\n" , k30_sum); //변수 k30_sum을 화면에 출력
	
	System.out.printf("#2-2 : %d\n", k30_sum / 100); // 변수 k30_sum의 나누기 100한 값을 화면에 출력
	
	int [] k30_v = {1, 2, 3, 4, 5}; // k30_v이라는 숫자형 배열 정의
	int k30_vSum; // k30_vSum이라는 숫자형 변수 정의
	
	k30_vSum = 0; // k30_vSum의 값을 0으로 초기화
	
	for(int k30_i = 0; k30_i < 5; k30_i++) { //k30_vSum에 k30_i의 값이 1씩 증가하면서 k30_v안의 인덱스 0번부터 꺼내와서
		k30_vSum = k30_vSum + k30_v[k30_i];  //k30_vSum에 1부터 5까지 하나씩 더한다.
	}
	
	System.out.printf("#2-3 : %d\n" , k30_vSum); // 변수 k30_vSum을 화면에 출력
	}

}
