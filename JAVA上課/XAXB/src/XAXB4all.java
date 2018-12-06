import java.util.Scanner;
public class XAXB4all {

    public static void main(String[] args) {
        int pc[] = new int[4];
        int user[] = new int[4];
        int a = 0, b = 0, c = 0;
        String CI;
        Scanner in = new Scanner(System.in);

        // 產生電腦的四位數
        for (int x = 0; x < pc.length; x++) {
            pc[x] = (int) (Math.random() * 10000) % 10;

        }

        while (pc[1] == pc[0]) {
            pc[1] = (int) (Math.random() * 10000) % 10;
        }

        while (pc[2] == pc[0] || pc[2] == pc[1]) {
            pc[2] = (int) (Math.random() * 10000) % 10;
        }

        while (pc[3] == pc[0] || pc[3] == pc[1] || pc[3] == pc[2]) {
            pc[3] = (int) (Math.random() * 10000) % 10;
        }

        System.out.printf("%d %d %d %d", pc[0], pc[1], pc[2], pc[3]);

        while (true) {

            // 使用者輸入
            System.out.print("請輸入4個不同的數字：");
            CI = in.next();
            for (int x = 0; x < 4; x++) {

                user[x] = Integer.parseInt(String.valueOf(CI.charAt(x)));
                // 判斷?A?B
                if (pc[x] == user[x]) {
                    a += 1;

                } else {
                    b += 1;
                }
            }
            // 是否結束程式
            if (a == 4) {
                System.out.print("輸入正確");
                break;
            } else {
                System.out.printf("%dA %dB", a, b);
                a = 0;
                b = 0;
            }

        }

    }
}
