package basic.changed;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CloserToZeroTest {

	CloserToZero closerToZero;

	@Before
	public void setUp() {
		closerToZero = new CloserToZero();
	}

	@Test
	public void testGetClosestToZero_모두양수() {
		int [] source = new int[]{ 2, 3, 4, 1 };
		assertEquals(1, closerToZero.getClosestToZero(source));
	}

	@Test
	public void testGetClosestToZero_모두음수() {
		int [] source = new int[]{ -6, -2, -3, -4 };
		assertEquals(-2, closerToZero.getClosestToZero(source));
	}

	@Test
	public void testGetClosestToZero_음수양수혼합() {
		int [] source = new int[]{ -10, -3, 4 };
		assertEquals(-3, closerToZero.getClosestToZero(source));
	}

	@Test
	public void testGetClosestToZero_동일거리에서는_양수값을_선택_음수먼저시작() {
		int [] source = new int[]{ -3, -4, 3, 4, 5 };
		assertEquals(3, closerToZero.getClosestToZero(source));
	}

	@Test
	public void testGetClosestToZero_동일거리에서는_양수값을_선택_양수먼저시작() {
		int [] source = new int[]{ 3, 4, -3, -4, 5 };
		assertEquals(3, closerToZero.getClosestToZero(source));
	}
	@Test
	public void testGetClosestToZero_영_포함() {
		int [] source = new int[]{ 3, 4, 5, 0 };
		assertEquals(0, closerToZero.getClosestToZero(source));
	}

}