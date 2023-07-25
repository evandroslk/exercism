package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LasagnaTest {

	@Test
	void total_time_in_minutes_for_multiple_layers() {
		assertThat(new Lasagna().totalTimeInMinutes(4, 8)).isEqualTo(16);
	}

	@Test
	void total_time_int_minutes_for_one_layer() {
		assertThat(new Lasagna().totalTimeInMinutes(1, 30)).isEqualTo(32);
	}

	@Test
	void remaining_minutes_in_oven() {
		assertThat(new Lasagna().remainingMinutesInOven(25)).isEqualTo(15);
	}

	@Test
	void preparation_time_in_minutes_for_one_layer() {
		assertThat(new Lasagna().preparationTimeInMinutes(1)).isEqualTo(2);
	}

	@Test
	void expected_minutes_in_oven() {
		assertThat(new Lasagna().expectedMinutesInOven()).isEqualTo(40);
	}

	@Test
	void preparation_time_in_minutes_for_multiple_layers() {
		assertThat(new Lasagna().preparationTimeInMinutes(4)).isEqualTo(8);
	}

}
