package HW05;

public class Character {
		public static String name;
		private int age;
		double offense;
		double defense;
		
		public Character(String name) {
			this(name, 260, 35.5, 42.1);
		}
		
		public Character(String name, int age) {
			this(name, age, 46.1, 38.9);
		}
		
		public Character(String name, int age, double offense, double defense) {
			this.name = name;
			this.age = age;
			this.offense = offense;
			this.defense = defense;	
		}
		
		public String printCharacter() {
			String ret ="";
			ret = name + "|" + age + "|" + offense + "|" + defense;
			return ret;
		}

		public static String getName() {
			return name;
		}

		public static void setName(String name) {
			Character.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getOffense() {
			return offense;
		}

		public void setOffense(double offense) {
			this.offense = offense;
		}

		public double getDefense() {
			return defense;
		}

		public void setDefense(double defense) {
			this.defense = defense;
		}
		
		}
		
