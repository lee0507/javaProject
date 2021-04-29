package HW3P;

public class HW3P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "hello how are you I'm fine thank you and you";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(0));
		int cnt = 0;
		
		for (int j = 0; j < text.length(); j++) {
			int s = text.charAt(j);
			if (s == 32) {
				cnt++;
			} else {
				
			}
		} System.out.println(cnt);
			
		String[] t = text.split(" ");
		System.out.println(t[0]);
		
		for (int i = 0; i < cnt+1; i++) {
			System.out.println(t[i]);
		}
		
		
	}

}
