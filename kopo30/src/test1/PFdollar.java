package test1;

import java.util.Scanner;

public class PFdollar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double won;
		double exchangeResult;
		double EX_RATE = 1133.4;
		int usd;
		double changeWon;
		int changeWonResult;
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1;
		int usdCurrent;
		int wonCurrent;
		int won1000, won500, won100, won50, won10;
		System.out.print("받은 원화 입력 : ");
		won = scan.nextDouble();
		exchangeResult = won / EX_RATE;
		usd = (int)exchangeResult;
		System.out.println("달러로 환전 결과");
		System.out.println("달러 지급 : " + usd + " 달러");
		// 100달러 몇개?
		usdCurrent = usd;
		usd100 = usdCurrent / 100;
		usdCurrent -= 100 * usd100;
		System.out.println("100달러 : " + usd100 + " 장");
		usd50 = usdCurrent / 50;
		usdCurrent -= 50 * usd50;
		System.out.println("50달러 : " + usd50 + " 장");
		usd20 = usdCurrent / 20;
		usdCurrent -= 20 * usd20;
		System.out.println("20달러 : " + usd20 + " 장");
		usd10 = usdCurrent / 10;
		usdCurrent -= 10 * usd10;
		System.out.println("10달러 : " + usd10 + " 장");
		usd5 = usdCurrent / 5;
		usdCurrent -= 5 * usd5;
		System.out.println("5달러 : " + usd5 + " 장");
		usd2 = usdCurrent / 2;
		usdCurrent -= 2 * usd2;
		System.out.println("2달러 : " + usd2 + " 장");
		usd1 = usdCurrent;
		System.out.println("1달러 : " + usd1 + " 장");
		
			
		// 원화 거스름 계산
		changeWon = (won - (usd * EX_RATE)) / 10;
		changeWonResult = (int)changeWon * 10;
		System.out.println("거스름돈 : " + changeWonResult + " 원");
		wonCurrent = changeWonResult;
		won1000 = wonCurrent / 1000;
		wonCurrent -= 1000 * won1000;
		System.out.println("1000원 : " + won1000 + " 장");
		won500 = wonCurrent / 500;
		wonCurrent -= 500 * won500;
		System.out.println("500원 : " + won500 + " 장");
		won100 = wonCurrent / 100;
		wonCurrent -= 100 * won100;
		System.out.println("100원 : " + won100 + " 장");
		won10 = wonCurrent / 10;
		wonCurrent -= 10 * won10;
		System.out.println("10원 : " + won10 + " 장");
		scan.close();
	} 
	
}






