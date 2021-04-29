package HW08;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {5, 10, 12};
		String temp = null;
		
		try {
			System.out.println(temp.length());
			System.out.println("try");
		} catch (NullPointerException e) {
			System.out.println("exception 1");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("exception 2");
		} finally {
			System.out.println("finally");
		}
	}

}
