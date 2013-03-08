package main.ishop;


import java.util.ArrayList;
import java.util.List;

public class StubCoupon implements ICoupon {

	List<String> categoryList = new ArrayList();  
	private int isAppliableCallCount;

	@Override
	public boolean isAppliable(Item item) {
		isAppliableCallCount++;
		if( this.categoryList.contains( item.getCategory() )) {
			return true;
		}
		return false;
	}
	
	public int getIsAppliableCallCount(){
		return this.isAppliableCallCount;
	}

	public StubCoupon (){ 
		categoryList.add("Kitchen knife");
		categoryList.add("Kid toy");
		categoryList.add("Cooking Pot"); 
	}
	
	@Override
	public int getDiscountPercent() {
		return 7;
	}

	@Override
	public String getName() {
		return "VIP°í°´ ÇÑ°¡À§ °¨»çÄíÆù";
	}

	@Override
	public boolean isValid() {
		return true;
	}

	@Override
	public void doExpire() {
	}
}
