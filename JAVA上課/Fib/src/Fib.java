public class Fib {

    public static int f(int a){
        if (a==1)return 1;
            return a + f(a-1);
    }
    public static void main(String args[]){
        System.out.print(f(10));
    }
}
