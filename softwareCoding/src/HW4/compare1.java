package HW4;

public class compare1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_iI;//숫자형 변수 k30_iI를 정의한다.
		double k30_iD;//실수형 변수 k30_iD를 정의한다.
		
		k30_iI = 10 / 3;//숫자형 변수 k30_iI에 10 / 3의 값을 저장한다. (/은 나눈 값의 몫을 의미한다.) 
		k30_iD = 10 / 3.0;//실수형 변수 k30_iD에 10 / 3의 값을 저장한다. (/은 나눈 값의 몫을 의미한다.) 
		
		if (k30_iI == k30_iD) {//만약 k30_iI와 k30_iD가 같다면
			System.out.printf("equal\n");//equal과 줄바꿈을 화면에 출력한다.
		} else {//k30_iI와 k30_iD가 같지 않다면
			System.out.printf("Not equal[%f][%f]\n", (double)k30_iI, k30_iD);
		}//Not equal과 실수형으로 형변환한 k30_iI와 실수형 변수 k30_iD를 출력한다.
		
		if (k30_iD == 3.333333) {//만약 k30_iD와 3.333333과 같다면
			System.out.printf("equal\n");//equal과 줄바꿈을 화면에 출력한다.
		} else {//만약 k30_iD와 3.333333과 같지 않다면
			System.out.printf("Not equal[3.33333][%f]\n", k30_iD);
		}//Not equal과 실수형 변수 k30_iD를 출력한다.
		
		k30_iD = (int)k30_iD;//실수형변수 k30_iD에 정수형으로 형변환한 k30_iD의 값을 저장한다.
		if (k30_iI == k30_iD)  System.out.printf("equal\n");//만약 k30_iI와 k30_iD가 같다면 equal과 줄바꿈을 화면에 출력한다.
		else System.out.printf("Not equal[%f][%f]\n", (double)k30_iI, k30_iD);
		//k30_iI와 k30_iD가 같지 않다면 Not equal과 실수형으로 형변환한 k30_iI와 실수형 변수 k30_iD를 출력한다.
		
		System.out.printf("int로 인쇄[%d][%f]\n", k30_iI, k30_iD);//정수형 변수 k30_iI와 실수형변수 k30_iD와 줄바꿈을 화면에 출력한다.
		System.out.printf("double로 인쇄[%f][%f]\n", (double)k30_iI, k30_iD);//실수형으로 형변환한 k30_iI와 실수형변수 k30_iD와 줄바꿈을 화면에 출력한다.
		
		char k30_a = 'c';//문자 변수 k30_a를 정의하고 c라는 값을 저장한다.
		if (k30_a == 'b') System.out.printf("a는 b이다.\n");// 만약 k30_a가 b라면 a는 b이다와 줄바꿈을 화면에 출력한다.
		if (k30_a == 'c') System.out.printf("a는 c이다.\n");// 만약 k30_a가 c라면 a는 c이다와 줄바꿈을 화면에 출력한다.
		if (k30_a == 'd') System.out.printf("a는 d이다.\n");// 만약 k30_a가 d라면 a는 d이다와 줄바꿈을 화면에 출력한다.
		
		String k30_aa = "abcd";//문자열형 변수 k30_aa를 정의하고 abcd라는 값을 저장한다.
		if(k30_aa.equals("abcd")) System.out.printf("aa는 abcd이다\n");// 만약 k30_aa가 abcd라면 aa는 abcd이다와 줄바꿈을 화면에 출력한다.
		else System.out.printf("aa는 abcd가 아니다\n");// 만약 k30_aa가 abcd가 아니라면 aa는 abcd가 아니다와 줄바꿈을 화면에 출력한다.
		
		boolean k30_bb = true;//불리언형 변수 k30_bb를 정의하고 true로 값을 저장한다.
		if(!!k30_bb) System.out.printf("bb가 아니고 아니면 참이다\n");
		//만약 k30_bb가 true라면 bb가 아니고 아니면 참이다와 줄바꿈을 출력한다.(!는 부정을 의미하고 !!는 부정의 부정이라 다시 진실이 된다)
		else System.out.printf("bb가 아니고 아니면 거짓이다.\n");
		//만약 k30_bb가 false라면 bb가 아니고 아니면 거짓이다와 줄바꿈을 출력한다.

	}

}
