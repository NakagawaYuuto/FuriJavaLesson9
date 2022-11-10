public class FuriJava {
    //Chap3_2_1
    public static void main(String[] args) {
        int money = 30000;
        while( money >= 0 ) {
            System.out.println(money);
            money -= 5080;
        }

        //Chap3_3_1
        for (int cnt = 1; cnt <= 5; cnt++) {
            System.out.println("ハロー！");
        }

        //Chap3_3_2
        for (int cnt = 1; cnt <= 5; cnt++) {
            System.out.println( cnt + "回目のハロー！");
        }

        //Chap3_4_1
        for (int cnt = 5; cnt >= 1; cnt--) {
            System.out.println(cnt + "回目のハロー!");
        }

        //Chap3_5_1
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.println(x * y);
            }
        }

        //Chap3_5_2
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.println(x + "*" + y  + "=" + x * y);
            }
        }
    }
}
