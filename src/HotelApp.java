import facade.FrontDesk;

import java.util.Scanner;

public class HotelApp {
	public static void main(String[] args) {
		FrontDesk hotelFacade = new FrontDesk();
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n1. Request Valet");
			System.out.println("2. Request Housekeeping");
			System.out.println("3. Request Cart");
			System.out.println("4. Exit\n");
			
			System.out.print("Enter your choice: ");
			
			int input = scanner.nextInt();
			switch (input) {
				case 1:
					System.out.print("Enter Plate Number: ");
					hotelFacade.requestPickUpVehicle(scanner.next());
					break;
				case 2:
					System.out.print("Enter Room Number: ");
					hotelFacade.requestRoomCleaning(scanner.next());
					break;
				case 3:
					System.out.print("Enter Number of Carts: ");
					hotelFacade.requestCarts(scanner.nextInt());
					break;
				case 4:
					System.out.println("Exit - John Victor Gonzales");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice");
					break;
			}
		} while (true);
	}
}
