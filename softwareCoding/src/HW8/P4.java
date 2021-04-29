package HW8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P4 {//클래스 선언

	public static void main(String[] args) throws IOException {//메인으로부터 프로그램시작, 예외가 발생하면 해당 클래스에서 벗어나게 된다.
		// TODO Auto-generated method stub
		File k30_f = new File("D:\\12_04_07_E_무료와이파이정보.txt");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
		//d드라이브의 무료와이파이txt파일을 읽어온다.(tab기준으로 분리한 파일이다)
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader에 FileReader한 내용인 무료와이파이정보를 집어넣어서 Buffer처리를 하였다.
		
		String k30_readtxt;//문자열형 변수 k30_readtxt을 정의한다.
		
		if((k30_readtxt = k30_br.readLine()) == null) {//만약에 k30_readtxt파일에 k30_br.readLine이 null값이라면 
			System.out.printf("빈 파일입니다\n");//빈 파일입니다와 줄바꿈을 화면에 출력한다.
		}
		//첫번째 줄을 먼저 읽어야 필드명을 알 수있다.(필드명이 없는 파일일 경우 생략가능하다.)
		String[] k30_field_name = k30_readtxt.split("\t");//받아온 k30_readtxt를 \t tab 기준으로 분리해서 문자열 배열 k30_field_name에 값을 저장한다.
		
		double k30_lat = 37.3860521;//실수형 변수 k30_lat를 정의하고 값을 37.3860521로 초기화한다.
		double k30_lng = 127.1214038;//실수형 변수 k30_lng를 정의하고 값을 127.1214038로 초기화한다.
		
		int k30_LineCnt = 1;//숫자형 변수 k30_LineCnt를 정의하고 값을 0으로 초기화한다.
		double k30_min = Integer.MAX_VALUE;//실수형 변수 k30_min을 정의하고 값을 Integer.MAX_VALUE으로 초기화한다.
		double k30_max = 0;//실수형 변수 k30_max를 정의하고 값을 0으로 초기화한다.
		String k30_name1 = "";//문자열형 변수 k30_name1을 정의하고 값을 초기화한다.
		String k30_name2 = "";//문자열형 변수 k30_name2을 정의하고 값을 초기화한다.
		String k30_name3 = "";//문자열형 변수 k30_name3을 정의하고 값을 초기화한다.
		String k30_name4 = "";//문자열형 변수 k30_name4을 정의하고 값을 초기화한다.
		String k30_mindistlat = null;//문자열형 변수 k30_mindistlat을 정의하고 값을 초기화한다.
		String k30_mindistlng = null;//문자열형 변수 k30_mindistlng을 정의하고 값을 초기화한다.
		String k30_maxdistlat = null;//문자열형 변수 k30_maxdistlat을 정의하고 값을 초기화한다.
		String k30_maxdistlng = null;//문자열형 변수 k30_maxdistlng을 정의하고 값을 초기화한다.
		
		long start = System.currentTimeMillis();//시작하는 현재 시간을 받아온다.
		
		while((k30_readtxt = k30_br.readLine()) != null) {//while 반복문의 조건을 (k30_readtxt = k30_br.readLine()) != null로 설정하여 읽어올 것이 없을때까지 계속해서 반복한다.
			
			String[] k30_field = k30_readtxt.split("\t");//받아온 k30_readtxt를 \t tab 기준으로 분리해서 문자열 배열 k30_field에 값을 저장한다.
			if (k30_field[13] == "" || k30_field[14] == "" || k30_field[13] == "0" || k30_field[14] == "0" ) {//만약 k30_field[28]이나 k30_field[29]값이 비어있다면 값을 0으로 바꾸어 저장한다.
				
			} else {
				System.out.printf("**[%d번째 항목]***************\n", k30_LineCnt);// 변수 k30_LineCnt를 화면에 출력한다.
				System.out.printf(" %s : %s\n", k30_field_name[9], k30_field[9]);//변수 k30_field_name[9]과 k30_field[9]을 화면에 출력한다.
				System.out.printf(" %s : %s\n", k30_field_name[13], k30_field[13]);//변수 k30_field_name[13]과 k30_field[13]을 화면에 출력한다.
				System.out.printf(" %s : %s\n", k30_field_name[14], k30_field[14]);//변수 k30_field_name[14]과 k30_field[14]을 화면에 출력한다.
				double k30_dist = Math.sqrt(Math.pow(Double.parseDouble(k30_field[13]) - k30_lat, 2 )//실수형 변수 k30_dist를 정의하고 실수형으로 형변환한 k30_field[13]값에서 k30_lat을 빼고 그 값을 제곱한다.
						+ Math.pow(Double.parseDouble(k30_field[14]) - k30_lng, 2));//실수형으로 형변환한 k30_field[14]값에서 k30_lng를 빼고 그 값을 제곱하고 두 값을 더한 다음 Math.sqrt으로 루트를 씌운 값을 저장한다.
				System.out.printf(" 현재지점과 거리 : %f\n", k30_dist);//실수형 변수 k30_dist를 화면에 출력한다.
				System.out.printf("***************************\n");//*선과 줄바꿈을 화면에 출력한다.
				
				k30_LineCnt++;// 반복문이 한번 수행될때마다 변수 k30_LineCnt를 1씩 증가시킨다.
				
				if (k30_dist < k30_min) {//만약에 k30_dist가 k30_min보다 작다면
					k30_min = k30_dist;//k30_min에 k30_dist값을 저장한다.
					k30_name1 = k30_field[9];//그리고 k30_name1에 k30_field[1]의 값인 이름을 저장한다.
					k30_name3 = k30_field[2];
					k30_mindistlat = k30_field[13];
					k30_mindistlng = k30_field[14];
					
				}
				if (k30_dist > k30_max) {//만약에 k30_dist가 k30_max보다 크다면
					k30_max = k30_dist;//k30_max에 k30_dist값을 저장한다.
					k30_name2 = k30_field[9];//그리고 k30_name2에 k30_field[1]의 값인 이름을 저장한다.
					k30_name4 = k30_field[2];
					k30_maxdistlat = k30_field[13];
					k30_maxdistlng = k30_field[14];
				}
			}


		}
		
		k30_br.close();//k30_br bufferedReader 파일을 닫는다.
		long end = System.currentTimeMillis();//끝나는 현재 시간을 받아온다.
		System.out.println("처리건수 : " + (k30_LineCnt - 1) + "건");
		System.out.println("실행시간 : " + (end - start) / 1000.0 + "초");//끝나는 시간에서 시작한 시간을 빼서 실행에 걸린 시간을 계산한다.(1 / 1000초 값을 리턴한다.)
		System.out.printf("분당융합기술교육원과 가장 가까운 곳은 %s %s이며 거리는 %f이고 위도는 %s, 경도는 %s입니다.\n", k30_name1, k30_name3, k30_min, k30_mindistlat, k30_mindistlng);//변수 k30_name1과 k30_min을 화면에 출력한다.
		System.out.printf("분당융합기술교육원과 가장 먼 곳은 %s %S이며 거리는 %f이고 위도는 %s, 경도는 %s입니다.\n", k30_name2, k30_name4, k30_max, k30_maxdistlat, k30_maxdistlng);//변수 k30_name2와 k30_max을 화면에 출력한다.
	}

}
