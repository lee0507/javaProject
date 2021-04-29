package HW9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		JSONArray k30_datasArray = new JSONArray();//JSONArray k30_datasArray를 생성한다.
		//아래 만들어 놓은 메소드 oneRec을 통해 return 받은 JSONObject를 JSONArray안에 넣는다.
		k30_datasArray.add(oneRec("정연", 209902,100,85,75));//name은 정연, studentid는 209902, 국어는 100, 수학은 85, 영어는 75값을 입력한다.
		k30_datasArray.add(oneRec("모모", 209903,90,75,85));//name은 모모, studentid는 209903, 국어는 90, 수학은 75, 영어는 85값을 입력한다.
		k30_datasArray.add(oneRec("사나", 209904,90,85,75));//name은 사나, studentid는 209904, 국어는 90, 수학은 85, 영어는 75값을 입력한다.
		k30_datasArray.add(oneRec("지효", 209905,80,75,85));//name은 지효, studentid는 209905, 국어는 80, 수학은 75, 영어는 85값을 입력한다.
		k30_datasArray.add(oneRec("미나", 209906,90,85,55));//name은 미나, studentid는 209906, 국어는 90, 수학은 85, 영어는 55값을 입력한다.
		k30_datasArray.add(oneRec("다연", 209907,70,75,65));//name은 다연, studentid는 209907, 국어는 70, 수학은 75, 영어는 65값을 입력한다.
		k30_datasArray.add(oneRec("채영", 209908,100,75,95));//name은 채영, studentid는 209908, 국어는 100, 수학은 75, 영어는 95값을 입력한다.
		k30_datasArray.add(oneRec("쯔위", 209909,80,75,95));//name은 쯔위, studentid는 209909, 국어는 80, 수학은 75, 영어는 95값을 입력한다.
		k30_datasArray.add(oneRec("나연", 209901,100,85,75));//name은 나연, studentid는 209901, 국어는 100, 수학은 85, 영어는 75값을 입력한다.
		
		try {//try catch 구문은 실행할 코드블럭을 표시하고 예외가 발생할 경우의 응답을 지정한다.
			FileWriter k30_file = new FileWriter("d:\\test.json");//파일을 작성하기 위해서 java.io 패키지의 FileWriter 클래스를 생성한다.
			//파일을 나타내는 객체를 생성하려면 FileWriter 클래스의 생성자 함수를 이용한다.
			k30_file.write(k30_datasArray.toJSONString());//파일에 k30_datasArray를 String으로 형변환하고 작성한다.
			k30_file.flush();//flush는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다. 
			k30_file.close();//k30_file 파일을 닫는다. 열어두면 다른 프로그램이 작업할 수 없다.
		} catch(IOException k30_e) {//catch 블록은 try블록 안에서 예외가 발생하는 경우 무엇을 할지 명시하는 코드를 포함한다.
			k30_e.printStackTrace();//오류내용을 출력한다.
		}
		
	}
	
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {//메소드를 생성하고 파라미터로 name, studentid, kor, eng, mat를 받는다.
		JSONObject k30_dataObject = new JSONObject();//JSONObject k30_dataObject를 생성한다.
		k30_dataObject.put("name", name);//k30_dataObject에 데이터이름을 name, 값은 name을 넣는다.
		k30_dataObject.put("studentid", studentid);//k30_dataObject에 데이터이름을 studentid, 값은 studentid를 넣는다.
		
		JSONArray k30_score = new JSONArray();//JSONArray k30_score를 생성한다.
		k30_score.add(kor);//k30_score에 kor점수를 넣는다.
		k30_score.add(eng);//k30_score에 eng점수를 넣는다.
		k30_score.add(mat);//k30_score에 mat점수를 넣는다.
		k30_dataObject.put("score", k30_score);//k30_dataObject에 데이터이름은 score, 값은 JSONArray인 k30_score를 넣는다.
		
		return k30_dataObject;//리턴값으로 k30_dataObject를 받는다.
	}

}
