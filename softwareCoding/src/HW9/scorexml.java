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

public class scorexml {//Ŭ���� ����

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {//�������κ��� ���α׷�����
		//���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.(try/catch �������� �ξ� ����ϱ� ����.
		//SAXException�� ����� ������ �߻����� ���, IOException�� ���� �м� ������ �߻����� ���
		DocumentBuilder k30_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//XML �����κ��� DocumentBuilder �ν��Ͻ��� ��� API�� �����ϰ� �� Ŭ������ ����ϰ�, 
		//�� Ŭ������ �ν��Ͻ��� DocumentBuilderFactory.newDocumentBuilder()�޼���� ��� �����ϴ�.
		Document k30_doc = k30_docBuilder.parse(new File("d:\\testdata.xml"));
		//������ ������ XML������ ���� �м��Ͽ�, ���ο� DOM ��ü�� �����Ѵ�. 
		
		Element k30_root = k30_doc.getDocumentElement();//root�� �������� �ϳ��� ��Ҹ� �����ٰ� ����Ѵ�.
		
		NodeList k30_tag_name = k30_doc.getElementsByTagName("name");//name�̶�� �±׸��� ������ �ִ� ��� ��Ҹ� ��帮��Ʈ ���·� �������� �Լ��̴�.
		NodeList k30_tag_studentid = k30_doc.getElementsByTagName("studentid");//studentid�̶�� �±׸��� ������ �ִ� ��� ��Ҹ� ��帮��Ʈ ���·� �������� �Լ��̴�.
		NodeList k30_tag_kor = k30_doc.getElementsByTagName("kor");//kor�̶�� �±׸��� ������ �ִ� ��� ��Ҹ� ��帮��Ʈ ���·� �������� �Լ��̴�.
		NodeList k30_tag_eng = k30_doc.getElementsByTagName("eng");//eng�̶�� �±׸��� ������ �ִ� ��� ��Ҹ� ��帮��Ʈ ���·� �������� �Լ��̴�.
		NodeList k30_tag_mat = k30_doc.getElementsByTagName("mat");//mat�̶�� �±׸��� ������ �ִ� ��� ��Ҹ� ��帮��Ʈ ���·� �������� �Լ��̴�.
		//���� �� �޼ҵ尡 ��ȯ�ϴ� ��� ����Ʈ�� �̿��ϸ� ���ϴ� ��忡 ������ �� �ִ�.
		
		
		System.out.printf("**********************************\n");//���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		
		for(int k30_i = 0; k30_i < k30_tag_name.getLength(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� tag_name�� ���̺��� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf("�̸� : %s\n", k30_tag_name.item(k30_i).getFirstChild().getNodeValue());//name�̶�� �±׸��� i��° item�� ù��° �ڽĳ���� ���� �����´�.
			System.out.printf("�й� : %s\n", k30_tag_studentid.item(k30_i).getFirstChild().getNodeValue());//studentid�̶�� �±׸��� i��° item�� ù��° �ڽĳ���� ���� �����´�.
			System.out.printf("���� : %s\n", k30_tag_kor.item(k30_i).getFirstChild().getNodeValue());//kor�̶�� �±׸��� i��° item�� ù��° �ڽĳ���� ���� �����´�.
			System.out.printf("���� : %s\n", k30_tag_eng.item(k30_i).getFirstChild().getNodeValue());//eng�̶�� �±׸��� i��° item�� ù��° �ڽĳ���� ���� �����´�.
			System.out.printf("���� : %s\n", k30_tag_mat.item(k30_i).getFirstChild().getNodeValue());//mat�̶�� �±׸��� i��° item�� ù��° �ڽĳ���� ���� �����´�.
			System.out.printf("**********************************\n");//���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		}
	}

}
