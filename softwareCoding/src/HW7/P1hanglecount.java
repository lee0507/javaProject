package HW7;

public class P1hanglecount {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));//함수 HanBlankForeword에 파라미터를 한글abcd와 15를 넣어서 화면에 출력한다.
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15));//함수 HanBlankForeword에 파라미터를 한글한글aa와 15를 넣어서 화면에 출력한다.
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글aa", 15));//함수 HanBlankBackword에 파라미터를 한글aa와 15를 넣어서 화면에 출력한다.
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글한글aa", 15));//함수 HanBlankBackword에 파라미터를 한글한글aa와 15를 넣어서 화면에 출력한다.
		System.out.printf("한글은 [%s]개\n", HanCount("한글한글aa"));//함수 HanCount에 파라미터를 한글한글aa를 넣어서 화면에 출력한다.
	}
	
	public static String HanBlankForeword(String k30_word, int k30_length) {// HanBlankForeword이라는 함수 생성하고 파라미터를 문자열 k30_word와 숫자형 k30_length로 주었다. 
		byte[] k30_wdcount = k30_word.getBytes();//getBytes를 이용하여 k30_word를 바이트값으로 받아 바이트배열 k30_wdcount에 저장하였다.
		int k30_byteleng = k30_wdcount.length;//숫자형 변수 k30_byteleng을 정의하고 값으로 k30_wdcount의 길이를 저장하였다.
		String k30_ret_str = "";// 문자열형 변수 k30_ret_str을 정의하고 값을 초기화하였다.
		for(int k30_i = 0; k30_i < (k30_length - k30_byteleng); k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 (k30_length - k30_byteleng)보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_ret_str = k30_ret_str + " ";//변수 k30_ret_str에 반복문하는 만큼의 공백을 넣는다.
		}
		k30_ret_str = k30_ret_str + k30_word;//변수 k30_ret_str에 다시 기존의 변수 k30_word를 뒤로 추가한다.
		return k30_ret_str;//리턴값을 변수 k30_ret_str로 받는다.
		
	}
	
	public static String HanBlankBackword(String k30_word, int k30_length) {// HanBlankBackword이라는 함수 생성하고 파라미터를 문자열 k30_word와 숫자형 k30_length로 주었다. 
		byte[] k30_wdcount = k30_word.getBytes();//getBytes를 이용하여 k30_word를 바이트값으로 받아 바이트배열 k30_wdcount에 저장하였다.
		int k30_byteleng = k30_wdcount.length;//숫자형 변수 k30_byteleng을 정의하고 값으로 k30_wdcount의 길이를 저장하였다.
		String k30_ret_str = "";// 문자열형 변수 k30_ret_str을 정의하고 값을 초기화하였다.
		for(int k30_i = 0; k30_i < (k30_length - k30_byteleng); k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 (k30_length - k30_byteleng)보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			k30_ret_str = k30_ret_str + " ";//변수 k30_ret_str에 반복문하는 만큼의 공백을 넣는다.
		}
		k30_ret_str = k30_word + k30_ret_str;//변수 k30_ret_str에 다시 기존의 변수 k30_word를 앞으로 추가한다.
		return k30_ret_str;//리턴값을 변수 k30_ret_str로 받는다.
		
	}
	
	public static int HanCount(String k30_word) {// HanCount라는 함수 생성하고 파라미터를 문자열 k30_word로 주었다. 
		byte[] k30_wdcount = k30_word.getBytes();//getBytes를 이용하여 k30_word를 바이트값으로 받아 바이트배열 k30_wdcount에 저장하였다.
		int k30_count = k30_wdcount.length - k30_word.length();//숫자형 변수 k30_count를 정의하고 k30_wdcount.length - k30_word.length()값을 저장하였다.
		return k30_count;//리턴값을 변수 k30_count로 받는다.
	}

}
