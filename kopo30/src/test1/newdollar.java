package test1;

import java.util.Scanner;

public class newdollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double won;
		double exchangeResult;
		double dEX_RATE = 1133.4;
		double eEX_RATE = 1348.15;
		double jEX_RATE = 10.3505;
		double cEX_RATE = 174.09;
		int usd;
		int eur;
		int jpy;
		int cny;
		double m;
		double changeMoney;
		int changeWon = 0;
		int type;
		double jpyex;
		int ijpy;
		
		System.out.print("받은 원화 입력 : ");
		won = scanner.nextDouble();
		System.out.print("달러 : 1\n유로 : 2\n엔화 : 3\n위완 : 4\n환전할 종류 선택 : ");
		type = scanner.nextInt();
		
		if (type == 1) {
		exchangeResult = won / dEX_RATE;
		usd = (int)exchangeResult;
		System.out.println("\n달러 지급 : " + usd + " 달러");
		System.out.println("100 달러 : " + usd / 100 + " 개");
		System.out.println("50 달러 : " + usd % 100 / 50 + " 개");
		System.out.println("20 달러 : " + usd % 100 % 50 / 20 + " 개");
		System.out.println("10 달러 : " + usd % 100 % 50 % 20 / 10 + " 개");
		System.out.println("5 달러 : " + usd % 100 % 50 % 20 % 10 / 5 + " 개");
		System.out.println("2 달러 : " + usd % 100 % 50 % 20 % 10 % 5 / 2 + " 개");
		System.out.println("1 달러 : " + usd % 100 % 50 % 20 % 10 % 5 % 2 + " 개");
		
		m = exchangeResult - usd;
		changeMoney = (m * dEX_RATE) / 10;
		changeWon = ((int)(changeMoney) * 10);
		
		} else if (type == 2) {
			exchangeResult = won / eEX_RATE;
			eur = (int)exchangeResult;
			System.out.println("\n유로 지급 : " + eur + " 유로");
			System.out.println("500 유로 : " + eur / 500 + " 개");
			System.out.println("200 유로 : " + eur % 500 / 200 + " 개");
			System.out.println("100 유로 : " + eur % 500 % 200 / 100 + " 개");
			System.out.println("50 유로 : " + eur % 500 % 200 % 100 / 50 + " 개");
			System.out.println("20 유로 : " + eur % 500 % 200 % 100 % 50 / 20 + " 개");
			System.out.println("10 유로 : " + eur % 500 % 200 % 100 % 50 % 20 / 10 + " 개");
			System.out.println("5 유로 : " + eur % 500 % 200 % 100 % 50 % 20 % 10 / 5 + " 개");
			System.out.println("2 유로 : " + eur % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " 개");
			System.out.println("1 유로 : " + eur % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2 + " 개");
			
			m = exchangeResult - eur;
			changeMoney = (m * eEX_RATE) / 10;
			changeWon = ((int)(changeMoney) * 10);
			
		} else if (type == 3) {
			exchangeResult = won / jEX_RATE;
			jpyex = exchangeResult / 1000;
			ijpy = (int)(jpyex);
			jpy = ((int)ijpy * 1000);
			System.out.println("\n엔 지급 : " + jpy + " 엔");
			System.out.println("10000 엔 : " + jpy / 10000 + " 개");
			System.out.println("5000 엔 : " + jpy % 10000 / 5000 + " 개");
			System.out.println("1000 엔 : " + jpy % 10000 % 5000 / 1000 + " 개");

			m = jpyex - ijpy;
			m = m * 1000;
			changeMoney = (m * jEX_RATE) / 10;
			changeWon = ((int)(changeMoney) * 10);
			
		} else if (type == 4) {
			exchangeResult = won / cEX_RATE;
			cny = (int)exchangeResult;

			System.out.println("\n위안 지급 : " + cny + " 위안");
			System.out.println("100 위안 : " + cny / 100 + " 개");
			System.out.println("50 위안 : " + cny % 100 / 50 + " 개");
			System.out.println("10 위안 : " + cny % 100 % 50 / 10 + " 개");
			System.out.println("5 위안 : " + cny % 100 % 50 % 10 / 5 + " 개");
			System.out.println("1 위안 : " + cny % 100 % 50 % 10 % 5 + " 개");

			m = exchangeResult - cny;
			changeMoney = (m * cEX_RATE) / 10;
			changeWon = ((int)(changeMoney) * 10);

		}
		
		System.out.println("\n원화 거스름 : " + changeWon + " 원");
		System.out.println("1000원 : " + changeWon / 1000 +" 개");
		System.out.println("500원 : " + changeWon % 1000 / 500 +" 개");
		System.out.println("100원 : " + changeWon % 1000 % 500 / 100 +" 개");
		System.out.println("50원 : " + changeWon % 1000 % 500 % 100 / 50 +" 개");
		System.out.println("10원 : " + changeWon % 1000 % 500 % 100 % 50 / 10 +" 개");
	}

}
