package HW4P;

public class HW4PME {
	// main �Լ��� void�� return�� ���� �������. void ��� int�� ���� return ���� �����ؾ� �Ѵ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMyMoney1();
		
		HW4PME main = new HW4PME();
		main.showMyMoney2();
		main.showMyMoney3();
		main.showMyMoney4();
		main.showMyMoney5();
	}
	public static void showMyMoney1() {
		System.out.println("1000won");
	}
	public void showMyMoney2() {
		System.out.println("1000won");
	}
	private void showMyMoney3() {
		System.out.println("1000won");
	}
	protected void showMyMoney4() {
		System.out.println("1000won");
	}
	void showMyMoney5() {
		System.out.println("1000won");
	}
}
