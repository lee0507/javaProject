package HW01;

import java.util.Scanner;

public class newdollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double won;
		int type;
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		do {
			won = inputConsole.inputWon();
			type = inputConsole.inputType();


			if (type == ConstValueClass.EX_TYPE_USD) {
				pc.exchangeUSD(won);
				pc.exchange(pc.exchangeUSD(won));
			} else if (type == ConstValueClass.EX_TYPE_EUR) {
				pc.exchangeEUR(won);
				pc.exchange(pc.exchangeEUR(won));
			} else if (type == ConstValueClass.EX_TYPE_JPY) {
				pc.exchangeJPY(won);
				pc.exchange(pc.exchangeJPY(won));
			}

		} while(type != ConstValueClass.EX_TYPE_EXIT);
	}

}
