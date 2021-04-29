package HW05;

public class StudentManagementSystem {
    private StudentInfo1[] stuList = new StudentInfo1[3];
    private int index = 0;

    public boolean isCanAddStudent() {

        return index < stuList.length;
    }

    public void addStudent(String name, String stuNum, int mathScore, int engScore, int korScore) {
        stuList[index++] = new StudentInfo1(name, stuNum, mathScore, engScore, korScore);

    }

    public StudentInfo1[] getStuList() {
        return stuList;
    }

    public int getIndex() {
        return index;
    }
}