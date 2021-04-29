package HW9;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class scorexml {//클래스 선언

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {//메인으로부터 프로그램시작
		//예외가 발생하면 해당 클래스에서 벗어나게 된다.(try/catch 구문보다 훨씬 사용하기 쉽다.
		//SAXException은 입출력 에러가 발생했을 경우, IOException은 구문 분석 에러가 발생했을 경우
		DocumentBuilder k30_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//XML 문서로부터 DocumentBuilder 인스턴스를 얻는 API를 정의하고 이 클래스를 사용하고, 
		//이 클래스의 인스턴스는 DocumentBuilderFactory.newDocumentBuilder()메서드로 취득 가능하다.
		Document k30_doc = k30_docBuilder.parse(new File("d:\\testdata.xml"));
		//파일의 내용을 XML문서를 구문 분석하여, 새로운 DOM 객체를 리턴한다. 
		
		Element k30_root = k30_doc.getDocumentElement();//root를 기준으로 하나의 요소를 가져다가 사용한다.
		
		NodeList k30_tag_name = k30_doc.getElementsByTagName("name");//name이라는 태그명을 가지고 있는 모든 요소를 노드리스트 형태로 가져오는 함수이다.
		NodeList k30_tag_studentid = k30_doc.getElementsByTagName("studentid");//studentid이라는 태그명을 가지고 있는 모든 요소를 노드리스트 형태로 가져오는 함수이다.
		NodeList k30_tag_kor = k30_doc.getElementsByTagName("kor");//kor이라는 태그명을 가지고 있는 모든 요소를 노드리스트 형태로 가져오는 함수이다.
		NodeList k30_tag_eng = k30_doc.getElementsByTagName("eng");//eng이라는 태그명을 가지고 있는 모든 요소를 노드리스트 형태로 가져오는 함수이다.
		NodeList k30_tag_mat = k30_doc.getElementsByTagName("mat");//mat이라는 태그명을 가지고 있는 모든 요소를 노드리스트 형태로 가져오는 함수이다.
		//따라서 이 메소드가 반환하는 노드 리스트를 이용하면 원하는 노드에 접근할 수 있다.
		
		
		System.out.printf("**********************************\n");//선과 줄바꿈을 화면에 출력한다.
		
		for(int k30_i = 0; k30_i < k30_tag_name.getLength(); k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 tag_name의 길이보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf("이름 : %s\n", k30_tag_name.item(k30_i).getFirstChild().getNodeValue());//name이라는 태그명의 i번째 item의 첫번째 자식노드의 값을 가져온다.
			System.out.printf("학번 : %s\n", k30_tag_studentid.item(k30_i).getFirstChild().getNodeValue());//studentid이라는 태그명의 i번째 item의 첫번째 자식노드의 값을 가져온다.
			System.out.printf("국어 : %s\n", k30_tag_kor.item(k30_i).getFirstChild().getNodeValue());//kor이라는 태그명의 i번째 item의 첫번째 자식노드의 값을 가져온다.
			System.out.printf("영어 : %s\n", k30_tag_eng.item(k30_i).getFirstChild().getNodeValue());//eng이라는 태그명의 i번째 item의 첫번째 자식노드의 값을 가져온다.
			System.out.printf("수학 : %s\n", k30_tag_mat.item(k30_i).getFirstChild().getNodeValue());//mat이라는 태그명의 i번째 item의 첫번째 자식노드의 값을 가져온다.
			System.out.printf("**********************************\n");//선과 줄바꿈을 화면에 출력한다.
		}
	}

}
