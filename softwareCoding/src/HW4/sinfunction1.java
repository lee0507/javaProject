package HW4;

public class sinfunction1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		double k30_fSin;//실수형 변수 k30_fSin을 정의한다.
		
		for(int k30_i = 0; k30_i < 360; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 360보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_fSin = Math.sin(k30_i * 3.141592 / 180);//변수 k30_fSin의 값에 Math.sin(k30_i에 3.141592값을 곱하고 180으로 나눈 값)을 저장한다)
			System.out.printf("%d sin ==> %f\n", k30_i, k30_fSin);//%d를 통해 숫자형 변수 k30_i와 %f를 통해 실수형 변수 k30_fSin을 화면에 출력한다.
		}
		
		for(int k30_i = 0; k30_i < 360; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 360보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_fSin = Math.sin(k30_i * 3.141592 / 180);//변수 k30_fSin의 값에 Math.sin(k30_i에 3.141592값을 곱하고 180으로 나눈 값)을 저장한다)
			
			int k30_iSpace = (int)((1.0 - k30_fSin) * 50);//숫자형 변수 k30_iSpace의 값에 (1.0 - k30_fSin)에 50을 곱한 값을 숫자형으로 형변환하고 저장한다.
			for (int k30_j = 0; k30_j < k30_iSpace; k30_j++) {//for반복문을 k30_j는 0부터 k30_j가 k30_iSpace보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
				System.out.printf(" ");//화면에 빈칸 하나를 출력한다.
			}
			System.out.printf("*[%f][%d]\n", k30_fSin, k30_iSpace);//%f를 통해 실수형 변수 k30_fSin과 %d를 통해 숫자형 변수 k30_iSpace를 화면에 출력한다.
		}
	}

}
