package HW4;

public class array1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int[] score1 = {1, 2, 3, 4, 5};// int형 배열을 생성하고 1, 2, 3, 4, 5의 값을 순서대로 저장한다.
		String[] name1 = {"lee", "kim", "park", "ryu", "choi"};//String형 배열을 생성하고 값을 순서대로 저장한다.
		
		int score2[] = {6, 7, 8, 9, 10};// 위에와 다르게 이런 형식으로 배열을 생성할 수도 있다.
		String name2[] = {"pogba", "rooney", "bruno", "fred", "rashford"};// 위에와 다르게 이런 형식으로 배열을 생성할 수도 있다.
		
		int [] score3 = new int[5]; //크기가 5인 int형 배열을 생성한다.
		score3[0] = 100;// 인덱스 0번 값에 100을 저장한다.
		score3[1] = 90;// 인덱스 1번 값에 90을 저장한다.
		score3[2] = 80;// 인덱스 2번 값에 80을 저장한다.
		score3[3] = 70;// 인덱스 3번 값에 70을 저장한다.
		score3[4] = 60;// 인덱스 4번 값에 60을 저장한다.
		for (int i = 0; i < score1.length; i++) {
			System.out.print(score1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < name1.length; i++) {
			System.out.print(name1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < name2.length; i++) {
			System.out.print(name2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < score3.length; i++) {
			System.out.print(score3[i] + " ");
		}
	}

}
