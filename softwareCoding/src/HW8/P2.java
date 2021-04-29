package HW8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {//클래스 선언

	public static void main(String[] args) throws IOException {//메인으로부터 프로그램시작, 예외가 발생하면 해당 클래스에서 벗어나게 된다.
		FileWrite();//FileWrite 메소드를 실행한다.
		FileRead();//FileRead 메소드를 실행한다.
	}
	
	public static void FileWrite() throws IOException {//FileWrite라는 메소드를 생성한다.
		File k30_f  = new File("d:\\text123.txt");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
		//파일을 나타내는 객체를 생성하려면 File 클래스의 생성자 함수를 이용한다.
		BufferedWriter k30_bw = new BufferedWriter(new FileWriter(k30_f));//BufferedWriter에 FileWriter한 것을 집어넣어서 Buffer처리를 하였다.
		
		k30_bw.write("안녕 파일");//파일에 안녕 파일을 작성한다.
		k30_bw.newLine();//파일에 줄바꿈을 작성한다.
		k30_bw.write("hello 헬로");//파일에 hello 헬로를 작성한다.
		k30_bw.newLine();//파일에 줄바꿈을 작성한다.
		
		k30_bw.close();//k30_bw bufferedWriter 파일을 닫는다.
	}
	
	public static void FileRead() throws IOException {//FileRead라는 메소드를 생성한다.
		File k30_f = new File("d:\\text123.txt");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
		//파일을 나타내는 객체를 생성하려면 File 클래스의 생성자 함수를 이용한다.
		BufferedReader k30_br = new BufferedReader (new FileReader(k30_f));//BufferedReader에 FileReader한 것을 집어넣어서 Buffer처리를 하였다.
		String k30_readtxt;//문자열형 변수 k30_readtxt를 정의한다.
		
		while((k30_readtxt = k30_br.readLine()) != null) {//while 반복문의 조건을 (k30_readtxt = k30_br.readLine()) != null로 설정하여 읽어올 것이 없을때까지 계속해서 반복한다.
			System.out.printf("%s\n", k30_readtxt);// 읽어온 내용인 변수 k30_readtxt를 화면에 출력한다.
		}
		k30_br.close();//k30_br bufferedReader 파일을 닫는다.
	}

}
