package HW05;

import java.util.Scanner;

public class JAVA_Student {

    public static void main(String[] args) {

        StudentManagementSystem sm = new StudentManagementSystem();

        System.out.println("===== �л����� ���α׷� =====");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1.���  2.��ȸ  3.���� >> ");
            int choice = sc.nextInt();
            if (choice == 1) {
                if (sm.isCanAddStudent()) {
                    System.out.print("�̸� : ");
                    String name = sc.next();
                    System.out.print("�й� : ");
                    String stuNum = sc.next();
                    System.out.print("�������� : ");
                    int mathScore = sc.nextInt();
                    System.out.print("�������� : ");
                    int engScore = sc.nextInt();
                    System.out.print("�������� : ");
                    int korScore = sc.nextInt();

                    sm.addStudent(name, stuNum, mathScore, engScore, korScore);
                } else {
                    System.out.println("����ο� �ʰ�");
                }
            } else if (choice == 2) {
                StudentInfo1[] stuList = sm.getStuList();
                for (int i = 0; i < sm.getIndex(); i++) {
                    System.out.println((i + 1) + "�� �л� >> " + stuList[i]);
                    // System.out.println("�̸� \t �й� \t ���� \t ���� \t ����");
                    // System.out.println(stuList[i].getName() + " \t " + stuList[i].getStudentNum()
                    // + " \t "
                    // + stuList[i].getMathGrade() + " \t\t " + stuList[i].getEngGrade() + " \t\t "
                    // + stuList[i].getKorGrade());
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("�߸��� �Է�");
            }
        }
    }

}