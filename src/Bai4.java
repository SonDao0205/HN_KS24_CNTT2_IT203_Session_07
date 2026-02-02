public class Bai4 {
    static class Classroom{
        static double classFund;
        String studentName;

        public Classroom(String studentName){
            this.studentName = studentName;
        }

        void payFund(double amount) {
            classFund += amount;
        }

        static void showFund(){
            System.out.println("Class fund: " + classFund);
        }
    }

    public static void main(String[] args) {
        Classroom st1 = new Classroom("nguyen van a");
        st1.payFund(10);
        Classroom st2 = new Classroom("nguyen van b");
        st2.payFund(20);
        Classroom st3 = new Classroom("nguyen van c");
        st3.payFund(30);

        Classroom.showFund();
    }
}
