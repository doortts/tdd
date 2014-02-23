package las.changed;

import java.util.*;

public class LookAndSay {

	/* Look-and-say sequence
	 * 읽고 말하기 수열은 다음과 같이 시작하는 수열이다. 
	 * 대한민국에서는 소설 개미에서 소개되면서 유명해졌기 때문에, 개미 수열이란 이름으로 잘 알려져 있다.
	 *  
	 *  1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, ...
	 *  
	 * 1을 "1개의 1"로 읽는다: 11
	 * 11을 "2개의 1"로 읽는다: 21
	 * 21을 "1개의 2와, 1개의 1"로 읽는다: 1211
	 * 1211을 "1개의 1과, 1개의 2와, 2개의 1"로 읽는다: 111221
	 * 111221을 "3개의 1과, 2개의 2와, 1개의 1"로 읽는다: 312211
	 * 312211을 "1개의 3과, 1개의 1과, 2개의 2와, 2개의 1"로 읽는다: 13112221
	 * 
	 *  - from wikipedia
	 */

	public List<Integer> getNextSequence(List<Integer> initialList) {

		int frequency = 0;
		int currentNumber = 0;
		List<Integer> result = new ArrayList<Integer>();

		for (int newNumber : initialList) {
			if ( isNewSequenceStarted(currentNumber, newNumber) 
					&& notAFirstNumberOfSequence(frequency) ){
				addSequenceToResult(frequency, currentNumber, result);
				frequency=1;
			} else {
				frequency++;	
			}
			currentNumber = newNumber;
		}
		addSequenceToResult(frequency, currentNumber, result);

		return result;
	}

	private void addSequenceToResult(int frequency, int currentNumber,
			List<Integer> result) {
		result.add(frequency);
		result.add(currentNumber);
	}

	private boolean notAFirstNumberOfSequence(int frequency) {
		return frequency != 0;
	}

	private boolean isNewSequenceStarted(int currentNumber, int newNumber) {
		return currentNumber != newNumber;
	}
}