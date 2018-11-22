import java.util.Scanner;
public class Copublic {
	public static int abs(int x) {
		if (x>0) {
			return x;
		}
		else {
			return x * -1;
		}
	}

	public static String evenodd(int y){
		if (y % 2 == 0) {
			return("偶數");
		}
		else {
			return("基數");
		}
	}


	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入要判斷的數字：");
		int a = in.nextInt();

		System.out.printf("輸入：%d,此數字為：%s,絕對值後為：%d",a,evenodd(abs(a)),abs(a));

	}
}
