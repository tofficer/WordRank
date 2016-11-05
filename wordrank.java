import java.math.BigInteger;

public class WordRank {
	
	public static final int mod = 1000000007;
	public static void main(String[] args) {

		String s = "axaelixedhtshsixbuzouqtjrkpyafthezfuehcovcqlbvmkbrwxhzrxymricmehktxepyxomxcx";

		BigInteger rank = new BigInteger("0");
		BigInteger bottom = new BigInteger("1");
		int[] counts = new int[26]; //all lower case -> a = 97, z = 122
		int len = s.length();
		
		for (int i = len-1; i >= 0; i--) {
			int c = s.charAt(i) - 97;
			counts[c]++;
			
			BigInteger top = new BigInteger("0");
			for (int j = 0; j < c; j++) top = top.add(BigInteger.valueOf(counts[j]));
			top = top.multiply(factorial(n-i-1));

			bottom = bottom.multiply(BigInteger.valueOf(counts[c]));

			rank = rank.add(top.divide(bottom));
		}

		int r = rank.mod(BigInteger.valueOf(mod)).intValue();
		System.out.println(r);
	}

	private static BigInteger factorial (int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}
