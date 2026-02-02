public class Bai1 {
    static class Student {
        String studentId;
        String studentName;
        static int totalStudent;
        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            totalStudent++;
        }

        public void showInfo(){
            System.out.println("Student Id: " + studentId);
            System.out.println("Student Name: " + studentName);
            System.out.println("Total Student: " + totalStudent);
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("1","nguyen van a");
        st1.showInfo();
        Student st2 = new Student("2","nguyen van b");
        st2.showInfo();
    }
}
