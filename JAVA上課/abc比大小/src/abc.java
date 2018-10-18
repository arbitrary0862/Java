
    import java.util.Scanner;
    public class abc {
            public static void main(String args[]) {
            Scanner input = new Scanner(System.in);

            int a, b, c;
            String s;
            System.out.println("a");
            a = input.nextInt();
            System.out.println("b");
            b = input.nextInt();
            System.out.println("c");
            c = input.nextInt();
            s= "";
            if (a > b && a > c) {

                if (b > c) {

                    s = "a>b>c";
                } else {
                    s = "a>c>b";

                }
            } else if (b > a && b > c) {
                if (a > c) {

                    s = "b>a>c";
                } else {
                    s = "b>c>a";

                }

            } else if (c > a && c > b) {
                if (a > b) {

                    s = "c>a>b";
                } else {
                    s = "c>b>a";

                }
            }

            System.out.println(s);
        }
    }





