/* Luzushka's Project Euler solutions
 * Problem 1
 * Find me at:
 * https://www.github.com/luzushka/
 * <3
 */




public class Problem1 {
	public static void main (String[] args){
		int sum=0;
		for (int i=0;i<1000;i+=5){
			if (i%3!=0){
				 sum+=i;
				 System.out.println (i);
			 }
		}
		System.out.println ("Sum after all fives: " +sum);
		for (int j=0;j<1000;j+=3){
			
			sum+=j;
			System.out.println(j);
			
		}
		System.out.println ("Final sum: "+sum);
	}
}
