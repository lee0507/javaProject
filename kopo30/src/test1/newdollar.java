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
		
		System.out.print("���� ��ȭ �Է� : ");
		won = scanner.nextDouble();
		System.out.print("�޷� : 1\n���� : 2\n��ȭ : 3\n���� : 4\nȯ���� ���� ���� : ");
		type = scanner.nextInt();
		
		if (type == 1) {
		exchangeResult = won / dEX_RATE;
		usd = (int)exchangeResult;
		System.out.println("\n�޷� ���� : " + usd + " �޷�");
		System.out.println("100 �޷� : " + usd / 100 + " ��");
		System.out.println("50 �޷� : " + usd % 100 / 50 + " ��");
		System.out.println("20 �޷� : " + usd % 100 % 50 / 20 + " ��");
		System.out.println("10 �޷� : " + usd % 100 % 50 % 20 / 10 + " ��");
		System.out.println("5 �޷� : " + usd % 100 % 50 % 20 % 10 / 5 + " ��");
		System.out.println("2 �޷� : " + usd % 100 % 50 % 20 % 10 % 5 / 2 + " ��");
		System.out.println("1 �޷� : " + usd % 100 % 50 % 20 % 10 % 5 % 2 + " ��");
		
		m = exchangeResult - usd;
		changeMoney = (m * dEX_RATE) / 10;
		changeWon = ((int)(changeMoney) * 10);
		
		} else if (type == 2) {
			exchangeResult = won / eEX_RATE;
			eur = (int)exchangeResult;
			System.out.println("\n���� ���� : " + eur + " ����");
			System.out.println("500 ���� : " + eur / 500 + " ��");
			System.out.println("200 ���� : " + eur % 500 / 200 + " ��");
			System.out.println("100 ���� : " + eur % 500 % 200 / 100 + " ��");
			System.out.println("50 ���� : " + eur % 500 % 200 % 100 / 50 + " ��");
			System.out.println("20 ���� : " + eur % 500 % 200 % 100 % 50 / 20 + " ��");
			System.out.println("10 ���� : " + eur % 500 % 200 % 100 % 50 % 20 / 10 + " ��");
			System.out.println("5 ���� : " + eur % 500 % 200 % 100 % 50 % 20 % 10 / 5 + " ��");
			System.out.println("2 ���� : " + eur % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " ��");
			System.out.println("1 ���� : " + eur % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2 + " ��");
			
			m = exchangeResult - eur;
			changeMoney = (m * eEX_RATE) / 10;
			changeWon = ((int)(changeMoney) * 10);
			
		} else if (type == 3) {
			exchangeResult = won / jEX_RATE;
			jpyex = exchangeResult / 1000;
			ijpy = (int)(jpyex);
			jpy = ((int)ijpy * 1000);
			System.out.println("\n�� ���� : " + jpy + " ��");
			System.out.println("10000 �� : " + jpy / 10000 + " ��");
			System.out.println("5000 �� : " + jpy % 10000 / 5000 + " ��");
			System.out.println("1000 �� : " + jpy % 10000 % 5000 / 1000 + " ��");

			m = jpyex - ijpy;
			m = m * 1000;
			changeMoney = (m * jEX_RATE) / 10;
			changeWon = ((int)(changeMoney) * 10);
			
		} else if (type == 4) {
			exchangeResult = won / cEX_RATE;
			cny = (int)exchangeResult;

			System.out.println("\n���� ���� : " + cny + " ����");
			System.out.println("100 ���� : " + cny / 100 + " ��");
			System.out.println("50 ���� : " + cny % 100 / 50 + " ��");
			System.out.println("10 ���� : " + cny % 100 % 50 / 10 + " ��");
			System.out.println("5 ���� : " + cny % 100 % 50 % 10 / 5 + " ��");
			System.out.println("1 ���� : " + cny % 100 % 50 % 10 % 5 + " ��");

			m = exchangeResult - cny;
			changeMoney = (m * cEX_RATE) / 10;
			changeWon = ((int)(changeMoney) * 10);

		}
		
		System.out.println("\n��ȭ �Ž��� : " + changeWon + " ��");
		System.out.println("1000�� : " + changeWon / 1000 +" ��");
		System.out.println("500�� : " + changeWon % 1000 / 500 +" ��");
		System.out.println("100�� : " + changeWon % 1000 % 500 / 100 +" ��");
		System.out.println("50�� : " + changeWon % 1000 % 500 % 100 / 50 +" ��");
		System.out.println("10�� : " + changeWon % 1000 % 500 % 100 % 50 / 10 +" ��");
	}

}
