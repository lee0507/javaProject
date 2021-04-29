package HW09;

import java.io.FileWriter;
import java.io.IOException;

public class P1FileWirter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\a\\Desktop\\out.csv", true);
		for(int i = 11; i < 16; i++) {
			String data = "Line #" + i + "\n"; //append 내용을 이어서 추가한다. 
			fw.write(data);
		}
		fw.close();

	}

}
