package HW7;

import java.util.ArrayList;

public class P7ArrayList1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		ArrayList k30_iAL = new ArrayList();//ArrayList 클래스를 받아서 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		
		k30_iAL.add("abc");//ArrayList에 값 abc를 저장한다.
		k30_iAL.add("abcd");//ArrayList에 값 abcd를 저장한다.
		k30_iAL.add("efga");//ArrayList에 값 efga를 저장한다.
		k30_iAL.add("가나다0");//ArrayList에 값 가나다0를 저장한다.
		k30_iAL.add("1234");//ArrayList에 값 1234를 저장한다.
		k30_iAL.add("12rk34");//ArrayList에 값 12rk34를 저장한다.
		
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf(" 시작 ArraySize %d \n", k30_iAL.size());//변수 k30_iAL의 크기를 화면에 출력한다.
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iAl의 크기보다 작을때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//변수 k30_i와 k30_iAL의 k30_i인덱스 값을 화면에 출력한다.
		}
		
		k30_iAL.set(3,  "가라라라");
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf(" 내용변경 ArraySize %d \n", k30_iAL.size());
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iAl의 크기보다 작을때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//변수 k30_i와 k30_iAL의 k30_i인덱스 값을 화면에 출력한다.
		}
		
		k30_iAL.remove(4);
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf(" 내용삭제 ArraySize %d \n", k30_iAL.size());
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iAl의 크기보다 작을때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//변수 k30_i와 k30_iAL의 k30_i인덱스 값을 화면에 출력한다.
		}
		
		k30_iAL.sort(null);;
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf(" 리스트sort ArraySize %d \n", k30_iAL.size());
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iAl의 크기보다 작을때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//변수 k30_i와 k30_iAL의 k30_i인덱스 값을 화면에 출력한다.
		}
		
		k30_iAL.clear();;
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf(" 전부 삭제 ArraySize %d \n", k30_iAL.size());
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iAl의 크기보다 작을때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//변수 k30_i와 k30_iAL의 k30_i인덱스 값을 화면에 출력한다.
		}
		
	}

}
