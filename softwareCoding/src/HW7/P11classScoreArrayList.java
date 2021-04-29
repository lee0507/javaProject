package HW7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class P11classScoreArrayList {
	
	static ArrayList <P11OneRec> k30_ArrayOneRec = new ArrayList <P11OneRec>();//클래스의 ArrayLlist k30_ArrayOneRec을 생성한다.
	
	static int k30_sumkor = 0;//전역변수 k30_sumkor을 정의하고 값을 0으로 초기화하였다.
	static int k30_sumeng = 0;//전역변수 k30_sumeng을 정의하고 값을 0으로 초기화하였다.
	static int k30_summat = 0;//전역변수 k30_summat을 정의하고 값을 0으로 초기화하였다.
	static int k30_sumsum = 0;//전역변수 k30_sumsum을 정의하고 값을 0으로 초기화하였다.
	static int k30_sumavg = 0;//전역변수 k30_sumavg을 정의하고 값을 0으로 초기화하였다.
	static int k30_cnt = 0;//전역변수 k30_cnt을 정의하고 값을 0으로 초기화하였다.
	static int k30_pagecnt = 0;
	static int k30_pagesumkor = 0;// 숫자형전역변수 k30_pagekorsum을 정의하고 값을 0으로 초기화한다.
	static int k30_pagesumeng = 0;// 숫자형전역변수 k30_pageengsum을 정의하고 값을 0으로 초기화한다.
	static int k30_pagesummat = 0;// 숫자형전역변수 k30_pagematsum을 정의하고 값을 0으로 초기화한다.
	static int k30_pagesumsum = 0;// 숫자형전역변수 k30_pagetotalsum을 정의하고 값을 0으로 초기화한다.
	static int k30_pagesumavg = 0;// 실수형전역변수 k30_pageavg을 정의하고 값을 0으로 초기화한다.
	static final int k30_iPerson = 200;//전역변수 k30_iPerson을 정의하고 값을 200으로 초기화하였다.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet();//dataSet함수를 실행하여 data를 받아온다.
		dataSort();//dataSort함수를 실행하여 data들을 정렬한다.
		for(int k30_i = 0; k30_i < k30_ArrayOneRec.size(); k30_i++) {//for반복문은 k30_i는 0부터 k30_ArrayOneRec의 크기까지 k30_i를 1씩 증가시키면서 수행한다.
			
			if(k30_cnt % 30 == 0) {//만약 k30_cnt가 30으로 나누었을때 나머지가 0이라면
				HeaderPrint();//HeaderPrint함수를 실행하여 Header를 화면에 출력한다
			}
			
			ItemPrint(k30_i);//ItemPrint함수를 파라미터로 k30_i로 주고 실행한다.
			k30_cnt++;//전역변수 k30_cnt를 1씩 증가시킨다.
			
			if(k30_cnt % 30 == 0) {//만약 k30_cnt가 30으로 나누었을때 나머지가 0이라면
				TailPrint();//TailPrint함수를 실행하여 Tail을 화면에 출력한다.
				resetPagesum();//resetPagesum함수를 실행하여 k30_pagesum변수들을 0으로 리셋한다.
			}
			
		}
		TailPrint2();//TailPrint함수를 실행하여 Tail을 화면에 출력한다.


	}

	private static void dataSort() {//dataSort함수를 생성한다.
		Comparator<P11OneRec> k30_st = new Comparator<P11OneRec>() {//Comparator 클래스를 받아서 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
			public int compare1(P11OneRec k30_a1, P11OneRec k30_a2) {//함수 compare을 만들고 파라미터로 k30_a1과 k30_a2를 받는다.
				return (k30_a2.sum() - k30_a1.sum());//리턴값으로 k30_a2의 sum함수에서 k30_a1의 sum함수를 뺀 값을 받는다.
			}

			@Override
			public int compare(P11OneRec k30_o1, P11OneRec k30_o2) {//compare 메소드를 오버로딩하고 파라미터로 k30_o1과 k30_o2를 받는다.
				// TODO Auto-generated method stub
				return (k30_o2.sum() - k30_o1.sum());//리턴값으로 k30_o2의 sum함수에서 k30_o1의 sum함수를 뺀 값을 받는다.
			}

		};
		Collections.sort(k30_ArrayOneRec, k30_st);//Collections.sort로 k30_ArrayOneRec 배열을 정렬한다.
		
	}

	private static void TailPrint() {
		// TODO Auto-generated method stub
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf("현재페이지\n");//현재페이지와 줄바꿈을 화면에 출력한다
		System.out.printf("국어합계 %5d  국어평균: %6.2f\n", k30_pagesumkor, k30_pagesumkor / 30.);//변수 k30_pagesumkor과 k30_cnt로 나눈 k30_sumpagekor를 화면에 출력한다.
		System.out.printf("영어합계 %5d  영어평균: %6.2f\n", k30_pagesumeng, k30_pagesumeng / 30.);//변수 k30_pagesumeng과 k30_cnt로 나눈 k30_sumpageeng를 화면에 출력한다.
		System.out.printf("수학합계 %5d  수학평균: %6.2f\n", k30_pagesummat, k30_pagesummat / 30.);//변수 k30_pagesummat과 k30_cnt로 나눈 k30_sumpagemat를 화면에 출력한다.
		System.out.printf("반평균합계 %d  반평균: %6.2f\n", k30_pagesumavg, k30_pagesumavg / 30.);//변수 k30_pagesumavg과 k30_cnt로 나눈 k30_sumpageavg를 화면에 출력한다.
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf("누적페이지\n");//누적페이지와 줄바꿈을 화면에 출력한다
		System.out.printf("국어합계 %5d  국어평균: %6.2f\n", k30_sumkor, k30_sumkor / (double)k30_cnt);//변수 k30_sumkor과 k30_cnt로 나눈 k30_sumkor를 화면에 출력한다.
		System.out.printf("영어합계 %5d  영어평균: %6.2f\n", k30_sumeng, k30_sumeng / (double)k30_cnt);//변수 k30_sumeng과 k30_cnt로 나눈 k30_sumeng를 화면에 출력한다.
		System.out.printf("수학합계 %5d  수학평균: %6.2f\n", k30_summat, k30_summat / (double)k30_cnt);//변수 k30_summat과 k30_cnt로 나눈 k30_summat를 화면에 출력한다.
		System.out.printf("반평균합계 %d  반평균: %6.2f\n", k30_sumavg, k30_sumavg / (double)k30_cnt);//변수 k30_sumavg과 k30_cnt로 나눈 k30_sumavg를 화면에 출력한다.
		System.out.println();//줄바꿈을 화면에 출력한다.

		
	}
	
	private static void TailPrint2() {
		System.out.printf("현재페이지\n");//현재페이지와 줄바꿈을 화면에 출력한다
		System.out.printf("국어합계 %5d  국어평균: %6.2f\n", k30_pagesumkor, k30_pagesumkor / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.)));//변수 k30_pagesumkor과 k30_cnt로 나눈 k30_sumpagekor를 화면에 출력한다.
		System.out.printf("영어합계 %5d  영어평균: %6.2f\n", k30_pagesumeng, k30_pagesumeng / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.)));//변수 k30_pagesumeng과 k30_cnt로 나눈 k30_sumpageeng를 화면에 출력한다.
		System.out.printf("수학합계 %5d  수학평균: %6.2f\n", k30_pagesummat, k30_pagesummat / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.)));//변수 k30_pagesummat과 k30_cnt로 나눈 k30_sumpagemat를 화면에 출력한다.
		System.out.printf("반평균합계 %d  반평균: %6.2f\n", k30_pagesumavg, k30_pagesumavg / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.)));//변수 k30_pagesumavg과 k30_cnt로 나눈 k30_sumpageavg를 화면에 출력한다.
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf("누적페이지\n");//누적페이지와 줄바꿈을 화면에 출력한다
		System.out.printf("국어합계 %5d  국어평균: %6.2f\n", k30_sumkor, k30_sumkor / (double)k30_cnt);//변수 k30_sumkor과 k30_cnt로 나눈 k30_sumkor를 화면에 출력한다.
		System.out.printf("영어합계 %5d  영어평균: %6.2f\n", k30_sumeng, k30_sumeng / (double)k30_cnt);//변수 k30_sumeng과 k30_cnt로 나눈 k30_sumeng를 화면에 출력한다.
		System.out.printf("수학합계 %5d  수학평균: %6.2f\n", k30_summat, k30_summat / (double)k30_cnt);//변수 k30_summat과 k30_cnt로 나눈 k30_summat를 화면에 출력한다.
		System.out.printf("반평균합계 %d  반평균: %6.2f\n", k30_sumavg, k30_sumavg / (double)k30_cnt);//변수 k30_sumavg과 k30_cnt로 나눈 k30_sumavg를 화면에 출력한다.
		System.out.println();//줄바꿈을 화면에 출력한다.
	}

	private static void ItemPrint(int k30_i) {//ItemPring함수를 생성하고 파라미터로 숫자형 변수 k30_i를 주었다..
		// TODO Auto-generated method stub
		P11OneRec k30_rec;//P9OneRec 클래스를 받아서 객체를 만든다.
		
		k30_rec = k30_ArrayOneRec.get(k30_i);//인스턴스를 생성하여서 객체에 연결한다.
		System.out.printf("%3d  %-5s %3d  %3d  %3d  %3d  %6.2f\n", k30_rec.student_id(), k30_rec.name(), k30_rec.kor(), k30_rec.eng(), k30_rec.mat(), k30_rec.sum(), k30_rec.avg());
		//변수들을 화면에 출력한다.
		k30_sumkor += k30_rec.kor();// 변수 k30_sumkor에 k30_rec.kor()을 더한다.
		k30_sumeng += k30_rec.eng();// 변수 k30_sumeng에 k30_rec.eng()를 더한다.
		k30_summat += k30_rec.mat();// 변수 k30_summat에 k30_rec.mat()을 더한다.
		k30_sumsum += k30_rec.sum();// 변수 k30_sumsum에 k30_rec.sum()을 더한다.
		k30_sumavg += k30_rec.avg();// 변수 k30_sumavg에 k30_rec.avg()를 더한다.
		k30_pagesumkor += k30_rec.kor();// 변수 k30_pagesumkor에 k30_rec.kor()을 더한다.
		k30_pagesumeng += k30_rec.eng();// 변수 k30_pagesumeng에 k30_rec.eng()를 더한다.
		k30_pagesummat += k30_rec.mat();// 변수 k30_pagesummat에 k30_rec.mat()을 더한다.
		k30_pagesumsum += k30_rec.sum();// 변수 k30_pagesumsum에 k30_rec.sum()을 더한다.
		k30_pagesumavg += k30_rec.avg();// 변수 k30_pagesumavg에 k30_rec.avg()를 더한다.
		
	}
	
	private static void resetPagesum() {//resetPagesum함수를 생성한다.
		// TODO Auto-generated method stub
		k30_pagesumkor = 0;// 변수 k30_pagesumkor를 0으로 초기화한다.
		k30_pagesumeng = 0;// 변수 k30_pagesumeng를 0으로 초기화한다.
		k30_pagesummat = 0;// 변수 k30_pagesummat를 0으로 초기화한다.
		k30_pagesumsum = 0;// 변수 k30_pagesumsum를 0으로 초기화한다.
		k30_pagesumavg = 0;// 변수 k30_pagesumavg를 0으로 초기화한다.
		
	}

	private static void HeaderPrint() {//HeaderPring함수를 생성한다.

		Date k30_d = new Date();//시스템의 날짜 및 시간을 읽을 수 있도록 java.util 패키지의 Date 클래스를 생성한다.
		SimpleDateFormat k30_sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
		 //Format형식을 ("yyyy/MM/dd HH:mm:ss")로 지정한다.
		k30_pagecnt++;
		System.out.printf("%16s\n","성적집계표");//성적집계표와 줄바꿈을 화면에 출력한다
		System.out.printf("PAGE : %d  출력일자 : %s\n", k30_pagecnt, k30_sf.format(k30_d));//날짜를 받아온 변수 k30_d에 아까 지정한 SimpleDateFormat으로 yyyy.MM.dd HH:mm:ss 형태로 출력한다.
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력한다.
		System.out.printf("%2s%4s %3s %2s %2s %2s   %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");//Header를 화면에 출력한다.
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력한다.
	}

	private static void dataSet() {//dataSetPrint함수를 생성한다.
		// TODO Auto-generated method stub
		for (int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for반복문으로 k30_i가 0부터 k30_iPerson보다 작을때까지 1씩 증가시키면서 수행한다.
			String k30_name = String.format("홍길%02d", k30_i + 1);//변수 k30_name에 k30_i + 1를 string으로 형변환한 현재 홍길%02d를 값으로 저장한다. 
			int k30_kor = (int)(Math.random() * 100);//변수 k30_kor에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_eng = (int)(Math.random() * 100);//변수 k30_eng에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_mat = (int)(Math.random() * 100);//변수 k30_mat에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			k30_ArrayOneRec.add(new P11OneRec(k30_i + 1, k30_name, k30_kor, k30_eng, k30_mat));//ArrayList에 P9OneRec 함수를 통해서 만들어진 값을 저장한다.
		}
	}
}

