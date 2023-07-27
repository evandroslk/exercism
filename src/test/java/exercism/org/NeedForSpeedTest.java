package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NeedForSpeedTest {

	@Test
	void newRemoteControlCarHasNotDrivenAnyDistance() {
		int speed = 10;
		int batteryDrain = 2;
		var car = new NeedForSpeed(speed, batteryDrain);
		assertThat(car.distanceDriven()).isZero();
	}

	@Test
	void driveUntilBatteryIsDrained() {
		int speed = 2;
		int batteryDrain = 1;
		var car = new NeedForSpeed(speed, batteryDrain);
		for (var i = 0; i < 100; i++) {
			car.drive();
		}
		assertThat(car.batteryDrained()).isTrue();
	}

	@Test
	void nitroCarHasBatteryNotDrained() {
		var car = NeedForSpeed.nitro();
		assertThat(car.batteryDrained()).isFalse();
	}

	@Test
	void newRemoteControlCarBatteryIsNotDrained() {
		int speed = 15;
		int batteryDrain = 3;
		var car = new NeedForSpeed(speed, batteryDrain);
		assertThat(car.batteryDrained()).isFalse();
	}

	@Test
	void carCanFinishWithCarThatJustCannotFinish() {
		int speed = 3;
		int batteryDrain = 20;
		var car = new NeedForSpeed(speed, batteryDrain);
		int distance = 16;
		var race = new RaceTrack(distance);
		assertThat(race.carCanFinish(car)).isFalse();
	}

	@Test
	void driveIncreasesDistanceDrivenWithSpeed() {
		int speed = 5;
		int batteryDrain = 1;
		var car = new NeedForSpeed(speed, batteryDrain);
		car.drive();
		assertThat(car.distanceDriven()).isEqualTo(5);
	}

	@Test
	void carCanFinishWithCarThatCanEasilyFinish() {
		int speed = 10;
		int batteryDrain = 2;
		var car = new NeedForSpeed(speed, batteryDrain);
		int distance = 100;
		var race = new RaceTrack(distance);
		assertThat(race.carCanFinish(car)).isTrue();
	}

	@Test
	void driveDoesNotIncreaseDistanceDrivenWhenBatteryDrained() {
		int speed = 9;
		int batteryDrain = 50;
		var car = new NeedForSpeed(speed, batteryDrain);
		car.drive();
		car.drive();
		car.drive();
		assertThat(car.distanceDriven()).isEqualTo(18);
	}

	@Test
	void nitroHasCorrectBatteryDrain() {
		var car = NeedForSpeed.nitro();
		for (var i = 0; i < 24; i++) {
			car.drive();
		}
		assertThat(car.batteryDrained()).isFalse();
		car.drive();
		assertThat(car.batteryDrained()).isTrue();
	}

	@Test
	void carCanFinishWithCarThatCanJustFinish() {
		int speed = 2;
		int batteryDrain = 10;
		var car = new NeedForSpeed(speed, batteryDrain);
		int distance = 20;
		var race = new RaceTrack(distance);
		assertThat(race.carCanFinish(car)).isTrue();
	}

	@Test
	void nitroCarHasCorrectSpeed() {
		var car = NeedForSpeed.nitro();
		car.drive();
		assertThat(car.distanceDriven()).isEqualTo(50);
	}

	@Test
	void nitroCarHasNotDrivenAnyDistance() {
		var car = NeedForSpeed.nitro();
		assertThat(car.distanceDriven()).isZero();
	}

	@Test
	void carCanFinishWithCarThatCannotFinish() {
		int speed = 1;
		int batteryDrain = 20;
		var car = new NeedForSpeed(speed, batteryDrain);
		int distance = 678;
		var race = new RaceTrack(distance);
		assertThat(race.carCanFinish(car)).isFalse();
	}

	@Test
	void driveToAlmostDrainBattery() {
		int speed = 2;
		int batteryDrain = 1;
		var car = new NeedForSpeed(speed, batteryDrain);
		for (var i = 0; i < 99; i++) {
			car.drive();
		}
		assertThat(car.batteryDrained()).isFalse();
	}

}
