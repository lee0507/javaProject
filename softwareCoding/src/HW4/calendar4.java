package HW4;

public class calendar4 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int [] iLMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 숫자형 배열 iLMD 정의하고 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31의 값을 순서대로 저장한다.
		
		for(int k30_i = 1; k30_i < 13; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 13보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf(" %d월 =>", k30_i);//변수 k30_i를 화면에 출력한다.
			for(int k30_j = 1; k30_j < 32; k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 32보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf("%d", k30_j);//변수 k30_j를 화면에 출력한다.
				
				if(iLMD[k30_i - 1] == k30_j) break;//만약 iLMD의 [k30_i - 1]인 인덱스가 k30_j와 같다면 break문을 수행한다.
				System.out.printf(",");//일자가 뒤에 하나씩 ,를 출력한다. 위의 if문보다 아래 작성하여 마지막 일자에는 ,가 작성되지 않도록 한다.
			}
			System.out.printf("\n");//월별로 출력을 다했을때는 줄바꿈을 출력한다.
		}
	}

}
