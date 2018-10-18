import java.util.Scanner;

public class BtoS {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int g[] = new int[5];
        for (int x = 0; x < g.length; x++) {
            int a = x + 1;
            System.out.printf("請輸入要判的第%d數字:", a);
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

        System.out.printf("%d>%d>%d>%d>%d", g[0], g[1], g[2], g[3], g[4]);
    }
}
