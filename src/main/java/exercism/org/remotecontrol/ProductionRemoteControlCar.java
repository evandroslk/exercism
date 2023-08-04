package exercism.org.remotecontrol;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

	private int distance = 0;
	private int numberOfVictories = 0;

	@Override
	public int getDistanceTravelled() {
		return distance;
	}

	@Override
	public void drive() {
		distance += 10;
	}

	public int getNumberOfVictories() {
		return numberOfVictories;
	}

	public void setNumberOfVictories(int numberOfVictories) {
		this.numberOfVictories = numberOfVictories;
	}

	@Override
	public int compareTo(ProductionRemoteControlCar o) {
		return Integer.compare(getNumberOfVictories(), o.getNumberOfVictories());
	}


}
