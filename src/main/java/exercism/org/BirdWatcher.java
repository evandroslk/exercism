package exercism.org;

import java.util.Arrays;

public class BirdWatcher {

	private static final int[] LAST_WEEK_BIRDS = { 0, 2, 5, 3, 7, 8, 4 };

	private int[] birdsPerDay;

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay;
	}

	public int[] getLastWeek() {
		return LAST_WEEK_BIRDS;
	}

	public int getBusyDays() {
		return (int) Arrays.stream(birdsPerDay).filter(v -> v >= 5).count();
	}

	public int getToday() {
		return birdsPerDay.length > 0 ? birdsPerDay[birdsPerDay.length - 1] : 0;
	}

	public boolean hasDayWithoutBirds() {
		return Arrays.stream(birdsPerDay).filter(v -> v > 0).count() != 7;
	}

	public int getCountForFirstDays(int firstDays) {
		return Arrays.stream(birdsPerDay).limit(firstDays).sum();
	}

	public void incrementTodaysCount() {
		birdsPerDay[birdsPerDay.length - 1]++;
	}

}
