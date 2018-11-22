public class public_big_small {
    public static int PK(int x,int y){
        if (x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String args[]){
        int a=4,b=8;
        System.out.printf("最大為：%d",PK(a,b));
    }
}
