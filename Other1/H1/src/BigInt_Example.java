
public class BigInt_Example {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String one = "546545143135";
		String two = "413543543543543543543543543435435435431";

		int[] one_a = new int[10000];
		int[] two_b = new int[10000];
		int temp;
		int[] anw = new int[20000];

		for (int i = 0; i < one.length(); i++) {
			one_a[i] = Integer.parseInt(one.substring(i, i + 1));
			System.out.println(one_a[i]);
		}

		System.out.println("-------------------------");
		for (int i = 0; i < two.length(); i++) {
			two_b[i] = Integer.parseInt(two.substring(i, i + 1));
			System.out.println(two_b[i]);
		}

	}

}
