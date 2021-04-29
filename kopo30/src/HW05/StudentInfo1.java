package HW05;

public class StudentInfo1 {
    private String name;
    private String studentNum;
    private int mathGrade;
    private int engGrade;
    private int korGrade;

    public StudentInfo1(String name, String studentNum, int mathGrade, int engGrade, int korGrade) {
        super();
        this.name = name;
        this.studentNum = studentNum;
        this.mathGrade = mathGrade;
        this.engGrade = engGrade;
        this.korGrade = korGrade;
    }

    public String getName() {
        return name;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getEngGrade() {
        return engGrade;
    }

    public int getKorGrade() {
        return korGrade;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t Number: " + studentNum + "\t Math Grade: " + mathGrade + "\t English Grade: " + engGrade + "\t Korean Grade: " + korGrade;
    }
}