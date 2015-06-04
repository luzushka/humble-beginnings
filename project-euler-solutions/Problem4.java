/* Luzushka's Project Euler solutions
 * Problem 4
 * Find me at:
 * https://www.github.com/luzushka/
 * <3
 */

public class Problem4 {
	public static boolean isPalindrome (int number){
		String conversion = Integer.toString(number);
		int len = conversion.length();
		for (int i=0;i<(int)len/2;i++){
			
			if (conversion.charAt(i)!=conversion.charAt(len-1-i)) return false;
		}
		return true;
		
	}
	
	public static int findMaxPalindrome (){
		int curmax=0;
		for (int a=999;a>0;a--) {
			for (int b=999;b>0;b--)
			{
				if (isPalindrome(a*b)){
					if (a*b>curmax) curmax=a*b;
				}
			}
		}
		return curmax;
	}
	
	public static void main (String[] args) {
		System.out.println (findMaxPalindrome());
	}
	
}
