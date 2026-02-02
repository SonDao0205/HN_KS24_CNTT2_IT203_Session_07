public class Bai2 {
    static class Student {
        int id;

        public Student(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("Trước : ");
        System.out.println("a : "+a+"\nb : "+b);
        a = 20;
        System.out.println("Sau : ");
        System.out.println("a : "+a+"\nb : "+b);
        // Kết quả: b không đổi vì b giữ một bản sao độc lập.
        Student s1 = new Student(100);
        Student s2 = s1;
        System.out.println("Trước");
        System.out.println("s1.id : "+s1.id+"\ns2.id : "+s2.id);
        s1.id = 200;
        System.out.println("Sau : ");
        System.out.println("s1.id : "+s1.id+"\ns2.id : "+s2.id);
        // Kết quả: s2.id cũng thay đổi theo!
    }
}