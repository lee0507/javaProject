package HW3P;

public class HW3P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "hello how are you I'm fine thank you and you";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(0));
			
		String[] words = text.split(" ");
		System.out.printf("%s", words[0]);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("%s", words[i]);
		}
		
		
	}

}
