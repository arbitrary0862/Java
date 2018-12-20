package circl;
class cir{

    private double pi = 3.14;
    private double rrr = 3.14;
    public cir() {
        this(20);
    }
    public cir(double r) {
        rrr = r;
    }
    public void show() {
        System.out.println("dddd="+pi*rrr*rrr);
    }
}
public class circ {
    public static void main(String args[]) {
        cir raa = new cir();
        cir ra = new cir(10);
        raa.show();
        ra.show();
    }
}
