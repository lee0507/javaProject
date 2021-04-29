package HW6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P15ReportSheet {
	static int k30_korsum = 0;// 숫자형변수 k30_korsum을 정의하고 값을 0으로 초기화한다.
	static int k30_engsum = 0;// 숫자형변수 k30_engsum을 정의하고 값을 0으로 초기화한다.
	static int k30_matsum = 0;// 숫자형변수 k30_matsum을 정의하고 값을 0으로 초기화한다.
	static int k30_totalsum = 0;// 숫자형변수 k30_totalsum을 정의하고 값을 0으로 초기화한다.
	static int k30_pagekorsum = 0;// 숫자형변수 k30_pagekorsum을 정의하고 값을 0으로 초기화한다.
	static int k30_pageengsum = 0;// 숫자형변수 k30_pageengsum을 정의하고 값을 0으로 초기화한다.
	static int k30_pagematsum = 0;// 숫자형변수 k30_pagematsum을 정의하고 값을 0으로 초기화한다.
	static int k30_pagetotalsum = 0;// 숫자형변수 k30_pagetotalsum을 정의하고 값을 0으로 초기화한다.
	static double k30_pageavg = 0;// 실수형변수 k30_pageavg을 정의하고 값을 0으로 초기화한다.
	static double k30_avg = 0;// 실수형변수 k30_avg을 정의하고 값을 0으로 초기화한다.
	static int k30_cnt = 0;// 숫자형변수 k30_cnt을 정의하고 값을 0으로 초기화한다.
	static int k30_pagecnt = 0;
	
	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		Date k30_d = new Date();//시스템의 날짜 및 시간을 읽을 수 있도록 java.util 패키지의 Date 클래스를 생성한다.
		SimpleDateFormat k30_sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
		 //Format형식을 ("yyyy/MM/dd HH:mm:ss")로 지정한다.
		
		int k30_iPerson = 200;//숫자형변수 k30_iPerson을 정의하고 값을 200으로 초기화한다.

		P13InputData k30_inData = new P13InputData(k30_iPerson);//P13InputData 클래스에 파라미터를 inPerson으로 준다음 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		
		
		for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_iPerson보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			String k30_name = String.format("홍길%02d", k30_i + 1);//변수 k30_name에 k30_i를 string으로 형변환한 현재 홍길%02d를 값으로 저장한다. 
			int k30_kor = (int)(Math.random() * 100);//변수 k30_kor에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_eng = (int)(Math.random() * 100);//변수 k30_eng에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_mat = (int)(Math.random() * 100);//변수 k30_mat에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			k30_inData.SetData(k30_i, k30_name, k30_kor, k30_eng, k30_mat);//아까 받아온 객체를 사용하여 P13InputData클래스의 SetData함수를 실행한다.
		}
		
			for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_iPerson보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.

				if(k30_cnt % 30 == 0) {//만약 cnt가 30으로 나누었을때 나머지가 0이라면 안의 내용을 출력한다.
					System.out.printf("%13s\n", "성적집계표");//성적집계표를 화면에 출력한다.
					System.out.printf("PAGE : %d         출력일자 : %20s\n", k30_pagecnt + 1, k30_sf.format(k30_d));//성적집계표를 화면에 출력한다.
				    System.out.printf("=================================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
				    System.out.printf("%s %3s  %5s%5s%5s%5s%5s\n", "번호", "이름", "국어", "수학", "영어", "총점", "평균");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
				    System.out.printf("=================================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
				    k30_pagecnt++;
				}
				
				System.out.printf("%03d %5s %6d %6d %6d %6d %8.2f\n",k30_i + 1, k30_inData.k30_name[k30_i], k30_inData.k30_kor[k30_i], 
						k30_inData.k30_eng[k30_i], k30_inData.k30_mat[k30_i], k30_inData.k30_sum[k30_i], k30_inData.k30_avg[k30_i]);//변수들을 순서대로 화면에 출력한다.
				k30_korsum += k30_inData.k30_kor[k30_i];//변수 k30_korsum 에 k30_inData.k30_kor[i]를 하나씩 더하여 값을 저장한다.
				k30_engsum += k30_inData.k30_eng[k30_i];//변수 k30_engsum 에 k30_inData.k30_eng[i]를 하나씩 더하여 값을 저장한다.
				k30_matsum += k30_inData.k30_mat[k30_i];//변수 k30_matsum 에 k30_inData.k30_mat[i]를 하나씩 더하여 값을 저장한다.
				k30_totalsum += k30_inData.k30_sum[k30_i];//변수 k30_totalsum 에 k30_inData.k30_sum[i]를 하나씩 더하여 값을 저장한다.
				k30_avg += k30_inData.k30_avg[k30_i];//변수 k30_avg 에 k30_inData.k30_avg[i]를 하나씩 더하여 값을 저장한다.
				k30_cnt++;//변수 k30_cnt를 하나씩 증가시킨다.
				k30_pagekorsum += k30_inData.k30_kor[k30_i];//변수 k30_pagekorsum 에 k30_inData.k30_kor[i]를 하나씩 더하여 값을 저장한다.
				k30_pageengsum += k30_inData.k30_eng[k30_i];//변수 k30_pageengsum 에 k30_inData.k30_eng[i]를 하나씩 더하여 값을 저장한다.
				k30_pagematsum += k30_inData.k30_mat[k30_i];//변수 k30_pagematsum 에 k30_inData.k30_mat[i]를 하나씩 더하여 값을 저장한다.
				k30_pagetotalsum = k30_pagekorsum + k30_pageengsum + k30_pagematsum;//변수 k30_pagematsum 에 k30_pagekorsum과 k30_pageengsum과 k30_pagematsum을 하나씩 더하여 값을 저장한다.
				k30_pageavg = k30_pagetotalsum / 3.;//변수 k30_pageavg 에 k30_pagetotalsum 값을 3으로 나누어 값을 저장한다.
				
				if(k30_cnt % 30 == 0) {//만약 cnt가 30으로 나누었을때 나머지가 0이라면 안의 내용을 출력한다.
					System.out.printf("=================================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
					System.out.printf("현재페이지\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
					System.out.printf("합계 :%12d %6d %6d %6d %8.2f\n", k30_pagekorsum, k30_pageengsum, k30_pagematsum, k30_pagetotalsum, k30_pageavg);//변수들을 순서대로 출력한다.
					System.out.printf("평균 :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_pagekorsum / 30.), (k30_pageengsum / 30.), (k30_pagematsum / 30.), (k30_pagetotalsum / 30.), (k30_pageavg / 30.));
					System.out.printf("=================================================\n");//변수들을 30으로 나눈 뒤 순서대로 출력하고 =선과 줄바꿈을 화면에 출력한다.
					System.out.printf("누적페이지\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
					System.out.printf("합계 :%12d %6d %6d %6d %8.2f\n", k30_korsum, k30_engsum, k30_matsum, k30_totalsum, k30_avg);//변수들을 순서대로 출력한다.
					System.out.printf("평균 :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_korsum / (double)(k30_i + 1)), (k30_engsum / (double)(k30_i + 1)), 
							(k30_matsum / (double)(k30_i + 1)), (k30_totalsum / (double)(k30_i + 1)), (k30_avg / (double)(k30_i + 1)));//k30_i는 0부터 시작해서 +1하여서 나누어 주었다.
					System.out.println();
					
					k30_pagekorsum = 0;// 숫자형변수 k30_pagekorsum의 값을 0으로 초기화한다.
					k30_pageengsum = 0;// 숫자형변수 k30_pageengsum의 값을 0으로 초기화한다.
					k30_pagematsum = 0;// 숫자형변수 k30_pagematsum의 값을 0으로 초기화한다.
					k30_pagetotalsum = 0;// 숫자형변수 k30_pagetotalsum의 값을 0으로 초기화한다.
					k30_pageavg = 0;// 숫자형변수 k30_pageavg의 값을 0으로 초기화한다.
				}
				
			}
			if(k30_cnt % 30 != 0) {
				System.out.printf("=================================================\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
				System.out.printf("현재페이지\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
				System.out.printf("합계 :%12d %6d %6d %6d %8.2f\n", k30_pagekorsum, k30_pageengsum, k30_pagematsum, k30_pagetotalsum, k30_pageavg);//변수들을 순서대로 출력한다.
				System.out.printf("평균 :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_pagekorsum / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))), (k30_pageengsum / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))), 
						(k30_pagematsum / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))), (k30_pagetotalsum / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))), (k30_pageavg / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))));
			    System.out.printf("=================================================\n");//변수들을 30으로 나눈 뒤 순서대로 출력하고 =선과 줄바꿈을 화면에 출력한다.
				System.out.printf("누적페이지\n");//구분할 수 있는 선과 줄바꿈을 화면에 출력한다.
				System.out.printf("합계 :%12d %6d %6d %6d %8.2f\n", k30_korsum, k30_engsum, k30_matsum, k30_totalsum, k30_avg);//변수들을 순서대로 출력한다.
				System.out.printf("평균 :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_korsum / (double)k30_iPerson), (k30_engsum / (double)k30_iPerson), 
						(k30_matsum / (double)k30_iPerson), (k30_totalsum / (double)k30_iPerson), (k30_avg / (double)k30_iPerson));//마지막 k30_iPerson으로 변수들을 나누어서 출력하였다.
			}


		}

		
	}


