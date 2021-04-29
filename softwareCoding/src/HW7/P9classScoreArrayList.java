package HW7;

import java.util.ArrayList;

public class P9classScoreArrayList {//클래스 선언
	
	static ArrayList <P9OneRec> k30_ArrayOneRec = new ArrayList <P9OneRec>();//클래스의 ArrayLlist k30_ArrayOneRec을 생성한다.
	
	static int k30_sumkor = 0;//전역변수 k30_sumkor을 정의하고 값을 0으로 초기화하였다.
	static int k30_sumeng = 0;//전역변수 k30_sumeng을 정의하고 값을 0으로 초기화하였다.
	static int k30_summat = 0;//전역변수 k30_summat을 정의하고 값을 0으로 초기화하였다.
	static int k30_sumsum = 0;//전역변수 k30_sumsum을 정의하고 값을 0으로 초기화하였다.
	static int k30_sumavg = 0;//전역변수 k30_sumavg을 정의하고 값을 0으로 초기화하였다.
	static final int k30_iPerson = 20;//전역변수 k30_iPerson을 정의하고 값을 20으로 초기화하였다.
	
	
	
	
	public static void main(String[] args) {//메인으로부터 프로그램시작
		dataSet();//dataSet함수를 실행하여 data를 받아온다.
		HeaderPrint();//HeaderPrint함수를 실행하여 Header를 화면에 출력한다
		for(int k30_i = 0; k30_i < k30_ArrayOneRec.size(); k30_i++) {//for반복문으로 k30_i가 0부터 k30_ArrayOneRec의 크기보다 작을때까지 1씩 증가시키면서 수행한다.
			ItemPrint(k30_i);//ItemPrint함수를 파라미터로 k30_i로 주고 실행한다.
		}
		TailPrint();//TailPrint함수를 실행하여 Tail을 화면에 출력한다.
	}

	private static void TailPrint() { //TailPrint함수를 생성한다.
		System.out.printf("*****************************************\n");//*선을 화면에 출력한다.
		System.out.printf("국어합계 %5d  국어평균: %6.2f\n", k30_sumkor, k30_sumkor / (double)k30_ArrayOneRec.size());//변수 k30_sumkor과 Array의 크기로 나눈 k30_sumkor를 화면에 출력한다.
		System.out.printf("영어합계 %5d  영어평균: %6.2f\n", k30_sumeng, k30_sumeng / (double)k30_ArrayOneRec.size());//변수 k30_sumeng과 Array의 크기로 나눈 k30_sumeng를 화면에 출력한다.
		System.out.printf("수학합계 %5d  수학평균: %6.2f\n", k30_summat, k30_summat / (double)k30_ArrayOneRec.size());//변수 k30_summat과 Array의 크기로 나눈 k30_summat를 화면에 출력한다.
		System.out.printf("*****************************************\n");//*선을 화면에 출력한다.
		System.out.printf("반평균합계 %d  반평균: %6.2f\n", k30_sumavg, k30_sumavg / (double)k30_ArrayOneRec.size());//변수 k30_sumavg과 Array의 크기로 나눈 k30_sumavg를 화면에 출력한다.
	}

	private static void ItemPrint(int k30i) {//ItemPring함수를 생성하고 파라미터로 숫자형 변수 k30_i를 주었다..
		P9OneRec k30_rec;//P9OneRec 클래스를 받아서 객체를 만든다.
		
		k30_rec = k30_ArrayOneRec.get(k30i);//인스턴스를 생성하여서 객체에 연결한다.
		System.out.printf("%3d  %s %3d  %3d  %3d  %3d  %6.2f\n", k30_rec.student_id(), k30_rec.name(), k30_rec.kor(), k30_rec.eng(), k30_rec.mat(), k30_rec.sum(), k30_rec.avg());
		//변수들을 화면에 출력한다.
		k30_sumkor += k30_rec.kor();// 변수 k30_sumkor에 k30_rec.kor()을 더한다.
		k30_sumeng += k30_rec.eng();// 변수 k30_sumeng에 k30_rec.eng()를 더한다.
		k30_summat += k30_rec.mat();// 변수 k30_summat에 k30_rec.mat()을 더한다.
		k30_sumsum += k30_rec.sum();// 변수 k30_sumsum에 k30_rec.sum()을 더한다.
		k30_sumavg += k30_rec.avg();// 변수 k30_sumavg에 k30_rec.avg()를 더한다.
		
	}

	private static void HeaderPrint() {//TailPrint함수를 생성한다.
		System.out.printf("*****************************************\n");//*선을 화면에 출력한다.
		System.out.printf("%2s%4s %3s %2s %2s %2s   %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");//Header를 화면에 출력한다.
		System.out.printf("*****************************************\n");//*선을 화면에 출력한다.
	}

	private static void dataSet() {//dataSet함수를 생성한다.
		for (int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for반복문으로 k30_i가 0부터 k30_iPerson보다 작을때까지 1씩 증가시키면서 수행한다.
			String k30_name = String.format("홍길%02d", k30_i);//변수 k30_name에 k30_i를 string으로 형변환한 현재 홍길%02d를 값으로 저장한다. 
			int k30_kor = (int)(Math.random() * 100);//변수 k30_kor에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_eng = (int)(Math.random() * 100);//변수 k30_eng에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_mat = (int)(Math.random() * 100);//변수 k30_mat에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			k30_ArrayOneRec.add(new P9OneRec(k30_i, k30_name, k30_kor, k30_eng, k30_mat));//ArrayList에 P9OneRec 함수를 통해서 만들어진 값을 저장한다.
		}
	}
}
