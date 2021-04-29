package HW09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P1BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\a\\Desktop\\out.csv"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}

}
