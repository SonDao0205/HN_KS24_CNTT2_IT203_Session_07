package BTTH.model;

public class Student {
    String studentId;
    String studentName;

    public static final String SCHOOL_NAME = "ABC University";
    public static int studentCount = 0;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        studentCount++;
    }

    public void displayInfo() {
        System.out.println("---------------------------");
        System.out.println("Mã SV: " + studentId);
        System.out.println("Tên SV: " + studentName);
        System.out.println("Trường: " + SCHOOL_NAME);
    }

    public static void showTotalStudent() {
        System.out.println("\n==> Tổng số sinh viên hiện tại: " + studentCount);
    }
}