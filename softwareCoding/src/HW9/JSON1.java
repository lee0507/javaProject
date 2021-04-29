package HW9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		JSONArray k30_datasArray = new JSONArray();//JSONArray k30_datasArray�� �����Ѵ�.
		//�Ʒ� ����� ���� �޼ҵ� oneRec�� ���� return ���� JSONObject�� JSONArray�ȿ� �ִ´�.
		k30_datasArray.add(oneRec("����", 209902,100,85,75));//name�� ����, studentid�� 209902, ����� 100, ������ 85, ����� 75���� �Է��Ѵ�.
		k30_datasArray.add(oneRec("���", 209903,90,75,85));//name�� ���, studentid�� 209903, ����� 90, ������ 75, ����� 85���� �Է��Ѵ�.
		k30_datasArray.add(oneRec("�糪", 209904,90,85,75));//name�� �糪, studentid�� 209904, ����� 90, ������ 85, ����� 75���� �Է��Ѵ�.
		k30_datasArray.add(oneRec("��ȿ", 209905,80,75,85));//name�� ��ȿ, studentid�� 209905, ����� 80, ������ 75, ����� 85���� �Է��Ѵ�.
		k30_datasArray.add(oneRec("�̳�", 209906,90,85,55));//name�� �̳�, studentid�� 209906, ����� 90, ������ 85, ����� 55���� �Է��Ѵ�.
		k30_datasArray.add(oneRec("�ٿ�", 209907,70,75,65));//name�� �ٿ�, studentid�� 209907, ����� 70, ������ 75, ����� 65���� �Է��Ѵ�.
		k30_datasArray.add(oneRec("ä��", 209908,100,75,95));//name�� ä��, studentid�� 209908, ����� 100, ������ 75, ����� 95���� �Է��Ѵ�.
		k30_datasArray.add(oneRec("����", 209909,80,75,95));//name�� ����, studentid�� 209909, ����� 80, ������ 75, ����� 95���� �Է��Ѵ�.
		k30_datasArray.add(oneRec("����", 209901,100,85,75));//name�� ����, studentid�� 209901, ����� 100, ������ 85, ����� 75���� �Է��Ѵ�.
		
		try {//try catch ������ ������ �ڵ���� ǥ���ϰ� ���ܰ� �߻��� ����� ������ �����Ѵ�.
			FileWriter k30_file = new FileWriter("d:\\test.json");//������ �ۼ��ϱ� ���ؼ� java.io ��Ű���� FileWriter Ŭ������ �����Ѵ�.
			//������ ��Ÿ���� ��ü�� �����Ϸ��� FileWriter Ŭ������ ������ �Լ��� �̿��Ѵ�.
			k30_file.write(k30_datasArray.toJSONString());//���Ͽ� k30_datasArray�� String���� ����ȯ�ϰ� �ۼ��Ѵ�.
			k30_file.flush();//flush�� ���� ���ۿ� ����Ǿ� �ִ� ������ Ŭ���̾�Ʈ�� �����ϰ� ���۸� ����. 
			k30_file.close();//k30_file ������ �ݴ´�. ����θ� �ٸ� ���α׷��� �۾��� �� ����.
		} catch(IOException k30_e) {//catch ����� try��� �ȿ��� ���ܰ� �߻��ϴ� ��� ������ ���� ����ϴ� �ڵ带 �����Ѵ�.
			k30_e.printStackTrace();//���������� ����Ѵ�.
		}
		
	}
	
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {//�޼ҵ带 �����ϰ� �Ķ���ͷ� name, studentid, kor, eng, mat�� �޴´�.
		JSONObject k30_dataObject = new JSONObject();//JSONObject k30_dataObject�� �����Ѵ�.
		k30_dataObject.put("name", name);//k30_dataObject�� �������̸��� name, ���� name�� �ִ´�.
		k30_dataObject.put("studentid", studentid);//k30_dataObject�� �������̸��� studentid, ���� studentid�� �ִ´�.
		
		JSONArray k30_score = new JSONArray();//JSONArray k30_score�� �����Ѵ�.
		k30_score.add(kor);//k30_score�� kor������ �ִ´�.
		k30_score.add(eng);//k30_score�� eng������ �ִ´�.
		k30_score.add(mat);//k30_score�� mat������ �ִ´�.
		k30_dataObject.put("score", k30_score);//k30_dataObject�� �������̸��� score, ���� JSONArray�� k30_score�� �ִ´�.
		
		return k30_dataObject;//���ϰ����� k30_dataObject�� �޴´�.
	}

}
