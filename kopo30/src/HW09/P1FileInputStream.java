package HW09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P1FileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\a\\Desktop\\out.csv");
		
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		
		input.close();
	}

}
