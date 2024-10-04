package facade;

import subsystem.Cart;
import subsystem.HouseKeeping;
import subsystem.Valet;

public class FrontDesk {
	public void requestPickUpVehicle(String plateNumber) {
		Valet valet = new Valet(plateNumber);
		valet.performService();
	}
	
	public void requestRoomCleaning(String roomNumber) {
		HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
		houseKeeping.performService();
	}
	
	public void requestCarts(Integer numberOfCarts) {
		Cart cart = new Cart(numberOfCarts);
		cart.performService();
	}
}
