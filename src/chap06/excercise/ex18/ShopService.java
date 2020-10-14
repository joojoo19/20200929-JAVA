package chap06.excercise.ex18;

public class ShopService {
	
	private final static ShopService shopService = new ShopService();
	
	private ShopService() {}

	public static ShopService getInstance() {
		
		return shopService;
	}

}
