package HW05;

public class Main444 implements InterPrice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main444 m = new Main444();
		m.getPriceA(100);
		m.getPriceB(100);
	}
	
	@Override
	public void getPriceA(int price) {
		System.out.println(price + 100);
	}
	
	@Override
	public void getPriceB(int price) {
		System.out.println(price + 1000);
	}
}

interface InterPrice {
	public void getPriceA(int price);
	public void getPriceB(int price);
}

