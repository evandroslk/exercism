package exercism.org.remotecontrol;

public class ExperimentalRemoteControlCar implements RemoteControlCar {

	private int distance = 0;
	
	@Override
	public int getDistanceTravelled() {
		return distance;
	}

	@Override
	public void drive() {
		distance += 20;
	}

}
