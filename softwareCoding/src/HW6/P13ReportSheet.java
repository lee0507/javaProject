package HW6;

public class P13ReportSheet {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		
		int k30_iPerson = 10;//숫자형 변수 iPerson을 정의하고 값을 10으로 초기화한다.
		
		P13InputData k30_inData = new P13InputData(k30_iPerson);//P13InputData 클래스에 파라미터를 inPerson으로 준다음 객체를 만들고 인스턴스를 생성하여서 객체에 연결한다.
		
		for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 k30_iPerson보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			String k30_name = String.format("홍길%02d", k30_i);//변수 k30_name에 k30_i를 string으로 형변환한 현재 홍길%02d를 값으로 저장한다. 
			int k30_kor = (int)(Math.random() * 100);//변수 k30_kor에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_eng = (int)(Math.random() * 100);//변수 k30_eng에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_mat = (int)(Math.random() * 100);//변수 k30_mat에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			k30_inData.SetData(k30_i, k30_name, k30_kor, k30_eng, k30_mat);//아까 받아온 객체를 사용하여 P13InputData클래스의 SetData함수를 실행한다.
		}

		
		for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_iPerson보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.

			System.out.printf("번호:%d, 이름:%s, 국어:%2d, 영어:%2d, 수학:%2d, 총점:%3d, 평균:%f\n",//변수들을 순서대로 화면에 출력한다.
					k30_i, k30_inData.k30_name[k30_i], k30_inData.k30_kor[k30_i], k30_inData.k30_eng[k30_i], 
					k30_inData.k30_mat[k30_i], k30_inData.k30_sum[k30_i], k30_inData.k30_avg[k30_i]);
		}
	}

}
