import java.util.Scanner;
public class max_min {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        int g[];

        System.out.println("請輸入要判斷多少數字:");
        g = new int[input.nextInt()];
        for (int x = 0; x < g.length; x++) {
            int a = x + 1;
            System.out.printf("請輸入要判的第%d數字:",a);
            g[x] = input.nextInt();

        }

        //氣泡
        for (int i = 0; i < g.length - 1; i++) {
            for (int j = 0; j < g.length - i - 1; j++) {
                if (g[j + 1] > g[j]) {
                    int temp = g[j + 1];
                    g[j + 1] = g[j];
                    g[j] = temp;
                }
            }
        }

        System.out.printf("一共輸入：%d個數字 \n最大為：%d \n最小為：%d" , g.length , g[0]  , g[g.length-1]);
    }
}
