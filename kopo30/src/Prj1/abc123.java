package Prj1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class abc123 {
	public static void main(String[] args) throws IOException {
		
		MainScr.getChoices(MainScr.getAdd(GetArr.getArray()));

	}
}

class GetArr{
	
	public static String[][] getArray() throws IOException {
		ArrayList<String> rEstate = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("D:\\prj"));

		String line;
		int cnt = 0;
		while((line = reader.readLine()) != null) {
			if(cnt >= 16) {
				rEstate.add(line);
			}
			cnt++;
		}
		
		String[][] rEst = new String[rEstate.size()][];
		for(int i = 0; i < rEstate.size(); i++) {
			rEst[i] = rEstate.get(i).split(",");
		}
		
		for (int i = 0; i < rEst.length; i++) {
			rEst[i][8] = rEst[i][8] + rEst[i][9];
			}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < rEst[i].length; j++) {
				System.out.print("[" + rEst[i][j] + "]");
			}
			System.out.println("");
		}
		
		return rEst;
	}
}

class MainScr{
	
	public static HashSet<String> getAdd(String[][] rEstate) {
		HashSet<String> address = new HashSet<String>(); 
		
		for(int i = 0; i < rEstate.length; i++) {
			address.add(rEstate[i][0]);
		}
		System.out.println(address);
		System.out.println(address.size());
		return address;
		
	}
	
	public static String[][] getChoices(HashSet<String> hashSet) {
		ArrayList<String> dong1 = new ArrayList<>(hashSet);
		String[][] dong2 = new String[dong1.size()][3];
		
		for (int i = 0; i < dong1.size(); i++) {
			dong2[i] = dong1.get(i).split(" ");
		}
		
		//only getting what we need
		String[][] dong3 = new String[dong1.size()][2];
		
		for(int i = 0; i < dong2.length; i++) {
			dong3[i][0] = dong2[i][1];
		}
		
		for(int i = 0; i < dong2.length; i++) {
			dong3[i][1] = dong2[i][2];
		}
		
		for(int i = 0; i < dong3.length; i++) {
			for(int j = 0; j < dong3[i].length; j++) {
				System.out.print("[" + dong3[i][j] + "]");
			}
			System.out.println("");
		}
		
		return dong3;
	}
}
