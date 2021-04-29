package HW7;

import java.util.ArrayList;

public class P8ArrayList2 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_iTestMax = 10;//숫자형 변수 k30_iTestMax를 정의하고 값을 1000000으로 초기화한다.
		ArrayList k30_iAL = new ArrayList();//ArrayList 클래스를 받아서 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		
		for(int k30_i = 0; k30_i < k30_iTestMax; k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iTestMax보다 작을때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_iAL.add((int)(Math.random() * 1000000));//변수 k30_iAl에 난수 0 ~ 1000000까지의 값을 숫자형으로 형변환하고 저장한다.
		}
		
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iAl의 크기보다 작을때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" ArrayList %d = %d\n", k30_i, k30_iAL.get(k30_i));//변수 k30_i와 k30_iAL의 k30_i인덱스 값을 화면에 출력한다.
		}
		
		System.out.printf("************************\n");//*선과 줄바꿈을 화면에 출력한다.
		k30_iAL.sort(null);//k30_iAL.sort로 값을 정렬한다.
		
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iAl의 크기보다 작을때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" ArrayList %d = %d\n", k30_i, k30_iAL.get(k30_i));//변수 k30_i와 k30_iAL의 k30_i인덱스 값을 화면에 출력한다.
		}
	}

}
