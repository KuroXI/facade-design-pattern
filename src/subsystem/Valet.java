package subsystem;

import service.HotelService;

public class Valet implements HotelService {
	private final String plateNumber;
	
	public Valet(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public void pickUpVehicle(String plateNumber) {
		System.out.println("Picking up vehicle with plate number " + plateNumber);
	}
	
	@Override
	public void performService() {
		pickUpVehicle(plateNumber);
	}
}
