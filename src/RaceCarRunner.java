

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar car = new RaceCar("toyota", 5);
		// 2. Print the RaceCar's position in the race
		System.out.println(5);
		// 3. Crash the RaceCar
		car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		car.pit();
		// 5. Help the car move into first place.
		for(int i = 0; i < 7; i++) {
		car.overtake();
		}
	}

	private static void crash() {
		// TODO Auto-generated method stub
		
	}
}
