public class Funtion_g00 {
    public static int[][] fu(int gg[][]) {
        for (int x = 0; x < gg.length; x++) {
            for (int y = 0; y < gg[x].length; y++) {
                gg[x][y] *=2;
            }
        }

        return gg;
    }

    public static void main(String args[]) {
        int g[][] = { { 2, 4, 6 }, { 1, 3, 5 }, { 8, 9 } };
        int h[][];
        h = fu(g);
        for (int x = 0; x < h.length; x++) {
            for (int y = 0; y < h[x].length; y++) {
                System.out.println(h[x][y]);
            }
        }

    }
}
