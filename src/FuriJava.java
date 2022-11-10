import java.util.Arrays;

public class FuriJava {
    public static void main(String[] args) {
        //Chap3_2_1
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

        //Chap3_6_1
        String [] ewsn = {"東", "西", "南", "北"};
        System.out.println(ewsn[1]);

        //Chap3_6_2
        String [] ewsn1 = {"東", "西", "南", "北"};
        ewsn1[0] = "真東";
        System.out.println(ewsn1[0]);

        String [] ewsn2 = new String[4];
        ewsn2[0] = "東";
        ewsn2[1] = "西";

        //Chap3_7_1
        String [] ewsn3 = {"東", "西", "南", "北"};
        for(String str : ewsn3){
            System.out.println(str + "方向");
        }

        //Chap3_8_1
        String [] team = {"A", "B", "C", "D", "E"};
        for(String t1 : team){
            for (String t2 : team){
                System.out.println(t1 + "vs" + t2);
            }
        }

        //Chap3_8_2
        String [] team1 = {"A", "B", "C", "D", "E"};
        for(String t1 : team1){
            for (String t2 : team1){
                if (!t1.equals(t2))
                System.out.println(t1 + "vs" + t2);
            }
        }

        String[] team2 = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < team2.length; i++) {
            System.out.println(team2[i]);
        }

        //Chap3_9_1(無限ループ）
        int num = 0;
        while (num >= 0){
            num = num +1;
            System.out.println(num);
        }

        String[] grade = {"松", "竹", "梅"};
        for (String g : grade){
            System.out.println(g);
        }

        String[] ewsn4 = {"東", "西", "南", "北"};
        for (int i = 3; i >= 0; i--) {
            System.out.println(ewsn4[i] + "方向");
        }
    }
}
