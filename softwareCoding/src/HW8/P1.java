package HW8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		try {//try catch 구문은 실행할 코드블럭을 표시하고 예외가 발생할 경우의 응답을 지정한다.
			File k30_f = new File("d:\\Mytest.txt");//기존의 파일이나 폴더에 대한 제어를 하기 위해서 java.io 패키지의 File 클래스를 생성한다.
			//파일을 나타내는 객체를 생성하려면 File 클래스의 생성자 함수를 이용한다.
			FileWriter k30_fw = new FileWriter(k30_f);//파일을 작성하기 위해서 java.io 패키지의 FileWriter 클래스를 생성한다.
			//파일을 나타내는 객체를 생성하려면 FileWriter 클래스의 생성자 함수를 이용한다.
			
			k30_fw.write("안녕 파일 \n");//파일에 안녕 파일과 줄바꿈을 작성한다.
			k30_fw.write("hello 헬로 \n");//파일에 hello 헬로와 줄바꿈을 작성한다.
			
			k30_fw.close();//k30_fw 파일을 닫는다. 열어두면 다른 프로그램이 작업할 수 없다.
			
			FileReader k30_fr = new FileReader(k30_f);//파일을 읽어 오기 위해서 java.io 패키지의 FileReader 클래스를 생성한다.
			//파일을 나타내는 객체를 생성하려면 FileReader 클래스의 생성자 함수를 이용한다.
			
			int k30_n = -1;// 숫자형 변수 k30_n을 정의하고 값을 -1로 초기화한다.
			char [] k30_ch;// 문자형 배열 k30_ch를 정의한다.
			
			while (true) {//while 반복문의 조건을 true로 설정하여 무한으로 반복되도록 한다.
				k30_ch = new char[100];//변수 k30_ch에 100크기의 배열을 생성한다.
				k30_n = k30_fr.read(k30_ch);//변수 k30_ch에 100크기 만큼 저장된 내용을 FileReader로 읽어와서 변수 k30_n에 저장한다.
				
				if(k30_n == -1) break;//만약 k30_n이 -1이라면 break문을 수행한다.(-1이 나왔다는 것은 더이상 불러올 내용이 없다는 것을 뜻한다)
				
				for(int k30_i = 0; k30_i < k30_n; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_n보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
					System.out.printf("%c", k30_ch[k30_i]);//변수 k30_ch의 k30_i 인덱스를 출력한다.
				}
			}
			k30_fr.close();//k30_fr 파일을 닫는다.
			
			System.out.println("\n FILE READ END ");//줄바꿈과 FILE READ END를 화면에 출력한다.
		} catch(Exception k30_e) {//catch 블록은 try블록 안에서 예외가 발생하는 경우 무엇을 할지 명시하는 코드를 포함한다.
			System.out.printf("나 에러[%s]\n", k30_e);
		}
	}

}
