package basic.changed;

public class CloserToZero {
    public int getClosestToZero(int[] a) {
        /*
		배열내에서 숫자 0에 가장 가까운 숫자를 반환한다.
		단, 두 숫자의 거리가 같은 경우, 이를테면 2와 -2같은 경우에는
		양수가 0에 더 가깝다고 판단한다.
         */
    	int closerNumberToZero=a[0];

    	for (int oneOfArray : a) {
    		if( 왼쪽숫자가_영에_더_가깝다(closerNumberToZero, oneOfArray)
    				|| 두_숫자의_절대값은_같지만_왼쪽숫자가_음수이다(closerNumberToZero, oneOfArray) ) {
    			closerNumberToZero = oneOfArray;
    		}
		}

    	return closerNumberToZero;
    }

	private boolean 두_숫자의_절대값은_같지만_왼쪽숫자가_음수이다(int closerNumberToZero, int i) {
		return closerNumberToZero+i == 0 && closerNumberToZero<0;
	}

	private boolean 왼쪽숫자가_영에_더_가깝다(int closerNumberToZero, int i) {
		return (Math.abs(closerNumberToZero) - Math.abs(i)) > 0;
	}
}