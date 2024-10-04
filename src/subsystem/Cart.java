package subsystem;

import service.HotelService;

public class Cart implements HotelService {
	private final int numberOfCarts;
	
	public Cart(int numberOfCarts) {
		this.numberOfCarts = numberOfCarts;
	}
	
	public void requestCart(int numberOfCarts) {
		System.out.println("Requesting " + numberOfCarts + " luggage carts");
	}
	
	@Override
	public void performService() {
		requestCart(numberOfCarts);
	}
}
