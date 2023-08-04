package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CarsAssembleTest {
	
	private static CarsAssemble carsAssemble;

	@BeforeAll
	static void setUp() {
		carsAssemble = new CarsAssemble();
	}

	@Test
	void workingItemsPerMinuteForSpeedFive() {
		assertThat(carsAssemble.workingItemsPerMinute(5)).isEqualTo(16);
	}

	@Test
	void workingItemsPerMinuteForSpeedNine() {
		assertThat(carsAssemble.workingItemsPerMinute(9)).isEqualTo(26);
	}

	@Test
	void workingItemsPerMinuteForSpeedZero() {
		assertThat(carsAssemble.workingItemsPerMinute(0)).isZero();
	}

	@Test
	void workingItemsPerMinuteForSpeedEight() {
		assertThat(carsAssemble.workingItemsPerMinute(8)).isEqualTo(26);
	}

	@Test
	void productionRatePerHourForSpeedSeven() {
		assertThat(carsAssemble.productionRatePerHour(7)).isEqualTo(1392.3);
	}

	@Test
	void workingItemsPerMinuteForSpeedOne() {
		assertThat(carsAssemble.workingItemsPerMinute(1)).isEqualTo(3);
	}

	@Test
	void workingItemsPerMinuteForSpeedTen() {
		assertThat(carsAssemble.workingItemsPerMinute(10)).isEqualTo(28);
	}

	@Test
	void productionRatePerHourForSpeedOne() {
		assertThat(carsAssemble.productionRatePerHour(1)).isEqualTo(221.0);
	}

	@Test
	void productionRatePerHourForSpeedTen() {
		assertThat(carsAssemble.productionRatePerHour(10)).isEqualTo(1701.7);
	}

	@Test
	void productionRatePerHourForSpeedFour() {
		assertThat(carsAssemble.productionRatePerHour(4)).isEqualTo(884.0);
	}

	@Test
	void productionRatePerHourForSpeedNine() {
		assertThat(carsAssemble.productionRatePerHour(9)).isEqualTo(1591.2);
	}

	@Test
	void productionRatePerHourForSpeedZero() {
		assertThat(carsAssemble.productionRatePerHour(0)).isEqualTo(0.0);
	}

}
