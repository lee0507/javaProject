package HW8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7_1 {//클래스 선언

	public static void main(String[] args) throws IOException {//메인으로부터 프로그램시작, 예외가 발생하면 해당 클래스에서 벗어나게 된다.
		// TODO Auto-generated method stub
		File k30_f = new File("d:\\day_data\\StockDailyPrice.csv");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
		//아까 만들어놓은 d드라이브의 주식정보데이터csv파일을 읽어온다.
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader에 FileReader한 내용인 주식정보데이터를 집어넣어서 Buffer처리를 하였다.
		
		File k30_f1 = new File("d:\\\\day_data\\\\StockA005930.csv");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
		//새로운 StockDailyPrice20150112.csv파일을 만든다.
		BufferedWriter k30_bw = new BufferedWriter(new FileWriter(k30_f1));//BufferedWriter에 FileWriter한 것을 집어넣어서 Buffer처리를 하였다.
		
		int k30_cnt = 0;//숫자형 데이터 k30_cnt를 정의하고 값을 0으로 초기화한다.
		int k30_wcnt = 0;//숫자형 데이터 k30_wcnt를 정의하고 값을 0으로 초기화한다.
		String k30_readtxt;//문자열형 변수 k30_readtxt을 정의한다.

		long start = System.currentTimeMillis();//시작하는 현재 시간을 받아온다.
		
		while ((k30_readtxt = k30_br.readLine()) != null) {//while 반복문의 조건을 (k30_readtxt = k30_br.readLine()) != null로 설정하여 읽어올 것이 없을때까지 계속해서 반복한다.
			StringBuffer k30_s = new StringBuffer();// Buffer처리를 한 변수 k30_s를 정의한다.
			String[] k30_field = k30_readtxt.split(",");//받아온 k30_readtxt를 , comma 기준으로 분리해서 문자열 배열 k30_field에 값을 저장한다.
			
			if(k30_field.length > 2 && k30_field[2].equals("A005930")) {//만약에 필드의 길이가 2보다 크고 field[2]의 문자가 A005930이라면
				k30_s.append(k30_field[0]);//k30_s에 field[0]의 값을 저장한다.
				for (int j = 1; j < k30_field.length; j++) {//for반복문을 k30_j는 1부터 k30_j가 field의 길이보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
					k30_s.append("," + k30_field[j]);//k30_s에 ,와 field[j]의 값을 저장한다.
				}
				k30_bw.write(k30_s.toString());//변수 k30_s를 문자열로 형변환하고 k30_bw에 작성한다.
				k30_bw.newLine();//줄바꿈을 작성한다.
				k30_wcnt++;// 반복문이 한번 수행될때마다 변수 k30_wcnt를 1씩 증가시킨다.
			}
			k30_cnt++;// 반복문이 한번 수행될때마다 변수 k30_cnt를 1씩 증가시킨다.
		}
		
		k30_br.close();//k30_br bufferedReader 파일을 닫는다.
		k30_bw.close();//k30_bw bufferedWriter 파일을 닫는다.
		
		long end = System.currentTimeMillis();//끝나는 현재 시간을 받아온다.
		System.out.println("실행시간 : " + (end - start) / 1000.0 + "초");//끝나는 시간에서 시작한 시간을 빼서 실행에 걸린 시간을 계산한다.(1 / 1000초 값을 리턴한다.)
		System.out.printf("Program End[%d][%d]records\n", k30_cnt, k30_wcnt);//변수 k30_cnt와 k30_wcnt를 화면에 출력한다.

		}

}

