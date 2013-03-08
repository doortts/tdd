package las;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class LookAndSayTest {

	@Test
	public void testGetSequence_1차() throws Exception {
		LookAndSay lookAndSay = new LookAndSay();
		List<Integer> initialList =  Arrays.asList( 1 );
		List<Integer> expectedList = Arrays.asList( 1, 1 );
		
		assertEquals("[1]의 다음 상태", expectedList.toString(), lookAndSay.getNextSequence(initialList).toString() );
	}
	
	@Test
	public void testGetSequence_2차() throws Exception {
		LookAndSay lookAndSay = new LookAndSay();
		List<Integer> initialList =  Arrays.asList( 1, 1 );
		List<Integer> expectedList = Arrays.asList( 2, 1 );
		
		assertEquals("[1, 1]의 다음 상태", expectedList.toString(), lookAndSay.getNextSequence(initialList).toString() );
	}
	
	@Test
	public void testGetSequence_3차() throws Exception {
		LookAndSay lookAndSay = new LookAndSay();
		List<Integer> initialList = Arrays.asList( 2, 1 );
		List<Integer> expectedList = Arrays.asList( 1, 2, 1, 1 );
		
		assertEquals("[2, 1]의 다음상태", expectedList.toString(), lookAndSay.getNextSequence(initialList).toString() );
	}
	
	@Test
	public void testGetSequence_4차() throws Exception {
		LookAndSay lookAndSay = new LookAndSay();
		List<Integer> initialList = Arrays.asList( 1, 2, 1, 1 );
		List<Integer> expectedList = Arrays.asList( 1, 1, 1, 2, 2, 1 );
		
		assertEquals("[1, 2, 1, 1]의 다음상태", expectedList.toString(), lookAndSay.getNextSequence(initialList).toString() );
	}
	
	@Test
	public void testGetSequence_5차() throws Exception {
		LookAndSay lookAndSay = new LookAndSay();
		List<Integer> initialList = Arrays.asList( 1, 1, 1, 2, 2, 1 );
		List<Integer> expectedList = Arrays.asList( 3, 1, 2, 2, 1, 1 );
		
		assertEquals("[1, 1, 1, 2, 2, 1]의 다음상태", expectedList.toString(), lookAndSay.getNextSequence(initialList).toString() );
	}
}