package HW9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class scoreJsonPasing {//Ŭ���� ����

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {//�������κ��� ���α׷�����
		//���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.(try/catch �������� �ξ� ����ϱ� ����.
		//SAXException�� ����� ������ �߻����� ���, IOException�� ���� �м� ������ �߻����� ���
		// TODO Auto-generated method stub
		JSONParser k30_parser = new JSONParser();//JSON�Ľ��� ���� JSONParser ��ü�� ������ش�.
		
		Object k30_obj = k30_parser.parse(new FileReader("d:\\test.json"));//JSONparser�� test.json������ �о�´�.
		
		JSONArray k30_array = (JSONArray)k30_obj;//JSONArray k30_datasArray�� �����ϰ� ���� test.json���Ͽ��� �޾Ƽ� ��ü�� ������ k30_obj�� �ִ´�.
		
		System.out.println("**************************");//*���� ȭ�鿡 ����Ѵ�.
		for(int k30_i = 0; k30_i < k30_array.size(); k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� k30_array�� ũ�⺸�� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			JSONObject k30_result = (JSONObject) k30_array.get(k30_i);//JSONObject k30_result�� �����ϰ� ���� k30_array�� k30_i��°�� �ִ´�.
			System.out.println("�̸� : " + k30_result.get("name"));//k30_result�� �������̸��� name�� ���� ȭ�鿡 ����Ѵ�.
			System.out.println("�й� : " + k30_result.get("studentid"));//k30_result�� �������̸��� student�� ���� ȭ�鿡 ����Ѵ�.
			
			JSONArray k30_score = (JSONArray) k30_result.get("score");//k30_score�� k30_result���� ������ �������̸��� score�� ���� �ִ´�.
			long k30_kor = (long)k30_score.get(0);//score�� Ű���� ���⶧���� �ε�����ȣ0������ ��ó���� �ִ� ���� ���� �����´�.
			long k30_eng = (long)k30_score.get(1);//score�� Ű���� ���⶧���� �ε�����ȣ1������ �ι�° �ִ� ���� ���� �����´�.
			long k30_mat = (long)k30_score.get(2);//score�� Ű���� ���⶧���� �ε�����ȣ2������ ����° �ִ� ���� ���� �����´�.
			System.out.println("���� : " + k30_kor);//���� k30_kor�� ȭ�鿡 ����Ѵ�.
			System.out.println("���� : " + k30_eng);//���� k30_eng�� ȭ�鿡 ����Ѵ�.
			System.out.println("���� : " + k30_mat);//���� k30_mat�� ȭ�鿡 ����Ѵ�.
			System.out.println("���� : " + (k30_kor + k30_eng + k30_mat));//���� k30_kor + k30_eng + k30_mat�� ȭ�鿡 ����Ѵ�.
			System.out.println("��� : " + (k30_kor + k30_eng + k30_mat) / 3.0);//��� (k30_kor + k30_eng + k30_mat) / 3�� ȭ�鿡 ����Ѵ�.
			System.out.println("**************************");//*���� ȭ�鿡 ����Ѵ�.
			
		}
	}

}
