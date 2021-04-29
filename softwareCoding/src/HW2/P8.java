package HW2;

public class P8 {

	public static void main(String[] args) {
		short k30_sMin = -32768;
		short k30_sMax = 32767;
		char k30_cMin = 0;
		char k30_cMax = 65535;
		
		System.out.println("sMin = " + k30_sMin);
		System.out.println("sMin-1 = " + (short)(k30_sMin - 1));
		System.out.println("sMax = " + k30_sMax);
		System.out.println("sMax+1 = " + (short)(k30_sMax + 1));
		System.out.println("cMin = " + (int)k30_cMin);
		System.out.println("cMin-1 = " + (int)--k30_cMin);
		System.out.println("cMax = " + (int)k30_cMax);
		System.out.println("cMax+1 = " + (int)++k30_cMax);
	}

}
