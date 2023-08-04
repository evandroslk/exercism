package exercism.org.remotecontrol;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class RemoteControlCarTest {

	@Test
	void race() {
		ProductionRemoteControlCar productionCar = new ProductionRemoteControlCar();
		ExperimentalRemoteControlCar experimentalCar = new ExperimentalRemoteControlCar();
		TestTrack.race((RemoteControlCar) productionCar);
		TestTrack.race((RemoteControlCar) productionCar);
		TestTrack.race((RemoteControlCar) experimentalCar);
		TestTrack.race((RemoteControlCar) experimentalCar);
		assertThat(experimentalCar.getDistanceTravelled() - productionCar.getDistanceTravelled()).isEqualTo(20);
	}

	@Test
	void rankCars() {
		ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
		ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
		prc1.setNumberOfVictories(3);
		prc2.setNumberOfVictories(2);
		List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(prc1, prc2);
		assertThat(rankings.get(1)).isEqualTo(prc1);
	}

	@Test
	void ensureCarsAreComparables() {
		assertThat(RemoteControlCar.class).isAssignableFrom(ProductionRemoteControlCar.class);
	}

}
