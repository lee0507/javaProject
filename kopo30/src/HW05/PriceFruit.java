package HW05;

public class PriceFruit {
	int applePrice, StrawberryPrice, GrapePrice, WatermelonPrice;
	
	public PriceFruit(int a, int b, int c, int d) {
		this.applePrice = a;
		this.StrawberryPrice = b;
		this.GrapePrice = c;
		this.WatermelonPrice = d;
	}
	
	public void printMenu() {
		System.out.println("#Price");
		System.out.println("1. Apple");
		System.out.println("2. Strawberry");
		System.out.println("3. Grape");
		System.out.println("4. Watermelon");
		System.out.print("---> ");
	}
	
	public void printPrice(int a) {
		if (a == 1) {
			System.out.println(this.applePrice);
		} else if (a == 2) {
			System.out.println(this.StrawberryPrice);
		} else if (a == 3) {
			System.out.println(this.GrapePrice);
		} else if (a == 4) {
			System.out.println(this.WatermelonPrice);
		} else {
			System.out.println("We don't have no more fruit!");
		}
	}
}

