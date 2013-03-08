package test.ishop;



import static org.junit.Assert.*;

import main.ishop.ICoupon;
import main.ishop.Item;
import main.ishop.PriceCalculator;
import main.ishop.StubCoupon;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PriceCalculatorTest {

	@Test
	public void testGetOrderPrice_discountableItem() throws Exception {
		PriceCalculator calculator = new PriceCalculator();
		Item item = new Item("LightSavor","Kitchen knife",100000);
		ICoupon coupon = new StubCoupon();

		assertEquals("쿠폰으로 인해 할인된 가격", 93000, 
				calculator.getOrderPrice(item, coupon));
		assertEquals("coupon.isAppliable 메소드 호출 횟수", 
				1,((StubCoupon)coupon).getIsAppliableCallCount() );
	}


	@Test
	public void testGetOrderPrice_undiscountableItem() throws Exception {
		PriceCalculator calculator = new PriceCalculator();
		Item item = new Item("R2D2","Alarm Watch",20000);
		ICoupon coupon = new StubCoupon();

		assertEquals("쿠폰 적용 안되는 아이템", 20000, 
				calculator.getOrderPrice(item, coupon));
	}
}