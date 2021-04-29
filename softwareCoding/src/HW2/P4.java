package HW2;

public class P4 {

	public static void main(String[] args) {
		System.out.println('\''); // '(작은따옴표)를 출력하고 싶다면 역슬래쉬를 앞에 적고 출력하면 된다.
		System.out.println("abc\t123\b456");// \b를 사용하면 백스페이스로 앞의 글자를 지운다. 그렇지만 이클립스에는 버그가 있어서 글자가 깨진다.
		System.out.println("\n");// \n을 사용하면 개행(new line)문자를 출력하고 개행한다.(줄을 바꾼다.)
		System.out.println("\"Hello\"");// "(큰따옴표)를 출력하고 싶다면 역슬래쉬를 앞에 적고 출력하면 된다.
		System.out.println("c:\\");// \\를 적게 되면 앞에 있는 역슬래쉬는 뒤의 역슬래쉬를 출력하기 위한 글자가 되면서 \ 한개만 출력된다.

	}

}
