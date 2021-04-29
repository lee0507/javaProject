package HW09;

import java.io.File;

public class P1ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Users\\a\\Desktop\\abc");
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

}
