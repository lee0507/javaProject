package HW05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PrintClass1.printInteger(5);
		PrintClass1.printAdd(5,3);
		
		
		Scanner scanner = new Scanner(System.in);
//
//		PriceFruit pf = new PriceFruit(1000, 2000, 3000, 4000);
//		pf.printMenu();
//		int a = scanner.nextInt();
//		pf.printPrice(a);
		
//		Character a = new Character("A", 200, 30.5, 32.1);
//		Character b = new Character("B", 123, 47.1, 18.9);
//		Character c = new Character("C", 765, 21.6, 42.3);
//		Character d = new Character("D");
//		Character e = new Character("E", 1213);
//		System.out.println(a.printCharacter());
//		System.out.println(b.printCharacter());
//		System.out.println(c.printCharacter());
//		System.out.println(d.printCharacter());
//		System.out.println(e.printCharacter());
//		c.setAge(123);
//		System.out.println(c.getAge());
		
	}
}

class PrintClass1 {
 int a, b, n;
 
 	public PrintClass1(int a, int b, int n) {
 		this.a = a;
 		this.b = b;
 		this.n = n;
 	}
 	
 	public static void printInteger(int n) {
 		System.out.println(n);
 	}
 	
 	public static void printAdd(int a, int b) {
 		int sum;
 		sum = a + b;
 		System.out.println(sum);
 	}
 	
 	public PrintClass1(int a, int b) {
 		this.a = a;
 		this.b = b;
 	}
 	public PrintClass1(int a) {
 		this.n = a;
 	}
}

