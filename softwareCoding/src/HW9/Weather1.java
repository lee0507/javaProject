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

public class Weather1 {//클래스 선언

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {//메인으로부터 프로그램시작
		//예외가 발생하면 해당 클래스에서 벗어나게 된다.(try/catch 구문보다 훨씬 사용하기 쉽다.
		//SAXException은 입출력 에러가 발생했을 경우, IOException은 구문 분석 에러가 발생했을 경우
		// TODO Auto-generated method stub
		String k30_seq = "";//문자열형 변수 k30_seq를 정의하고 빈값으로 초기화한다.
		String k30_hour = "";//문자열형 변수 k30_hour를 정의하고 빈값으로 초기화한다.
		String k30_day = "";//문자열형 변수 k30_day를 정의하고 빈값으로 초기화한다.
		String k30_temp = "";//문자열형 변수 k30_temp를 정의하고 빈값으로 초기화한다.
		String k30_tmx = "";//문자열형 변수 k30_tmx를 정의하고 빈값으로 초기화한다.
		String k30_tmn = "";//문자열형 변수 k30_tmn를 정의하고 빈값으로 초기화한다.
		String k30_sky = "";//문자열형 변수 k30_sky를 정의하고 빈값으로 초기화한다.
		String k30_pty = "";//문자열형 변수 k30_pty를 정의하고 빈값으로 초기화한다.
		String k30_wfKor = "";//문자열형 변수 k30_wfKor를 정의하고 빈값으로 초기화한다.
		String k30_wfEn = "";//문자열형 변수 k30_wf를 정의하고 빈값으로 초기화한다.
		String k30_pop = "";//문자열형 변수 k30_pop를 정의하고 빈값으로 초기화한다.
		String k30_r12 = "";//문자열형 변수 k30_r12를 정의하고 빈값으로 초기화한다.
		String k30_s12 = "";//문자열형 변수 k30_s12를 정의하고 빈값으로 초기화한다.
		String k30_ws = "";//문자열형 변수 k30_ws를 정의하고 빈값으로 초기화한다.
		String k30_wd = "";//문자열형 변수 k30_wd를 정의하고 빈값으로 초기화한다.
		String k30_wdKor = "";//문자열형 변수 k30_wdKor를 정의하고 빈값으로 초기화한다.
		String k30_wdEn = "";//문자열형 변수 k30_wdEn를 정의하고 빈값으로 초기화한다.
		String k30_reh = "";//문자열형 변수 k30_reh를 정의하고 빈값으로 초기화한다.
		String k30_r06 = "";//문자열형 변수 k30_r06를 정의하고 빈값으로 초기화한다.
		String k30_s06 = "";//문자열형 변수 k30_s06를 정의하고 빈값으로 초기화한다.
		
		DocumentBuilder k30_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//XML 문서로부터 DocumentBuilder 인스턴스를 얻는 API를 정의하고 이 클래스를 사용하고, 
		//이 클래스의 인스턴스는 DocumentBuilderFactory.newDocumentBuilder()메서드로 취득 가능하다.
		
		Document k30_doc = k30_docBuilder.parse(new File("d:\\aaa.xml"));//파일의 내용을 XML문서를 구문 분석하여, 새로운 DOM 객체를 리턴한다. 
		
		Element k30_root = k30_doc.getDocumentElement();//root를 기준으로 하나의 요소를 가져다가 사용한다.
		NodeList k30_tag_001 = k30_doc.getElementsByTagName("data");//data이라는 태그명을 가지고 있는 모든 요소를 노드리스트 형태로 가져오는 함수이다.
		
		for(int k30_i = 0; k30_i < k30_tag_001.getLength(); k30_i++) {//data라는 태그명이 여러개가 있는데 k30_seq처럼 앞에 tag_001.item을 하나씩 치기보다는
			Element k30_elmt = (Element)k30_tag_001.item(k30_i);// k30_tag_001이라는 요소의 i번째 item을 k30_elmt요소에 하나씩 추가한다.
			
			k30_seq = k30_tag_001.item(k30_i).getAttributes().getNamedItem("seq").getNodeValue();//name이라는 태그명의 i번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_hour = k30_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();//hour이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_day = k30_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();//day이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_temp = k30_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();//temp이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_tmx = k30_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();//tmx이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_tmn = k30_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();//tmn이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_sky = k30_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();//sky이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_pty = k30_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();//pty이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_wfKor = k30_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();//wfKor이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_wfEn = k30_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();//wfEn이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_pop = k30_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();//pop이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_r12 = k30_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();//r12이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_s12 = k30_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();//s12이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_ws = k30_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();//ws이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_wd = k30_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();//wd이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_wdKor = k30_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();//wdKor이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_wdEn = k30_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();//wdEn이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_reh = k30_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();//reh이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_r06 = k30_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();//r06이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			k30_s06 = k30_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();//s06이라는 태그명의 0번째 item의 첫번째 자식노드의 값을 가져온다.
			System.out.printf("**********************************\n");//*선과 줄바꿈을 화면에 출력한다.
			System.out.printf("48시간중 %s번째 \n", k30_seq);//변수 k30_seq를 화면에 출력한다.
			
			if (k30_day.equals("0")) {//k30_day 변수가 0이라면 오늘, 1이라면 내일, 2라면 모레를 출력하고 변수 k30_hour 시간도 같이 출력한다.
				System.out.println("오늘 " + k30_hour + "시");
			} else if (k30_day.equals("1")) {
				System.out.println("내일 " + k30_hour + "시");
			} else {
				System.out.println("모레 " + k30_hour + "시");
			}
			
			System.out.printf("현재온도 : %s\n", k30_temp);//변수 k30_temp를 화면에 출력한다.
			System.out.printf("최고온도 : %s\n", k30_tmx);//변수 k30_tmx를 화면에 출력한다.
			System.out.printf("최저온도 : %s\n", k30_tmn);//변수 k30_tmn를 화면에 출력한다.
			
			if (k30_sky.equals("1")) {//k30_sky 변수가 1이라면 맑음, 2이라면 구름조금, 3이라면 구름많음, 4라면 흐림을 출력한다.
				System.out.println("하늘상태 : 맑음");
			} else if (k30_sky.equals("2")) {
				System.out.println("하늘상태 : 구름조금");
			} else if (k30_sky.equals("3")){
				System.out.println("하늘상태 : 구름많음");
			} else if (k30_sky.equals("4")){
				System.out.println("하늘상태 : 흐림");
			}
			
			if (k30_pty.equals("0")) {//k30_pty 변수가 0이라면 없음, 1이라면 비, 2라면 비/눈, 3이라면 흐림, 4라면 눈을 출력한다.
				System.out.println("비 소 식 : 없음");
			} else if (k30_pty.equals("1")) {
				System.out.println("비");
			} else if (k30_pty.equals("2")){
				System.out.println("비/눈");
			} else if (k30_pty.equals("3")){
				System.out.println("눈/비");
			} else if (k30_pty.equals("4")){
				System.out.println("눈");
			}
			System.out.println("한글날씨 : " + k30_wfKor);//한글날씨 변수 k30_wfKor를 화면에 출력한다.
			System.out.println("영문날씨 : " + k30_wfEn);//영문날씨 변수 k30_wfEn를 화면에 출력한다.
			System.out.println("강수확률 : " + k30_pop);//강수확률 변수 k30_pop를 화면에 출력한다.
			System.out.println("12시간예상강수 : " + k30_r12);//12시간예상강수 변수 k30_r12를 화면에 출력한다.
			System.out.println("12시간예상적설 : " + k30_s12);//12시간예상적설변수 k30_s12를 화면에 출력한다.
			System.out.println("풍속(m/s) : " + k30_ws);//풍속 변수 k30_ws를 화면에 출력한다.
			if (k30_wd.equals("0")) {//k30_wd 변수가 0이라면 북, 1이라면 북동, 2라면 동, 3이라면 남동, 4라면 남, 5라면 남서, 6이라면 서, 7이라면 북서를 출력한다.
				System.out.println("풍향 : 북");
			} else if (k30_wd.equals("1")) {
				System.out.println("풍향 : 북동");
			} else if (k30_wd.equals("2")){
				System.out.println("풍향 : 동");
			} else if (k30_wd.equals("3")){
				System.out.println("풍향 : 남동");
			} else if (k30_wd.equals("4")) {
				System.out.println("풍향 : 남");
			} else if (k30_wd.equals("5")){
				System.out.println("풍향 : 남서");
			} else if (k30_wd.equals("6")){
				System.out.println("풍향 : 서");
			} else if (k30_wd.equals("7")){
				System.out.println("풍향 : 북서");
			}
			System.out.println("한글풍향 : " + k30_wdKor);//한글풍향 변수 k30_wdKor를 화면에 출력한다.
			System.out.println("영문풍향 : " + k30_wdEn);//영문풍향 변수 k30_wdEn를 화면에 출력한다.
			System.out.println("현재습도 : " + k30_reh);//현재습도 변수 k30_reh를 화면에 출력한다.
			System.out.println("6시간예상강수 : " + k30_r06);//6시간예상강수 변수 k30_r06를 화면에 출력한다.
			System.out.println("6시간예상적설 : " + k30_s06);//6시간예상적설 k30_s06를 화면에 출력한다.

		}
		


	}

}
