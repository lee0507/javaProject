package HW01;

public class OutputClass {
	
	public void printExchangeUSD(int usd, int usd100, int usd50, 
			 int usd20, int usd10, int usd5, 
			 int usd2, int usd1) {
		
		System.out.println("\n달러 지급 : " + usd + " 달러");
		System.out.println("100 달러 : " + usd100 + " 개");
		System.out.println("50 달러 : " + usd50 + " 개");
		System.out.println("20 달러 : " + usd20 + " 개");
		System.out.println("10 달러 : " + usd10 + " 개");
		System.out.println("5 달러 : " + usd5 + " 개");
		System.out.println("2 달러 : " + usd2 + " 개");
		System.out.println("1 달러 : " + usd1 + " 개");
	}
	
	public void printExchangeEUR(int eur, int eur500, int eur200, int eur100, 
			 int eur50, int eur20, int eur10, 
			 int eur5, int eur2, int eur1) {
		
		System.out.println("\n유로 지급 : " + eur + " 유로");
		System.out.println("500 유로 : " + eur500 + " 개");
		System.out.println("200 유로 : " + eur200 + " 개");
		System.out.println("100 유로 : " + eur100 + " 개");
		System.out.println("50 유로 : " + eur50 + " 개");
		System.out.println("20 유로 : " + eur20 + " 개");
		System.out.println("10 유로 : " + eur10 + " 개");
		System.out.println("5 유로 : " + eur5 + " 개");
		System.out.println("2 유로 : " + eur2+ " 개");
		System.out.println("1 유로 : " + eur1 + " 개");
	}
	
	public void printExchangeJPY(int jpy, int jpy10000, int jpy5000, int jpy1000) {
		System.out.println("\n엔 지급 : " + jpy + " 엔");
		System.out.println("10000 엔 : " + jpy10000 + " 개");
		System.out.println("5000 엔 : " + jpy5000 + " 개");
		System.out.println("1000 엔 : " + jpy1000 + " 개");
	}
	
	public void printExchange(int changeWon, int won1000, int won500,
			  int won100, int won50, int won10) {

		System.out.println("\n원화 거스름 : " + changeWon + " 원");
		System.out.println("1000원 : " + won1000 +" 개");
		System.out.println("500원 : " + won500 +" 개");
		System.out.println("100원 : " + won100 +" 개");
		System.out.println("50원 : " + won50 +" 개");
		System.out.println("10원 : " + won10 +" 개");
		System.out.println();
	}
	
}
