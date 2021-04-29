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

public class Weather1 {//Ŭ���� ����

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {//�������κ��� ���α׷�����
		//���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.(try/catch �������� �ξ� ����ϱ� ����.
		//SAXException�� ����� ������ �߻����� ���, IOException�� ���� �м� ������ �߻����� ���
		// TODO Auto-generated method stub
		String k30_seq = "";//���ڿ��� ���� k30_seq�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_hour = "";//���ڿ��� ���� k30_hour�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_day = "";//���ڿ��� ���� k30_day�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_temp = "";//���ڿ��� ���� k30_temp�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_tmx = "";//���ڿ��� ���� k30_tmx�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_tmn = "";//���ڿ��� ���� k30_tmn�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_sky = "";//���ڿ��� ���� k30_sky�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_pty = "";//���ڿ��� ���� k30_pty�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_wfKor = "";//���ڿ��� ���� k30_wfKor�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_wfEn = "";//���ڿ��� ���� k30_wf�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_pop = "";//���ڿ��� ���� k30_pop�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_r12 = "";//���ڿ��� ���� k30_r12�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_s12 = "";//���ڿ��� ���� k30_s12�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_ws = "";//���ڿ��� ���� k30_ws�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_wd = "";//���ڿ��� ���� k30_wd�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_wdKor = "";//���ڿ��� ���� k30_wdKor�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_wdEn = "";//���ڿ��� ���� k30_wdEn�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_reh = "";//���ڿ��� ���� k30_reh�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_r06 = "";//���ڿ��� ���� k30_r06�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		String k30_s06 = "";//���ڿ��� ���� k30_s06�� �����ϰ� ������ �ʱ�ȭ�Ѵ�.
		
		DocumentBuilder k30_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//XML �����κ��� DocumentBuilder �ν��Ͻ��� ��� API�� �����ϰ� �� Ŭ������ ����ϰ�, 
		//�� Ŭ������ �ν��Ͻ��� DocumentBuilderFactory.newDocumentBuilder()�޼���� ��� �����ϴ�.
		
		Document k30_doc = k30_docBuilder.parse(new File("d:\\aaa.xml"));//������ ������ XML������ ���� �м��Ͽ�, ���ο� DOM ��ü�� �����Ѵ�. 
		
		Element k30_root = k30_doc.getDocumentElement();//root�� �������� �ϳ��� ��Ҹ� �����ٰ� ����Ѵ�.
		NodeList k30_tag_001 = k30_doc.getElementsByTagName("data");//data�̶�� �±׸��� ������ �ִ� ��� ��Ҹ� ��帮��Ʈ ���·� �������� �Լ��̴�.
		
		for(int k30_i = 0; k30_i < k30_tag_001.getLength(); k30_i++) {//data��� �±׸��� �������� �ִµ� k30_seqó�� �տ� tag_001.item�� �ϳ��� ġ�⺸�ٴ�
			Element k30_elmt = (Element)k30_tag_001.item(k30_i);// k30_tag_001�̶�� ����� i��° item�� k30_elmt��ҿ� �ϳ��� �߰��Ѵ�.
			
			k30_seq = k30_tag_001.item(k30_i).getAttributes().getNamedItem("seq").getNodeValue();//name�̶�� �±׸��� i��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_hour = k30_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();//hour�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_day = k30_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();//day�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_temp = k30_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();//temp�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_tmx = k30_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();//tmx�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_tmn = k30_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();//tmn�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_sky = k30_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();//sky�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_pty = k30_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();//pty�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_wfKor = k30_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();//wfKor�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_wfEn = k30_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();//wfEn�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_pop = k30_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();//pop�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_r12 = k30_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();//r12�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_s12 = k30_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();//s12�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_ws = k30_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();//ws�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_wd = k30_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();//wd�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_wdKor = k30_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();//wdKor�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_wdEn = k30_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();//wdEn�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_reh = k30_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();//reh�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_r06 = k30_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();//r06�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			k30_s06 = k30_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();//s06�̶�� �±׸��� 0��° item�� ù��° �ڽĳ���� ���� �����´�.
			System.out.printf("**********************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
			System.out.printf("48�ð��� %s��° \n", k30_seq);//���� k30_seq�� ȭ�鿡 ����Ѵ�.
			
			if (k30_day.equals("0")) {//k30_day ������ 0�̶�� ����, 1�̶�� ����, 2��� �𷹸� ����ϰ� ���� k30_hour �ð��� ���� ����Ѵ�.
				System.out.println("���� " + k30_hour + "��");
			} else if (k30_day.equals("1")) {
				System.out.println("���� " + k30_hour + "��");
			} else {
				System.out.println("�� " + k30_hour + "��");
			}
			
			System.out.printf("����µ� : %s\n", k30_temp);//���� k30_temp�� ȭ�鿡 ����Ѵ�.
			System.out.printf("�ְ�µ� : %s\n", k30_tmx);//���� k30_tmx�� ȭ�鿡 ����Ѵ�.
			System.out.printf("�����µ� : %s\n", k30_tmn);//���� k30_tmn�� ȭ�鿡 ����Ѵ�.
			
			if (k30_sky.equals("1")) {//k30_sky ������ 1�̶�� ����, 2�̶�� ��������, 3�̶�� ��������, 4��� �帲�� ����Ѵ�.
				System.out.println("�ϴû��� : ����");
			} else if (k30_sky.equals("2")) {
				System.out.println("�ϴû��� : ��������");
			} else if (k30_sky.equals("3")){
				System.out.println("�ϴû��� : ��������");
			} else if (k30_sky.equals("4")){
				System.out.println("�ϴû��� : �帲");
			}
			
			if (k30_pty.equals("0")) {//k30_pty ������ 0�̶�� ����, 1�̶�� ��, 2��� ��/��, 3�̶�� �帲, 4��� ���� ����Ѵ�.
				System.out.println("�� �� �� : ����");
			} else if (k30_pty.equals("1")) {
				System.out.println("��");
			} else if (k30_pty.equals("2")){
				System.out.println("��/��");
			} else if (k30_pty.equals("3")){
				System.out.println("��/��");
			} else if (k30_pty.equals("4")){
				System.out.println("��");
			}
			System.out.println("�ѱ۳��� : " + k30_wfKor);//�ѱ۳��� ���� k30_wfKor�� ȭ�鿡 ����Ѵ�.
			System.out.println("�������� : " + k30_wfEn);//�������� ���� k30_wfEn�� ȭ�鿡 ����Ѵ�.
			System.out.println("����Ȯ�� : " + k30_pop);//����Ȯ�� ���� k30_pop�� ȭ�鿡 ����Ѵ�.
			System.out.println("12�ð����󰭼� : " + k30_r12);//12�ð����󰭼� ���� k30_r12�� ȭ�鿡 ����Ѵ�.
			System.out.println("12�ð��������� : " + k30_s12);//12�ð������������� k30_s12�� ȭ�鿡 ����Ѵ�.
			System.out.println("ǳ��(m/s) : " + k30_ws);//ǳ�� ���� k30_ws�� ȭ�鿡 ����Ѵ�.
			if (k30_wd.equals("0")) {//k30_wd ������ 0�̶�� ��, 1�̶�� �ϵ�, 2��� ��, 3�̶�� ����, 4��� ��, 5��� ����, 6�̶�� ��, 7�̶�� �ϼ��� ����Ѵ�.
				System.out.println("ǳ�� : ��");
			} else if (k30_wd.equals("1")) {
				System.out.println("ǳ�� : �ϵ�");
			} else if (k30_wd.equals("2")){
				System.out.println("ǳ�� : ��");
			} else if (k30_wd.equals("3")){
				System.out.println("ǳ�� : ����");
			} else if (k30_wd.equals("4")) {
				System.out.println("ǳ�� : ��");
			} else if (k30_wd.equals("5")){
				System.out.println("ǳ�� : ����");
			} else if (k30_wd.equals("6")){
				System.out.println("ǳ�� : ��");
			} else if (k30_wd.equals("7")){
				System.out.println("ǳ�� : �ϼ�");
			}
			System.out.println("�ѱ�ǳ�� : " + k30_wdKor);//�ѱ�ǳ�� ���� k30_wdKor�� ȭ�鿡 ����Ѵ�.
			System.out.println("����ǳ�� : " + k30_wdEn);//����ǳ�� ���� k30_wdEn�� ȭ�鿡 ����Ѵ�.
			System.out.println("������� : " + k30_reh);//������� ���� k30_reh�� ȭ�鿡 ����Ѵ�.
			System.out.println("6�ð����󰭼� : " + k30_r06);//6�ð����󰭼� ���� k30_r06�� ȭ�鿡 ����Ѵ�.
			System.out.println("6�ð��������� : " + k30_s06);//6�ð��������� k30_s06�� ȭ�鿡 ����Ѵ�.

		}
		


	}

}
