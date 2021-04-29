package HW6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P14ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date k30_d = new Date();//시스템의 날짜 및 시간을 읽을 수 있도록 java.util 패키지의 Date 클래스를 생성한다.
		SimpleDateFormat k30_sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
		 //Format형식을 ("yyyy/MM/dd HH:mm:ss")로 지정한다.
		int k30_iPerson = 30;//숫자형 변수 iPerson을 정의하고 값을 30으로 초기화한다.
		
		int k30_pagekorsum = 0;//숫자형 변수 k30_pagekorsum을 정의하고 값을 0으로 초기화한다.
		int k30_pageengsum = 0;//숫자형 변수 k30_pageengsum을 정의하고 값을 0으로 초기화한다.
		int k30_pagematsum = 0;//숫자형 변수 k30_pagematsum을 정의하고 값을 0으로 초기화한다.
		int k30_pagetotalsum = 0;//숫자형 변수 k30_pagetotalsum을 정의하고 값을 0으로 초기화한다.
		double k30_pageavg = 0;//숫자형 변수 k30_pageavg을 정의하고 값을 0으로 초기화한다.
		
		P13InputData k30_inData = new P13InputData(k30_iPerson);//P13InputData 클래스에 파라미터를 inPerson으로 준다음 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		
		
		for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_iPerson보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			String k30_name = String.format("홍길%02d", k30_i + 1);//변수 k30_name에 k30_i를 string으로 형변환한 현재 홍길%02d를 값으로 저장한다. 
			int k30_kor = (int)(Math.random() * 100);//변수 k30_kor에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_eng = (int)(Math.random() * 100);//변수 k30_eng에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_mat = (int)(Math.random() * 100);//변수 k30_mat에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			k30_inData.SetData(k30_i, k30_name, k30_kor, k30_eng, k30_mat);//아까 받아온 객체를 사용하여 P13InputData클래스의 SetData함수를 실행한다.
		}

		System.out.printf("%s\n", "성적집계표");//성적집계표를 화면에 출력한다.
		System.out.printf("%s\n", "성적집계표");//성적집계표를 화면에 출력한다. 
		System.out.printf("출력일자 : %s\n", k30_sf.format(k30_d));//날짜를 받아온 변수 k30_d에 아까 지정한 SimpleDateFormat으로 yyyy.MM.dd HH:mm:ss 형태로 출력한다.
	    System.out.printf("=================================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
	    System.out.printf("%s %3s  %5s%5s%5s%5s%5s\n", "번호", "이름", "국어", "수학", "영어", "총점", "평균");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
	    System.out.printf("=================================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
		for(int i = 0; i < k30_iPerson; i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_iPerson보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf("%03d %5s %6d %6d %6d %6d %8.2f\n",//변수들을 화면에 출력한다.
					i + 1, k30_inData.k30_name[i], k30_inData.k30_kor[i], k30_inData.k30_eng[i], k30_inData.k30_mat[i], k30_inData.k30_sum[i], k30_inData.k30_avg[i]);
			k30_pagekorsum += k30_inData.k30_kor[i];//변수 k30_pagekorsum 에 k30_inData.k30_kor[i]를 하나씩 더하여 값을 저장한다.
			k30_pageengsum += k30_inData.k30_eng[i];//변수 k30_pageengsum 에 k30_inData.k30_kor[i]를 하나씩 더하여 값을 저장한다.
			k30_pagematsum += k30_inData.k30_mat[i];//변수 k30_pagematsum 에 k30_inData.k30_kor[i]를 하나씩 더하여 값을 저장한다.
			k30_pagetotalsum += k30_inData.k30_sum[i];//변수 k30_pagetotalsum 에 k30_inData.k30_kor[i]를 하나씩 더하여 값을 저장한다.
			k30_pageavg += k30_inData.k30_avg[i];//변수 k30_pageavg 에 k30_inData.k30_kor[i]를 하나씩 더하여 값을 저장한다.
			
		}
	    System.out.printf("=================================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
	    System.out.printf("합계 :%12d %6d %6d %6d %8.2f\n", k30_pagekorsum, k30_pageengsum, k30_pagematsum, k30_pagetotalsum, k30_pageavg);
	    System.out.printf("평균 :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_pagekorsum / (double)k30_iPerson), (k30_pageengsum / (double)k30_iPerson), 
	    		(k30_pagematsum / (double)k30_iPerson), (k30_pagetotalsum / (double)k30_iPerson), (k30_pageavg / (double)k30_iPerson));
	    //변수들을 순서대로 화면에 출력한다.
	}

}
