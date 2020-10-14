package myEx.chapex.chap06.ex18;

public class ShopService {
	private static ShopService shopService = new ShopService();
	
	private ShopService() {}

	public static ShopService getInstance() {
		return shopService;
	}

}
