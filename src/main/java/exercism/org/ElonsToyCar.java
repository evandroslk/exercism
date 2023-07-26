package exercism.org;

public class ElonsToyCar {

	private static final int DISTANCE_INCREASE = 20;
	private static final int BATTERY_LOSS = 1;
	private int distanceDriven;
	private int batteryPercentage;

	public ElonsToyCar() {
		this.distanceDriven = 0;
		this.batteryPercentage = 100;
	}

	public static ElonsToyCar buy() {
		return new ElonsToyCar();
	}

	public String distanceDisplay() {
		return String.format("Driven %d meters", distanceDriven);
	}

	public void drive() {
		if (batteryPercentage > 0) {
			distanceDriven += DISTANCE_INCREASE;
			batteryPercentage -= BATTERY_LOSS;
		}
	}

	public String batteryDisplay() {
		return batteryPercentage > 0 ? String.format("Battery at %d%%", batteryPercentage) : "Battery empty";
	}

}
