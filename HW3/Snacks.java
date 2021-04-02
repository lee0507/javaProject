package HW3;

public class Snacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] k30_item = {"맛동산", "웨하스", "롯데샌드", "오땅", "사브레"};
		int[] k30_price = {1000, 2000, 3000, 2500, 1450};
		int[] k30_amount = {10, 2, 1, 3, 5};
		double k30_tax_rate = 0.1;
		int k30_total_sum = 0;
		
		System.out.printf("************************************************************\n");
		System.out.printf("			너가 지른 과자들			\n");
		System.out.printf("항 목		   단 가	       수 량		     합 계 	\n");
		for (int k30_i = 0; k30_i < k30_item.length; k30_i++) {
			int k30_sum = k30_price[k30_i] * k30_amount[k30_i];
			k30_total_sum = k30_total_sum + k30_sum;
			System.out.printf("%.5s		%7d		%2d		%9d\n", k30_item[k30_i],k30_price[k30_i], k30_amount[k30_i], k30_sum);
		}
		System.out.printf("************************************************************\n");
		System.out.printf("			지불금액 :     %20d\n", k30_total_sum);
		
		int k30_total_net_price = (int)(k30_total_sum / (1 + k30_tax_rate));
		System.out.printf("			과세금액 :     %20d\n", k30_total_net_price);
		int k30_tax = k30_total_sum - k30_total_net_price;
		System.out.printf("			세   금 :     %20d\n", k30_tax);
	}

}
