package HW05_1;

public class HW05_1_Highlighter extends HW05_1_Draw {
	public void print() {
		System.out.println("Highlighter_draw");
	}
}

class HW05_1_Pen extends HW05_1_Draw {
	public void print() {
		System.out.println("Pen_draw");
	}
}

class HW05_1_Pencil extends HW05_1_Draw {
	public void print() {
		System.out.println("Pencil_draw");
	}
}