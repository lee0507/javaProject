package HW4P;

public class HW4PPA {
	// main �Լ��� void�� return�� ���� �������. void ��� int�� ���� return ���� �����ؾ� �Ѵ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HW4PPA main = new HW4PPA();
		main.print("abc", 5, 3);
		main.print("fdasdfas");
	}
		
		void print(String text, int number, int number2) {
			for (int i = 0; i < Math.abs(number - number2); i++) {
				System.out.println(text);
			}
		}
		void print(String text) {
			System.out.println(text);
		}
	}