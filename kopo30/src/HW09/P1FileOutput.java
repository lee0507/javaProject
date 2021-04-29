package HW09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P1FileOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream output = new FileOutputStream("C:\\Users\\a\\Desktop\\out.csv");

			String data = "no,name,age,school,major,score" + "\n" + "1,kim,20,korea,\"english,korean\",5"
			+ "\n" + "2,lee,10,seoul,math,10" + "\n" + "3,park,20,kangwon,english,5";
			output.write(data.getBytes());
		output.close();

	}

}
