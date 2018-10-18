import java.util.Scanner;

public class test {
    public static void main(String args []){

        Scanner input  = new Scanner(System.in);

        int g[],a,b,c;

        System.out.print("請輸入有幾位同學：");
        c = input.nextInt();
        g = new int [c];

        a =0;
        for (int i = 0 ; i < g.length; i++){
            b = i+1;
            System.out.print("請輸入第"+ b +"位同學成績：");
            g[i]  = input.nextInt();
            a += g[i];

        }

        System.out.print(c+"位同學的平均成績等於："+ a/c );

    }
}
