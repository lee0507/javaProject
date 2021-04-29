package HW7;

public class P5arrayMinMax {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int[] k30_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33};
		//숫자형 배열 k30_iArray를 정의하고 값을 저장한다.
		for(int k30_i = 0; k30_i < k30_iArray.length; k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iArray의 길이보다 작을때 까지 k30_i를 1씩 증가시키며 수행한다.
			System.out.printf("iArray[%d] = %d\n", k30_i, k30_iArray[k30_i]);//변수 k30_i와 k30_iArray의 인덱스 k30_i번째를 화면에 출력한다.
		}
		
		int k30_iMax = k30_iArray[0];//숫자형 배열 k30_iMax를 정의하고 k30_iArray의 0번인덱스 값을 저장한다.
		int k30_iMin = k30_iArray[0];//숫자형 배열 k30_iMin를 정의하고 k30_iArray의 0번인덱스 값을 저장한다.
		int k30_iMaxPt = 0;//숫자형 변수 k30_iMaxPt를 정의하고 값을 0으로 초기화한다.
		int k30_iMinPt = 0;//숫자형 변수 k30_iMinPt를 정의하고 값을 0으로 초기화한다.
		
		for (int k30_i = 0; k30_i < k30_iArray.length; k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iArray의 길이보다 작을때 까지 k30_i를 1씩 증가시키며 수행한다.
			if(k30_iMax < k30_iArray[k30_i]) {//만약 k30_iMax가 k30_iArray의 k30_i번째 인덱스보다 작다면
				k30_iMax = k30_iArray[k30_i];//k30_Max는 k30_iArray의 k30_i번째 인덱스 값으로 저장한다.
				k30_iMaxPt = k30_i;//변수 k30_iMaxPt의 값은 k30_i로 저장한다.
			}
			if(k30_iMin > k30_iArray[k30_i]) {//만약 k30_iMax가 k30_iArray의 k30_i번째 인덱스보다 크다면
				k30_iMin = k30_iArray[k30_i];//k30_Min는 k30_iArray의 k30_i번째 인덱스 값으로 저장한다.
				k30_iMinPt = k30_i;//변수 k30_iMinPt의 값은 k30_i로 저장한다.
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k30_iMaxPt, k30_iMax);//변수 k30_iMaxPt와 k30_iMax를 화면에 출력한다.
		System.out.printf("MIN : iArray[%d]=%d\n", k30_iMinPt, k30_iMin);//변수k30_iMinPt와 k30_iMin를 화면에 출력한다.
	}

}
