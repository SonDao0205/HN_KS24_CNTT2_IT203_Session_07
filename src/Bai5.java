public class Bai5 {
    static class Config{
        static final double MAX_SCORE = 100;
        static final double MIN_SCORE = 0;
    }

    public static void main(String[] args) {
        System.out.println("max : " + Config.MAX_SCORE);
        System.out.println("min : " + Config.MIN_SCORE);
        // Config.MAX_SCORE += 10;
        // lỗi : java: cannot assign a value to static final variable MAX_SCORE
        // vì biến static này được khai báo với final, và final sẽ không được thay đổi giá trị sau khi khởi tạo;
    }
}
