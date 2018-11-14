public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		int b[] = new int[10];

		
		int sum = 0, XX = 1;

		for (int x = 0; x < a.length; x++) {
			a[x] = x + 1;
			b[x] = x + 1;
			sum += a[x];
			XX *= a[x] ;
		}

		System.out.printf("sum = %d \n X  = %d ", sum, XX);
		
			
				

	}

}
