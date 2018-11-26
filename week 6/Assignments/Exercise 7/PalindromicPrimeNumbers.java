public class PalindromicPrimeNumbers {

	public static void main(String[] args) {

		String palindromicPrime = "";
		int newLineCount = 0;

		for(int i = 1; i <= 10000; i++) {
			if(isPrime(i) && isPalindrome(i)) {
				palindromicPrime += Integer.toString(i) + "\t";
						newLineCount++;
					}

			if (newLineCount == 4) {
				palindromicPrime += "\n";
				newLineCount = 0;
			}

		}
		
		System.out.println("Palindromic Prime Numbers \n\n" + palindromicPrime);

	}

	public static boolean isPrime(int n) {

		if (n < 2) {
			return false;
			}
		if (n == 2) {
			return true;
			}
		if (n % 2 == 0)
			return false;
		for(int i=3; i * i <= n; i +=2) {
			if (n % i == 0)
				return false;
			}
		return true;
	}

	public static boolean isPalindrome (int n) {
		int palindrome = n;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
			}
		if (n == reverse) {
			return true;
		}
	return false;
	}
}