package test.ishop;


import static org.junit.Assert.*;

import main.ishop.DummyCoupon;
import main.ishop.ICoupon;
import main.ishop.StubCoupon;
import main.ishop.User;

import org.junit.Test;


public class UserTest {

	@Test
	public void testAddCoupon() throws Exception {
		User user = new User("area88");
		assertEquals("최초 쿠폰 수", 0, user.getTotalCouponCount() );

		ICoupon coupon = new DummyCoupon();

		user.addCoupon( coupon );
		assertEquals("쿠폰 수령 후", 1, user.getTotalCouponCount() );
	}

	@Test
	public void testGetLastOccupiedCoupon() throws Exception {
		User user = new User("area88");
		ICoupon eventCoupon = new StubCoupon();
		user.addCoupon(eventCoupon);
		ICoupon lastCoupon = user.getLastOccupiedCoupon();

		assertEquals("쿠폰 할인율", 7, lastCoupon.getDiscountPercent());
		assertEquals("쿠폰 이름", "VIP고객 한가위 감사쿠폰", lastCoupon.getDiscountPercent());
	}
}