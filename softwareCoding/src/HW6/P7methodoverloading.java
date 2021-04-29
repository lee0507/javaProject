package HW6;

public class P7methodoverloading {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		Calc7 k30_cc = new Calc7();//Calc7 클래스를 받아서 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		
		String k30_name = "폴리융";//문자열형 변수 k30_name을 정의하고 값을 "폴리융"으로 초기한다.
		int k30_kor = 100;//숫자형 변수 k30_kor을 정의하고 값을 100으로 초기화한다.
		int k30_eng = 100;//숫자형 변수 k30_eng을 정의하고 값을 100으로 초기화한다.
		int k30_mat = 100;//숫자형 변수 k30_mat을 정의하고 값을 100으로 초기화한다.
		int k30_sci = 100;//숫자형 변수 k30_sci을 정의하고 값을 100으로 초기화한다.
		int k30_soc = 100;//숫자형 변수 k30_soc을 정의하고 값을 100으로 초기화한다.
		
		System.out.printf("3월 성적표\n");
		System.out.printf("================================================\n");
		System.out.printf("%2s  %2s  %2s  %2s  %2s  %2s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("================================================\n");
		System.out.printf("%3s %3d   %3d   %3d   %3d  %3d\n", k30_name, k30_kor, k30_eng, k30_mat, 
				k30_cc.k30_sum(k30_kor, k30_eng, k30_mat), k30_cc.k30_avg(k30_kor, k30_eng, k30_mat));
		//변수 k30_name, k30_kor, k30_eng, k30_mat, k30_cc.k30_sum, k30_cc.k30_avg(k30_kor, k30_eng, k30_mat));
		//아까 받아온 객체를 사용하여 Calc7클래스의 sum메소드와 avg메소드의 파라미터를 kor, eng, mat로 주고 실행한 다음 화면에 출력한다.
		System.out.println();
		System.out.printf("4월 성적표\n");
		System.out.printf("================================================\n");
		System.out.printf("%2s  %2s  %2s  %2s  %2s  %2s  %2s\n", "이름", "국어", "영어", "수학", "과학", "총점", "평균");
		System.out.printf("================================================\n");
		System.out.printf("%3s %3d   %3d   %3d   %3d  %3d   %3d\n", k30_name, k30_kor, k30_eng, k30_mat, k30_sci,  
				k30_cc.k30_sum(k30_kor, k30_eng, k30_mat, k30_sci), k30_cc.k30_avg(k30_kor, k30_eng, k30_mat, k30_sci));
		//변수 k30_name, k30_kor, k30_eng, k30_mat, k30_sci, k30_cc.k30_sum, k30_cc.k30_avg(k30_kor, k30_eng, k30_mat));
		//아까 받아온 객체를 사용하여 Calc7클래스의 sum메소드와 avg메소드의 파라미터를 kor, eng, mat, sci로 주고 실행한 다음 화면에 출력한다.
		System.out.println();
		System.out.printf("5월 성적표\n");
		System.out.printf("================================================\n");
		System.out.printf("%2s  %2s  %2s  %2s  %2s  %2s  %2s  %2s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점", "평균");
		System.out.printf("================================================\n");
		System.out.printf("%3s %3d   %3d   %3d   %3d  %3d   %3d   %3d\n", k30_name, k30_kor, k30_eng, k30_mat, k30_sci, k30_soc,  
				k30_cc.k30_sum(k30_kor, k30_eng, k30_mat, k30_sci, k30_soc), k30_cc.k30_avg(k30_kor, k30_eng, k30_mat, k30_sci, k30_soc));
		//변수 k30_name, k30_kor, k30_eng, k30_mat, k30_sci, k30_soc, k30_cc.k30_sum, k30_cc.k30_avg(k30_kor, k30_eng, k30_mat));
		//아까 받아온 객체를 사용하여 Calc7클래스의 sum메소드와 avg메소드의 파라미터를 kor, eng, mat, sci, soc로 주고 실행한 다음 화면에 출력한다.
	}

}
