package exercism.org;

public class Lasagna {

	private static final int EXPECTED_MINUTES_OVEN = 40;
	private static final int EXPECTED_MINUTES_TO_PREPARE_LAYER = 2;

	public int expectedMinutesInOven() {
		return EXPECTED_MINUTES_OVEN;
	}

	public int remainingMinutesInOven(int time) {
		return expectedMinutesInOven() - time;
	}

	public int preparationTimeInMinutes(int layers) {
		return layers * EXPECTED_MINUTES_TO_PREPARE_LAYER;
	}

	public int totalTimeInMinutes(int layers, int time) {
		return preparationTimeInMinutes(layers) + time;
	}

}
