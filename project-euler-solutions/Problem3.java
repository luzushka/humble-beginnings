/* Luzushka's Project Euler solutions
 * Problem 3
 * Find me at:
 * https://www.github.com/luzushka/
 * <3
 */

public class Problem3{
	
	public static boolean isPrime (long numbah){
		boolean flag=true;
		for (long i=2;i<numbah&&(flag==true);i++)
		{
			if (numbah%i==0 && numbah!=i) flag=false;
			
		}
		return flag;
		
	}
	
	public static long findMaxPrimeFactor(long num){
		//boolean fleg=false;
		for (long i=num;i>0;i--){
			if (num%i==0 && num!=i){
				if (isPrime(i)) return i;
				
			}
		}
		return -1;
	
	}
	
	
	public static void main (String[] args){
		System.out.println (findMaxPrimeFactor(600851475143L));
	}

}
