package HW8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P5 {//클래스 선언

	public static void main(String[] args) throws IOException {//메인으로부터 프로그램시작, 예외가 발생하면 해당 클래스에서 벗어나게 된다.
		// TODO Auto-generated method stub
		File k30_f = new File("d:\\day_data\\THTSKS010H00.dat");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
		//d드라이브의 주식정보데이터dat파일을 읽어온다.
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader에 FileReader한 내용인 주식정보데이터를 집어넣어서 Buffer처리를 하였다.
		
		int k30_LineCnt = 0;//숫자형 데이터 k30_LineCnt를 정의하고 값을 0으로 초기화한다.
		int k30_n = -1;//숫자형 데이터 k30_n를 정의하고 값을 -1으로 초기화한다.
		StringBuffer k30_s = new StringBuffer();// Buffer처리를 한 변수 k30_s를 정의한다.
		while (true) {//while 반복문의 조건을 true로 설정하여 무한으로 반복문이 수행되도록 한다.
			char[] k30_ch = new char[1000];//변수 k30_ch에 1000크기의 배열을 생성한다.
			
			k30_n = k30_br.read(k30_ch);//변수 k30_ch에 1000크기 만큼 저장된 내용을 FileReader로 읽어와서 변수 k30_n에 저장한다.
			
			if(k30_n == -1) break;//만약 k30_n이 -1이라면 break문을 수행한다.(-1이 나왔다는 것은 더이상 불러올 내용이 없다는 것을 뜻한다)
			
			for (char k30_c : k30_ch) {//k30_ch파일을 다시 character로 변환하여 k30_s에 저장한다.
				if (k30_c == '\n') {//만약 k30_c가 \n줄바꿈이라면  
					System.out.printf("[%s]***\n", k30_s.toString());//k30_s를 문자열로 형변환하고 줄바꿈을 화면에 출력한다.
				} else {//k30_c가 줄바꿈이 아니라면
					k30_s.append(k30_c);// 변수 k30_s에 k30_c를 추가한다.
				}
			}
			
			k30_LineCnt++;// 반복문이 한번 수행될때마다 변수 k30_LineCnt를 1씩 증가시킨다.
		}
		System.out.printf("[%s]***\n", k30_s.toString());//반복문이 끝나면 변수 k30_s를 문자열로 형변환하고 화면에 출력한다.
		k30_br.close();//k30_br bufferedReader 파일을 닫는다.
	}

}
