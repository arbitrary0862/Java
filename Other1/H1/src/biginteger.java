import java.math.BigInteger;

public class biginteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "113213126";  
		
		String two = "000151315";  
		
		int[] one_a = new int[10000];
		int[] two_b = new int[10000];
		int[] anw = new int[20000];
		
		for(int i = 0 ; i< one.length() ; i ++) {
			one_a[i] = Integer.parseInt(one.substring(i, i+1));
			//System.out.println(one_a[i]);
		}
		
		System.out.println("-------------------------");
		for(int i = 0 ; i< two.length() ; i ++) {
			two_b[i] = Integer.parseInt(two.substring(i, i+1));
			//System.out.println(two_b[i]);
		}
		String output="";
		int temp= 0;
		for (int i = two.length()-1 ; i >= 0 ; i--) {
			
			anw[i] = ((one_a[i] + two_b[i]) % 10) + temp;
			if(one_a[i] + two_b[i] > 10) {
				temp = 1;
			}else {
				temp = 0;
			}
			output= anw[i] +output ;
		}
		
		System.out.println(output);
		//System.out.println(bone.add(btwo));
	}

}
