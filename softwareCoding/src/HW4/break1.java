package HW4;

public class break1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_sum = 0;// 숫자형 변수 k30_sum을 정의하고 값을 0으로 초기화한다.
		int k30_i = 0;// 숫자형 변수 k30_i을 정의하고 값을 0으로 초기화한다.
		
		while (true) {//while 반복문의 조건을 true로 설정하여 계속해서 돌아가도록 한다.
			if (k30_sum > 100) {//만약 k30_sum 변수의 값이 100을 넘어가게 되면
				break;//break문이 수행되고, 이 부분은 실행되지 않고 while문을 완전히 벗어나게 된다.
			}
			k30_i++;//변수 k30_i의 값을 1씩 증가시킨다.
			k30_sum += k30_i;// 변수 k30_sum의 값에 k30_i의 값을 더해준다.(k30_sum = k30_sum + k30_i로 쓸 수도 있다.)
		}
		System.out.println("k30_i = " + k30_i);//변수 k30_i의 값을 화면에 출력한다.
		System.out.println("k30_sum = " + k30_sum);//변수 k30_sum의 값을 화면에 출력한다.
	}

}
