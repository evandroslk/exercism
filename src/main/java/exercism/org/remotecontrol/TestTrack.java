package exercism.org.remotecontrol;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTrack {

	public static void race(RemoteControlCar remoteControlCar) {
		remoteControlCar.drive();
	}

	public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1, ProductionRemoteControlCar prc2) {
		List<ProductionRemoteControlCar> list = Arrays.asList(prc1, prc2);
		Collections.sort(list);
		return list;
	}

}
