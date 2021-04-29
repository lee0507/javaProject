package HW8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P3 {//클래스선언

	public static void main(String[] args) throws IOException {//메인으로부터 프로그램시작, 예외가 발생하면 해당 클래스에서 벗어나게 된다.
		File k30_f = new File("d:\\12_04_07_E_무료와이파이정보.csv");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
		//d드라이브의 무료와이파이csv파일을 읽어온다.
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader에 FileReader한 내용인 무료와이파이정보를 집어넣어서 Buffer처리를 하였다.
		
		String k30_readtxt;//문자열형 변수 k30_readtxt을 정의한다.
		
		if((k30_readtxt = k30_br.readLine()) == null) {//만약에 k30_readtxt파일에 k30_br.readLine이 null값이라면 
			System.out.printf("빈 파일입니다\n");//빈 파일입니다와 줄바꿈을 화면에 출력한다.
		}
		//첫번째 줄을 먼저 읽어야 필드명을 알 수있다.(필드명이 없는 파일일 경우 생략가능하다.)
		String[] k30_field_name = k30_readtxt.split(",");//받아온 k30_readtxt를 , comma 기준으로 분리해서 문자열 배열 k30_field_name에 값을 저장한다.
		
		int k30_LineCnt = 0;//줄 수를 체크하기 위해 숫자형 변수 k30_LineCnt를 생성하고 값을 0으로 초기화한다.
		while ((k30_readtxt = k30_br.readLine()) != null) {//while 반복문의 조건을 (k30_readtxt = k30_br.readLine()) != null로 설정하여 읽어올 것이 없을때까지 계속해서 반복한다.
			
			String[] k30_field = k30_readtxt.split(",");//받아온 k30_readtxt를 , comma 기준으로 분리해서 문자열 배열 k30_field에 값을 저장한다.
			System.out.printf("**[%d번째 항목]***************\n", k30_LineCnt);// 변수 k30_LineCnt를 화면에 출력한다.
			for (int k30_j = 0; k30_j < k30_field_name.length; k30_j++) {//for반복문을 k30_j는 0부터 k30_j가 k30_field_name.length보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf(" %s : %s\n", k30_field_name[k30_j], k30_field[k30_j]);//변수 k30_field_name[k30_j]와 k30_field[k30_j]를 화면에 출력한다.
			}
			System.out.printf("*************************\n");//*선과 줄바꿈을 화면에 출력한다.
			if (k30_LineCnt == 100) break;//백개까지만 출력하기 위해서 만약 k30_LineCnt가 100이라면 break문을 수행한다.
			k30_LineCnt++;// 반복문이 한번 수행될때마다 변수 k30_LineCnt를 1씩 증가시킨다.
		}
		k30_br.close();//k30_br bufferedReader 파일을 닫는다.
	}
}
