package BTTH;

import BTTH.model.Student;

public class BTTH {
    public static void main(String[] args) {
        Student.showTotalStudent();
        Student st1 = new Student("SV001", "Nguyễn Văn A");
        st1.displayInfo();
        Student st2 = new Student("SV002", "Trần Thị B");
        st2.displayInfo();
        Student st3 = new Student("SV003", "Lê Văn C");
        st3.displayInfo();
        Student.showTotalStudent();
        System.out.println("Tên trường : " + Student.SCHOOL_NAME);
    }
}