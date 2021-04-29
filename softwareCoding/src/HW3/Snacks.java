package HW3;

public class Snacks {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작

		String [] k30_item = {"맛동산", "웨하스", "롯데샌드", "오땅", "사브레"};// String 배열 k30_item을 정의하고 맛동산, 웨하스, 롯데샌드, 오땅, 사브레를 각각의 값을 배열에 추가한다.
		int[] k30_price = {1000, 2000, 3000, 2500, 1450};// int 배열 k30_price를 정의하고 1000, 2000, 3000, 2500, 1450을 각각의 값을 배열에 추가한다.
		int[] k30_amount = {10, 2, 1, 3, 5};// int 배열 k30_amount를 정의하고 10, 2, 1, 3, 5를 각각의 값을 배열에 추가한다.
		double k30_tax_rate = 0.1;// 실수형 변수 k30_tax_rate를 정의하고 0.1로 값을 저장한다.
		int k30_total_sum = 0;// 숫자형 변수 k30_total_sum을 정의하고 0으로 값을 초기화한다.
		
		System.out.printf("************************************************************\n");
		System.out.printf("			너가 지른 과자들			\n");
		System.out.printf("항 목		   단 가	       수 량		     합 계 	\n");
		for (int k30_i = 0; k30_i < k30_item.length; k30_i++) {//반복문 for를 통해 변수 k30_i가 0부터 k30_item.length인 String배열의 길이 5만큼 반복된다.
			int k30_sum = k30_price[k30_i] * k30_amount[k30_i];// 한번 반복 될때마다 변수 k30_sum은 k30_price의 인덱스 값 0부터 4까지, k30_amount의 인덱스 값 0부터 4까지를 곱한다.
			k30_total_sum = k30_total_sum + k30_sum;//위에서 한번 돌 때마다 곱한 값인 k30_sum을 k30_total_sum에 더하여 주어 과자의 총 가격을 구한다.
			System.out.printf("%-5s		%7d		%2d		%9d\n", k30_item[k30_i],k30_price[k30_i], k30_amount[k30_i], k30_sum);
		}// 변수 k30_item과 k30_price, k30_amount, k30_sum을 한번 돌 때마다 각 항목들의 과자명, 단가, 수량, 합계를 출력한다.
		System.out.printf("************************************************************\n");
		System.out.printf("			지불금액 :     %20d\n", k30_total_sum);// 총 지불 금액인 변수 k30_total_sum을 출력한다.
		
		int k30_total_net_price = (int)(k30_total_sum / (1 + k30_tax_rate));// 숫자형 변수 k30_total_net_price를 정의하고 과세금액을 계산하기 위해 k30_total_sum을 1 + k30_tax_rate로 나누어 준 뒤 숫자형으로 형변환 하였다.
		System.out.printf("			과세금액 :     %20d\n", k30_total_net_price);// 과세금액인 k30_total_net_price를 출력한다.
		int k30_tax = k30_total_sum - k30_total_net_price;// 숫자형 변수 k30_tax를 정의하고 세금을 계산하기 위해 지불금액인 k30_total_sum에서 과세금액인 k30_total_net_price를 뺀다.
		System.out.printf("			세   금 :     %20d\n", k30_tax);// 세금인 k30_tax를 출력한다.
	}

}
