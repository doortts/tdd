package basic.changed;
import java.util.*;

public class PrimeNumber {

	public static List<Integer> getPrimeNumbers(int from, int to) {
		/*
		 * 	주어진 범위내에서 소수를 구하시요.
		 * 	소수란 1과 자신이외의 숫자로는 나누어지지 않는 숫자를 뜻한다.
		 *  예: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67...]
		 */
		List<Integer> list = new ArrayList<Integer>();
		int divideCount = 0;
		for( int i = from; i <= to; i++) {
			for (int j=1; j<=i; j++){
				if( ((double)i)/((double)j) == (double)(i/j) ) {
					divideCount++;
				}
			}
			if ( divideCount == 2) {
				list.add(i);
			}
			divideCount = 0;
		}
		return list;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println( getPrimeNumbers(2, 20000) );
		System.out.println( "실행시간: " + (System.currentTimeMillis() - start)/1000 );
	}

}