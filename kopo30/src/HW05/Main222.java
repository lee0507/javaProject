package HW05;

public class Main222 extends Main333 {
	public static int power = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main222 main = new Main222();
		main.printPower();

	}
	public void printPower() {
		super.printPower();
		System.out.println(power);
	}
}

class Main333 {
	public static int power = 30;
	
	public void printPower() {
		System.out.println(power);
	}
}
