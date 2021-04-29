package HW8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P7_3 {//클래스 선언

	public static void main(String[] args) throws IOException {//메인으로부터 프로그램시작, 예외가 발생하면 해당 클래스에서 벗어나게 된다.
		File k30_f = new File("d:\\day_data\\StockA005930.csv");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
		//아까 만들어놓은 d드라이브의 삼성전자주식정보데이터csv파일을 읽어온다.
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader에 FileReader한 내용인 주식정보데이터를 집어넣어서 Buffer처리를 하였다.
		
		String k30_readtxt;//문자열형 데이터 k30_readtxt를 정의한다.
		int k30_max = 0;//숫자형 데이터 k30_max를 정의하고 값을 0으로 초기화한다.
		int k30_min = Integer.MAX_VALUE;//숫자형 데이터 k30_min를 정의하고 값을 Integer.MAX_VALUE값으로 초기화한다.
		String k30_minname1 = "";//문자열형 데이터 k30_minname1을 정의한다.
		String k30_maxname2 = "";//문자열형 데이터 k30_maxname2를 정의한다.

		long start = System.currentTimeMillis();//시작하는 현재 시간을 받아온다.
		
		while ((k30_readtxt = k30_br.readLine()) != null) {//while 반복문의 조건을 (k30_readtxt = k30_br.readLine()) != null로 설정하여 읽어올 것이 없을때까지 계속해서 반복한다.
			
			String[] k30_field = k30_readtxt.split(",");//받아온 k30_readtxt를 , comma 기준으로 분리해서 문자열 배열 k30_field에 값을 저장한다.
			for (int k30_i = 0; k30_i < k30_field.length; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 field의 길이보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
				if(k30_field[1].substring(0, 4).equals("2015")) {//만약 k30_field[1]를 4번째자리까지 잘랐을때 2015라면 
					if (k30_min > Integer.parseInt(k30_field[3])) {//k30_field[3]을 숫자형으로 형변환한 값이 k30_min보다 작다면
						k30_min = Integer.parseInt(k30_field[3]);//k30_field[3]을 숫자형으로 형변환한 값을 k30_min으로 저장한다.
						k30_minname1 = k30_field[1];//k30_field[1]을 k30_minname1으로 저장한다.
						
					}
					if (k30_max < Integer.parseInt(k30_field[3])) {//k30_field[3]을 숫자형으로 형변환한 값이 k30_max보다 크다면
						k30_max = Integer.parseInt(k30_field[3]);//k30_field[3]을 숫자형으로 형변환한 값을 k30_max으로 저장한다.
						k30_maxname2 = k30_field[1];//k30_field[1]을 k30_maxname2으로 저장한다.
					}
				}
			}

		}
		k30_br.close();//k30_br bufferedReader 파일을 닫는다.
		
		long end = System.currentTimeMillis();//끝나는 현재 시간을 받아온다.
		System.out.println("실행시간 : " + (end - start) / 1000.0 + "초");//끝나는 시간에서 시작한 시간을 빼서 실행에 걸린 시간을 계산한다.(1 / 1000초 값을 리턴한다.)
		System.out.printf("날짜 %s 최저가 %d\n", k30_minname1, k30_min);//변수 k30_minname1과 k30_min을 화면에 출력한다.
		System.out.printf("날짜 %s 최고가 %d\n", k30_maxname2, k30_max);//변수 k30_maxname2과 k30_max를 화면에 출력한다.
		System.out.printf("*************************\n");
	}

}

