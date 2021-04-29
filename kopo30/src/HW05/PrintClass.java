package HW05;

public class PrintClass {
 int a, b, n;
 
 	public PrintClass(int a, int b, int n) {
 		this.a = a;
 		this.b = b;
 		n = n;
 	}
 	
 	public void printInteger() {
 		System.out.println(n);
 	}
 	
 	public void printAdd() {
 		int sum;
 		sum = this.a + this.b;
 		System.out.println(sum);
 	}
 	
 	public PrintClass(int a, int b) {
 		this.a = a;
 		this.b = b;
 	}
 	public PrintClass(int a) {
 		this.n = a;
 	}
}
