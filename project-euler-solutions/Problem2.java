/* Luzushka's Project Euler solutions
 * Problem 2
 * Find me at:
 * https://wfww.github.com/luzushka/
 * <3
 */

public class Problem2{ 
	public static int Fibonacci (int limit) //fibonacci only
	{
		if (limit==0) return 0;
		if (limit==1) return 1;
		else return (Fibonacci(limit-1)+Fibonacci(limit-2));
	}
	public static void main (String[] args){ //main func
		int sum=0;
		for (int i=0;i<=33;i++){
			int result=Fibonacci(i);
			if (result%2==0) sum+=result;
		}
		System.out.println (sum);
	}
}
