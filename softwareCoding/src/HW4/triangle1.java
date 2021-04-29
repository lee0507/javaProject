package HW4;

public class triangle1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_iA, k30_iB;//숫자형 변수 k30_iA와 k30_iB를 정의한다.
		
		k30_iA = 0;//k30_iA의 값을 0으로 초기화한다.
		while (true) {//while 반복문의 조건을 true로 설정하여 계속해서 반복문이 수행되도록 한다.
			k30_iB = 0;//k30_iB의 값을 0으로 초기화한다.
			while(true) {//while 반복문의 조건을 true로 설정하여 계속해서 반복문이 수행되도록 한다.
				System.out.printf("*");//"*"을 화면에 출력한다.
				if(k30_iA == k30_iB) {//만약 변수 k30_iA와 k30_iB의 값이 같다면
					break;//break문을 수행하여 더이상 반복문이 진행되지 않도록 한다.
				}
				k30_iB++;//변수 k30_iB를 1 증가시킨다.
			}
			System.out.printf("\n");// 안의 while문이 끝날때마다 줄바꿈을 화면에 출력한다.
			k30_iA++;//변수 k30_iA를 1 증가시킨다.
			if(k30_iA == 30) {//만약 변수 k30_iA가 30이라면
				break;//break문을 수행하여 더이상 반복문이 진행되지 않도록 한다.
			}
		}
	}

}
