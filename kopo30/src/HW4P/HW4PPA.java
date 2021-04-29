package HW4P;

public class HW4PPA {
	// main 함수의 void는 return의 값이 비어있음. void 대신 int를 쓰면 return 값을 지정해야 한다.
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