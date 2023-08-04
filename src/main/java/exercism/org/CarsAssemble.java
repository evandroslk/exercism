package exercism.org;

public class CarsAssemble {

	private static final int CARS_PRODUCED_IN_A_HOUR_AT_SPEED_1 = 221;

	public double productionRatePerHour(int speed) {
		if (speed == 0) {
			return 0;
		} else if (speed > 0 && speed <= 4) {
			return getTotalProduction(speed);
		} else if (speed >= 5 && speed <= 8) {
			return getTotalProduction(speed) * 0.9;
		} else if (speed == 9) {
			return getTotalProduction(speed) * 0.8;
		} else if (speed == 10) {
			return getTotalProduction(speed) * 0.77;
		} else {
			throw new IllegalArgumentException("Speed not allowed");
		}

	}

	private int getTotalProduction(int speed) {
		return speed * CARS_PRODUCED_IN_A_HOUR_AT_SPEED_1;
	}

	public double workingItemsPerMinute(int speed) {
		return Math.floor(productionRatePerHour(speed) / 60);
	}

}
