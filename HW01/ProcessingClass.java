package HW01;

public class ProcessingClass {
	OutputClass outClass = null;
	
	ProcessingClass() {
		outClass = new OutputClass();
	}
	
	public int exchangeUSD(double won) {
		int usd;
		double changeMoney;
		int changeWon = 0;
		double exchangeResult;
		exchangeResult = won / ConstValueClass.EX_RATE_USD;
		usd = (int)exchangeResult;
		int usd100, usd50, usd20;
		int usd10, usd5, usd2, usd1;
		
		usd100 = usd / 100;
		usd50 = usd % 100 / 50;
		usd20 = usd % 100 % 50 / 20;
		usd10 = usd % 100 % 50 % 20 / 10;
		usd5 = usd % 100 % 50 % 20 % 10 / 5;
		usd2 = usd % 100 % 50 % 20 % 10 % 5 / 2;
		usd1 = usd % 100 % 50 % 20 % 10 % 5 % 2;
		
		double m = exchangeResult - usd;
		changeMoney = (m * ConstValueClass.EX_RATE_USD) / 10;
		changeWon = ((int)(changeMoney) * 10);
		
		outClass.printExchangeUSD(usd, usd100, usd50, usd20, usd10, usd5, usd2, usd1);
		
		return changeWon;
	}

	public int exchangeEUR(double won) {
		int eur;
		double changeMoney;
		int changeWon = 0;
		double exchangeResult;
		exchangeResult = won / ConstValueClass.EX_RATE_EUR;
		eur = (int)exchangeResult;
		int eur500, eur200, eur100;
		int eur50, eur20, eur10; 
		int eur5, eur2, eur1;
		
		eur500 =  eur / 500;
		eur200 =  eur % 500 / 200;
		eur100 = eur % 500 % 200 / 100;
		eur50 = eur % 500 % 200 % 100 / 50; 
		eur20 = eur % 500 % 200 % 100 % 50 / 20; 
		eur10 =  eur % 500 % 200 % 100 % 50 % 20 / 10;
		eur5 =  eur % 500 % 200 % 100 % 50 % 20 % 10 / 5;
		eur2 =  eur % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2; 
		eur1 = eur % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2;
		
		double m = exchangeResult - eur;
		changeMoney = (m * ConstValueClass.EX_RATE_EUR) / 10;
		changeWon = ((int)(changeMoney) * 10);
		
		outClass.printExchangeEUR(eur, eur500, eur200, eur100, 
						 eur50, eur20, eur10, eur5, eur2, eur1);
		return changeWon;
	}
	
	public int exchangeJPY(double won) {
		int jpy;
		double jpyex;
		int ijpy;
		double changeMoney;
		int changeWon = 0;
		double exchangeResult;
		exchangeResult = won / ConstValueClass.EX_RATE_JPY;
		jpyex = exchangeResult / 1000;
		ijpy = (int)(jpyex);
		jpy = ((int)ijpy * 1000);
		int jpy10000, jpy5000, jpy1000;
		jpy10000 =  jpy / 10000;
		jpy5000 = jpy % 10000 / 5000;
		jpy1000 =  jpy % 10000 % 5000 / 1000;

		double m = jpyex - ijpy;
		m = m * 1000;
		changeMoney = (m * ConstValueClass.EX_RATE_JPY) / 10;
		changeWon = ((int)(changeMoney) * 10);
		
		outClass.printExchangeJPY(jpy, jpy10000, jpy5000, jpy1000);
		return changeWon;
	}
	
	public void exchange(int changeWon) {

		int won1000, won500, won100, won50, won10;
		won1000 = changeWon / 1000;
		won500 = changeWon % 1000 / 500;
		won100 = changeWon % 1000 % 500 / 100;
		won50 = changeWon % 1000 % 500 % 100 / 50;
		won10 = changeWon % 1000 % 500 % 100 % 50 / 10;
		
		outClass.printExchange(changeWon, won1000, won500, won100, won50, won10);
	}
	

}
