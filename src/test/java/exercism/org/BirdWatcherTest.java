package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BirdWatcherTest {

	private static final int DAY1 = 0, DAY2 = 2, DAY3 = 5, DAY4 = 3, DAY5 = 7, DAY6 = 8, TODAY = 4;
	private BirdWatcher birdWatcher = new BirdWatcher(new int[] { DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY });

	@Test
	void itShouldNotHaveBusyDays() {
		birdWatcher = new BirdWatcher(new int[] { 1, 2, 3, 3, 2, 1, 4 });
		assertThat(birdWatcher.getBusyDays()).isZero();
	}

	@Test
	void itShouldReturnZeroIfBirdWatcherLastWeekIsEmpty() {
		int[] lastWeekEmpty = new int[0];
		birdWatcher = new BirdWatcher(lastWeekEmpty);
		assertThat(birdWatcher.getToday()).isZero();
	}

	@Test
	void itShouldNotHaveDaysWithoutBirds() {
		birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
		assertThat(birdWatcher.hasDayWithoutBirds()).isFalse();
	}

	@Test
	void itTestGetLastWeek() {
		assertThat(birdWatcher.getLastWeek()).containsExactly(DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY);
	}

	@Test
	void itHasDayWithoutBirds() {
		assertThat(birdWatcher.hasDayWithoutBirds()).isTrue();
	}

	@Test
	void itTestGetCountForBusyDays() {
		assertThat(birdWatcher.getBusyDays()).isEqualTo(3);
	}

	@Test
	void itTestGetCountForFirstDays() {
		assertThat(birdWatcher.getCountForFirstDays(4)).isEqualTo(DAY1 + DAY2 + DAY3 + DAY4);
	}

	@Test
	void itTestGetToday() {
		assertThat(birdWatcher.getToday()).isEqualTo(TODAY);
	}

	@Test
	void itIncrementTodaysCount() {
		birdWatcher.incrementTodaysCount();
		assertThat(birdWatcher.getToday()).isEqualTo(TODAY + 1);
	}

	@Test
	void itTestGetCountForMoreDaysThanTheArraySize() {
		assertThat(birdWatcher.getCountForFirstDays(10)).isEqualTo(DAY1 + DAY2 + DAY3 + DAY4 + DAY5 + DAY6 + TODAY);
	}

}
