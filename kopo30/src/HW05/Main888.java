package HW05;

public class Main888 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man = new Man();
		Man.printContent();
		
		People people = new People();
		people.printContent();
		People people2 = new Man();
		people2.printContent();
		People people3 = new Woman();
		people3.printContent();
		
	}

}

class People {
	static void printContent() {
		System.out.println("People");
	}
}

class Man extends People {
	static void printContent() {
		System.out.println("Man");
	}
}

class Woman extends People {
	static void printContent() {
		System.out.println("Woman");

	}
}