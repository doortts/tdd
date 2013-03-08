package main.ishop;


public class DummyCoupon implements ICoupon {

	@Override
	public int getDiscountPercent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean isAppliable(Item item) {
		return true;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doExpire() {
		// TODO Auto-generated method stub
	}
}
