package exercism.org;

public class NeedForSpeed {

	private int speed;
	private int batteryDrain;
	private int distanceDriven;
	private int battery;

	public NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
		this.distanceDriven = 0;
		this.battery = 100;
	}

	public int distanceDriven() {
		return distanceDriven;
	}

	public void drive() {
		if (!batteryDrained()) {
			distanceDriven += speed;
			battery -= batteryDrain;
		}
	}

	public boolean batteryDrained() {
		return battery == 0;
	}

	public static NeedForSpeed nitro() {
		return new NeedForSpeed(50, 4);
	}

	public int getSpeed() {
		return speed;
	}

	public int getBatteryDrain() {
		return batteryDrain;
	}

}

class RaceTrack {

	private int distance;

	public RaceTrack(int distance) {
		this.distance = distance;
	}

	public boolean carCanFinish(NeedForSpeed car) {
		return (Math.ceil(this.distance / (double) car.getSpeed()) * car.getBatteryDrain()) <= 100;
	}

}
