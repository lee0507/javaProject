package HW4;

public class readNumber {//Ŭ���� ����

   public static void main(String[] args) {//�������κ��� ���α׷�����
      // TODO Auto-generated method stub
      int k30_iNumVal = 1001034567;// ������ ���� k30_iNumVal�� �����ϰ� ���� 100103456���� �ʱ�ȭ�Ѵ�.
      String k30_sNumVal = String.valueOf(k30_iNumVal);// ���ڿ��� ���� k30_sNumVal�� �����ϰ� ���� ���ڿ��� ����ȯ�� k30_iNumVal���� �ʱ�ȭ�Ѵ�.
      String k30_sNumVoice = "";//���ڿ��� ���� k30_sNumVoice�� �����ϰ� ""�� ���� �ʱ�ȭ�Ѵ�.
      System.out.printf("==> %s [%d�ڸ�]\n", k30_sNumVal, k30_sNumVal.length());// %s�� ���� ���ڿ��� k30_sNumVal ���� %d�� ���� k30_sNumVal�� ���̸� ȭ�鿡 ����Ѵ�.
      
      int k30_i, k30_j;//������ ���� k30_i�� k30_j�� �����Ѵ�.
      
      String [] k30_units = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};//���ڿ��� �迭 k30_units�� �����ϰ� ���� ������� �����Ѵ�.
      String [] k30_unitX = {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"};//���ڿ��� �迭 k30_unitX�� �����ϰ� ���� ������� �����Ѵ�.
      
      k30_i = 0;//���� k30_i�� ���� 0���� �ʱ�ȭ�Ѵ�.
      k30_j = k30_sNumVal.length() - 1;//���� k30_j�� ���� k30_sNumVal�� ���� - 1 �� �ʱ�ȭ�Ѵ�.
      
      while (true) {//while �ݺ����� ������ k30_i >=0���� �����Ͽ� k30_i�� 0�� ���ų� ũ�ٸ� �ݺ����� ����ǵ��� �Ѵ�.
         if(k30_i >= k30_sNumVal.length()) break;// ���� k30_i�� k30_sNumVal�� ���̿� ���ų� ũ�ٸ� break���� �����Ѵ�.
         
         System.out.printf("%s[%s]",// %s�� ���� ���ڿ��� k30_sNumVal ���� %d�� ���� k30_sNumVal�� ���̸� ȭ�鿡 ����Ѵ�.
               k30_sNumVal.substring(k30_i, k30_i + 1),//k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ���.
               k30_units[Integer.parseInt(k30_sNumVal.substring(k30_i, k30_i + 1))]);//k30_units�� [���������� ����ȯ�� (k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ��)�� �ε���]�� ����Ѵ�.
         
         if(k30_sNumVal.substring(k30_i, k30_i + 1).equals("0")) {//���� k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 0�� ���ٸ�
            if(k30_unitX[k30_j].equals("��") || k30_unitX[k30_j].equals("��")) {//���� k30_unitX�� [k30_j]�ε��� ���� ���̰ų� k30_unitX�� [k30_j]�ε��� ���� ���̸�
               k30_sNumVoice = k30_sNumVoice + k30_unitX[k30_j];//k30_sNumVoice���� k30_unitX[k30_j]�ε��� ���� �����Ѵ�. (k30_sNumVoice += k30_unitX[k30_j]�� �ٲ㼭 �ۼ��� �� �ִ�)
            } else {//���� if������ �������� �ʴ´ٸ�
               //�ƹ��͵� �����ʴ´�.
            }
         } else if (k30_sNumVal.substring(k30_i, k30_i + 1).equals("1") && k30_j > 5) {//�߰��� �κ����� //���� k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 1�� ���ų�
            k30_sNumVoice = k30_sNumVoice + k30_unitX[k30_j];// k30_j�� 5���� ũ�ٸ� k30_sNumVoice���� k30_unitX[k30_j]�ε��� ���� �����Ѵ�. 
            //(k30_sNumVoice += k30_unitX[k30_j]�� �ٲ㼭 �ۼ��� �� �ִ�)
            
         } else {//���� k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 0�� ���� �ʴٸ�
            k30_sNumVoice = k30_sNumVoice//k30_sNumVoice�� ���� 
                  + k30_units[Integer.parseInt(k30_sNumVal.substring(k30_i, k30_i + 1))]//k30_units�� ���������� ����ȯ�� (k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ��)�� �ε���]�� ���� ���ϰ�
                  + k30_unitX[k30_j];//k30_unitX[k30_j]�� ���� ���Ѵ�.
         }
         k30_i++;//k30_i�� ���� 1 ������Ų��.
         k30_j--;//k30_j�� ���� 1 ���ҽ�Ų��.
      }
      System.out.printf("\n %s[%s]\n", k30_sNumVal, k30_sNumVoice);//���� k30_sNumVal�� k30_sNumVoice�� ���� ȭ�鿡 ����Ѵ�.
   }
}	
