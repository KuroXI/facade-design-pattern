package subsystem;

import service.HotelService;

public class HouseKeeping implements HotelService {
	private final String roomNumber;
	
	public HouseKeeping(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void cleanRoom(String roomNumber) {
		System.out.println("Cleaning room " + roomNumber);
	}
	
	@Override
	public void performService() {
		cleanRoom(roomNumber);
	}
}
