package HW9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class scoreJsonPasing {//클래스 선언

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {//메인으로부터 프로그램시작
		//예외가 발생하면 해당 클래스에서 벗어나게 된다.(try/catch 구문보다 훨씬 사용하기 쉽다.
		//SAXException은 입출력 에러가 발생했을 경우, IOException은 구문 분석 에러가 발생했을 경우
		// TODO Auto-generated method stub
		JSONParser k30_parser = new JSONParser();//JSON파싱을 위해 JSONParser 객체를 만들어준다.
		
		Object k30_obj = k30_parser.parse(new FileReader("d:\\test.json"));//JSONparser로 test.json파일을 읽어온다.
		
		JSONArray k30_array = (JSONArray)k30_obj;//JSONArray k30_datasArray를 생성하고 값을 test.json파일에서 받아서 객체에 저장한 k30_obj을 넣는다.
		
		System.out.println("**************************");//*선을 화면에 출력한다.
		for(int k30_i = 0; k30_i < k30_array.size(); k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 k30_array의 크기보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			JSONObject k30_result = (JSONObject) k30_array.get(k30_i);//JSONObject k30_result를 생성하고 값을 k30_array의 k30_i번째를 넣는다.
			System.out.println("이름 : " + k30_result.get("name"));//k30_result에 데이터이름이 name인 값을 화면에 출력한다.
			System.out.println("학번 : " + k30_result.get("studentid"));//k30_result에 데이터이름이 student인 값을 화면에 출력한다.
			
			JSONArray k30_score = (JSONArray) k30_result.get("score");//k30_score에 k30_result에서 가져온 데이터이름이 score인 값을 넣는다.
			long k30_kor = (long)k30_score.get(0);//score는 키값이 없기때문에 인덱스번호0번으로 맨처음에 있는 국어 값을 가져온다.
			long k30_eng = (long)k30_score.get(1);//score는 키값이 없기때문에 인덱스번호1번으로 두번째 있는 국어 값을 가져온다.
			long k30_mat = (long)k30_score.get(2);//score는 키값이 없기때문에 인덱스번호2번으로 세번째 있는 국어 값을 가져온다.
			System.out.println("국어 : " + k30_kor);//변수 k30_kor을 화면에 출력한다.
			System.out.println("영어 : " + k30_eng);//변수 k30_eng을 화면에 출력한다.
			System.out.println("수학 : " + k30_mat);//변수 k30_mat을 화면에 출력한다.
			System.out.println("총점 : " + (k30_kor + k30_eng + k30_mat));//총점 k30_kor + k30_eng + k30_mat를 화면에 출력한다.
			System.out.println("평균 : " + (k30_kor + k30_eng + k30_mat) / 3.0);//평균 (k30_kor + k30_eng + k30_mat) / 3을 화면에 출력한다.
			System.out.println("**************************");//*선을 화면에 출력한다.
			
		}
	}

}
