import java.util.Scanner;
public class Input_content {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i = 1, j = 1;
        String str="" ;

        while (!(str.equals("YY"))) {

            System.out.print("請輸入:");
            str = input.next();
            if (!(str.equals("YY"))) {
                T(i);

            }

            i++;

        }
        System.out.print("登入成功!");

    }

    public static void T(int i) {
        System.out.printf("錯誤%d次\n", i);

    }
}
