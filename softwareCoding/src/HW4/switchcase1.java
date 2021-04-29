package HW4;

public class switchcase1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		String k30_jumin = "123456 - 1234567";//문자열 변수 k30_jumin을 정의하고 값을 123456 - 1234567로 초기화한다.
		System.out.println(k30_jumin.charAt(9));//공백도 인덱스에 포함된다. 그래서 7이 아닌 9로해야 원하는 값을 구할 수 있다.
		switch(k30_jumin.charAt(9)) {//switch 조건문은 조건과 아래의 case가 일치한다면 그 case의 문장부터 수행된다.
		case '1' : //k30_jumin.charAt(9)가 1이면
			System.out.printf("20세기전 태어난 남자 사람\n");//"20세기전 태어난 남자 사람" 문장과 줄바꿈을 화면에 출력한다
			break;//break를 넣지 않으면 조건이 만족하더라도 계속 진행되기 때문에 case 2번까지 같이 출력되게 된다.
		case '2' : //k30_jumin.charAt(9)가 2이면
			System.out.printf("20세기전 태어난 여자 사람\n");//"20세기전 태어난 여자 사람" 문장과 줄바꿈을 화면에 출력한다
			break;//break문을 수행하여 조건문이 더이상 진행되지 않는다.
		case '3' : //k30_jumin.charAt(9)가 3이면
			System.out.printf("20세기후 태어난 남자 사람\n");//"20세기후 태어난 남자 사람" 문장과 줄바꿈을 화면에 출력한다
			break;//break문을 수행하여 조건문이 더이상 진행되지 않는다.
		case '4' : //k30_jumin.charAt(9)가 4이면
			System.out.printf("20세기후 태어난 여자 사람\n");//"20세기후 태어난 여자 사람" 문장과 줄바꿈을 화면에 출력한다
			break;//break문을 수행하여 조건문이 더이상 진행되지 않는다.
		default : //위의 조건을 다 만족하지 않는다면
			System.out.printf("사람\n");//"사람" 문장과 줄바꿈을 화면에 출력한다
			break;//break문을 수행하여 조건문이 더이상 진행되지 않는다.
		}
	}

}
