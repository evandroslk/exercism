package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ElonsToyCarTest {

	@Test
	void buyNewCarReturnsInstance() {
		ElonsToyCar car = ElonsToyCar.buy();
		assertThat(car).isNotNull();
	}

	@Test
	void newCarDistanceDisplay() {
		ElonsToyCar car = ElonsToyCar.buy();
		assertThat(car.distanceDisplay()).isEqualTo("Driven 0 meters");
	}

	@Test
	void distanceDisplayAfterDrivingOnce() {
		ElonsToyCar car = ElonsToyCar.buy();
		car.drive();
		assertThat(car.distanceDisplay()).isEqualTo("Driven 20 meters");
	}

	@Test
	void batteryDisplayAfterDrivingOnce() {
		ElonsToyCar car = ElonsToyCar.buy();
		car.drive();
		assertThat(car.batteryDisplay()).isEqualTo("Battery at 99%");
	}

	@Test
	void distanceDisplayWhenBatteryEmpty() {
		ElonsToyCar car = ElonsToyCar.buy();
		for (int i = 0; i < 100; i++) {
			car.drive();
		}
		car.drive();
		assertThat(car.distanceDisplay()).isEqualTo("Driven 2000 meters");
	}

	@Test
	void batteryDisplayWhenBatteryEmpty() {
		ElonsToyCar car = ElonsToyCar.buy();
		for (int i = 0; i < 100; i++) {
			car.drive();
		}
		car.drive();
		assertThat(car.batteryDisplay()).isEqualTo("Battery empty");
	}

	@Test
	void batteryDisplayAfterDrivingMultipleTimes() {
		ElonsToyCar car = new ElonsToyCar();
		for (int i = 0; i < 23; i++) {
			car.drive();
		}
		assertThat(car.batteryDisplay()).isEqualTo("Battery at 77%");
	}

	@Test
	void buyNewCarReturnsNewCarEachTime() {
		ElonsToyCar car1 = ElonsToyCar.buy();
		ElonsToyCar car2 = ElonsToyCar.buy();
		assertThat(car1).isNotEqualTo(car2);
	}

	@Test
	void distanceDisplayAfterDrivingMultipleTimes() {
		ElonsToyCar car = new ElonsToyCar();
		for (int i = 0; i < 17; i++) {
			car.drive();
		}
		assertThat(car.distanceDisplay()).isEqualTo("Driven 340 meters");
	}

	@Test
	void newCarBatteryDisplay() {
		ElonsToyCar car = new ElonsToyCar();
		assertThat(car.batteryDisplay()).isEqualTo("Battery at 100%");
	}

}
