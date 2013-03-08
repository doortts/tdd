package main.ishop;


import java.util.ArrayList;
import java.util.List;


public class User {

	private String id;
	private List<ICoupon> coupons;
	
	public User(String id) {
		this.id = id;
		this.coupons = new ArrayList();
	}

	public int getTotalCouponCount() {
		return this.coupons.size();
	}

	public void addCoupon(ICoupon coupon) {
		
	}

	public ICoupon getLastOccupiedCoupon() {
		// TODO Auto-generated method stub
		return null;
	}
}
