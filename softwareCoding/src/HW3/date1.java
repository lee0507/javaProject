package HW3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class date1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		Calendar k30_calt = Calendar.getInstance();//Calendar 메소드 가져오기
		SimpleDateFormat k30_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// SimpleDateFormat이라는 메소드 가져와서 포맷의 형태 지정하기
		System.out.printf("최종실행시간: %s\n", k30_sdt.format(k30_calt.getTime()));// 최종실행시간인 calt.getTime()으로 현재시간을 가져오고 앞에 sdt.format으로 가져오는 시간의 형태를 지정한 뒤 출력하기
		System.out.printf("******************************");
	}

}
