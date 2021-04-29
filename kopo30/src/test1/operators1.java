package test1;

import java.util.Scanner;

public class operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Arithmetic Operators
//		int a = 3;
//		int b = 3;
//		
//		System.out.println(a*b);
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println((double)a/b);
//		System.out.println(a%b);
//		System.out.println(++a);
//		System.out.println(a++);
		
//	Assignment Operators
//		int x = 7;
//		System.out.println(x);
//		
//		x+=3;
//		System.out.println(x);
//		x-=3;
//		System.out.println(x);
//		x*=3;
//		System.out.println(x);
//		x/=3;
//		System.out.println(x);
//		x %= 3;
//		System.out.println(x);
//		x = 10;
//		System.out.println(x);
//		x &= 3;
//		System.out.println(x);
//		x |= 3;
//		System.out.println(x);
//		x = 50;
//		System.out.println(x);
//		x ^= 3;
//		System.out.println(x);
//		x >>= 3;
//		System.out.println(x);
//		x <<= 3;
//		System.out.println(x);
		
//	Comparison Operators
//		int x = 3;
//		int y = 3;
//		int z = 5;
//		
//		System.out.println(x == y);
//		System.out.println(x != y);
//		System.out.println(x > y);
//		System.out.println(x < z);
//		System.out.println(x >= z);
//		System.out.println(y <= z);
		
//	Logical Operators
//		int x = 10;
//		int y = 20;
//		System.out.println(x < 5 && y > 10);
//		System.out.println(x < 5 || y > 10);
//		System.out.println(!(x < 5 && y > 10));
//		System.out.println(!(x + y - 10 == 20));

//	Input Function
//		Scanner scanner = new Scanner(System.in);
//		String name;
//		int age;
//		double height;
//		
//		System.out.println("please input your name");
//		name = scanner.next();
//		System.out.println("My name is " + name);
//		
//		System.out.println("please input your age");
//		age = scanner.nextInt();
//		System.out.println("My age is " + age) ;
//		
//		System.out.println("How tall are you?");
//		height = scanner.nextDouble();
//		System.out.println("I am " + height + "cm");
//		System.out.println("hello\nhello\nhello");
//		System.out.println("hello\thello");
//		System.out.println("hello\"hellohello\"");
//		System.out.println("It\'s mine");
		
		Scanner scanner = new Scanner(System.in);
		int i, j;
		i = 2;
		j = 3;
		
		if (i > j) {
			System.out.println("i is greater than j");
		} else if (i == 4) {
			System.out.println("i is 4");
		} else if (j == 4) {
			System.out.println("j is 4");
		} else {
			System.out.println("j is greater than i");
		}
		
	}

}
