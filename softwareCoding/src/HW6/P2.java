package HW6;

public class P2 {//클래스 선언
	
	static int k30_iStatic; //숫자형 전역변수 k30_iStatic을 정의한다.
	
	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_iMain;//숫자형 변수 k30_iMain을 정의한다.
		
		k30_iMain = 1;//변수 k30_iMain의 값으로 1을 저장한다.
		k30_iStatic = 1;//전역변수인 k30_iStatic의 값으로 1을 저장한다.
		
		System.out.printf("**************************\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf("메소드호출전 메인에서 ->iStatic=[%d]\n", k30_iStatic);//지금은 처음 저장한 값인 1이 화면에 출력된다.
		System.out.printf("메소드호출전 메인에서 ->iMain=[%d]\n", k30_iMain);//지금은 처음 저장한 값인 1이 화면에 출력된다.
		System.out.printf("**************************\n");//*선과 줄바꿈을 화면에 출력한다.
		
		add(k30_iMain);//함수 add를 k30_iMain파라미터로 불러온다.
		
		System.out.printf("**************************\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf("메소드호출전 메인에서 ->iStatic=[%d]\n", k30_iStatic);//전역변수는 클래스 전체에 사용되기 때문에 위에서 더한 값인 2가 그대로 출력된다.
		System.out.printf("메소드호출전 메인에서 ->iMain=[%d]\n", k30_iMain);//지역변수는 main클래스 내에서 사용되기 때문에 이전의 값인 1이 그대로 출력된다.
		System.out.printf("**************************\n");//*선과 줄바꿈을 화면에 출력한다.
		
		k30_iMain = add2(k30_iMain);//메소드 add2를 k30_iMain파라미터로 불러와서 다시 k30_iMain에 저장한다.
		
		System.out.printf("**************************\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf("메소드호출전 메인에서 ->iStatic=[%d]\n", k30_iStatic);//전역변수는 클래스 전체에 사용되기 때문에 위에서 더한 값인 2가 그대로 출력된다.
		System.out.printf("메소드호출전 메인에서 ->iMain=[%d]\n", k30_iMain);//지역변수는 return값으로 받아와서 다시 저장했기때문에 2가 출력된다.
		System.out.printf("**************************\n");//*선과 줄바꿈을 화면에 출력한다.
	}
	
	public static void add(int k30_i) {//add 메소드를 정의하고 파라미터를 숫자형 변수 i로 받는다.
		k30_iStatic++;//숫자형 전역변수 k30_iStatic에 1을 증가시킨다.
		k30_i++;//숫자형 변수 i에 1을 증가시킨다.
		System.out.printf("add메소드에서 -> iStatic=[%d]\n", k30_iStatic);//메소드 내에서 1이 증가한 2가 출력된다.
		System.out.printf("add메소드에서 -> i=[%d]\n", k30_i);//메소드 내에서 1이 증가한 2가 출력된다.
	}
	
	public static int add2(int k30_i) {//add2 메소드를 정의하고 파라미터를 숫자형 변수 i로 받는다.
		k30_iStatic++;//숫자형 전역변수 k30_iStatic에 1을 증가시킨다.
		k30_i++;//숫자형 변수 i에 1을 증가시킨다.
		System.out.printf("add메소드에서 -> iStatic=[%d]\n", k30_iStatic);//메소드 내에서 1이 증가한 3가 출력된다.
		System.out.printf("add메소드에서 -> i=[%d]\n", k30_i);//메소드 내에서 1이 증가한 2가 출력된다.
		return k30_i;//리턴값으로 k30_i를 받는다.
	}

}
