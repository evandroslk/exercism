package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void testNoMatches() {
		Anagram detector = new Anagram("diaper");
		assertThat(detector.match(Arrays.asList("hello", "world", "zombies", "pants")))
				.isEmpty();
	}

	@Test
	void testDetectMultipleAnagrams() {
		Anagram detector = new Anagram("master");
		assertThat(detector.match(Arrays.asList("stream", "pigeon", "maters")))
				.containsExactly("maters", "stream");
	}

	@Test
	void testEliminateAnagramSubsets() {
		Anagram detector = new Anagram("good");
		assertThat(detector.match(Arrays.asList("dog", "goody"))).isEmpty();
	}

	@Test
	void testDetectLongerAnagram() {
		Anagram detector = new Anagram("listen");
		assertThat(detector.match(Arrays.asList("enlists", "google", "inlets", "banana")))
				.containsExactly("inlets");
	}

	@Test
	void testDetectMultipleAnagramsForLongerWord() {
		Anagram detector = new Anagram("allergy");
		assertThat(
				detector.match(
						Arrays.asList(
								"gallery",
								"ballerina",
								"regally",
								"clergy",
								"largely",
								"leading")))
				.containsExactlyInAnyOrder("gallery", "regally", "largely");
	}

	@Test
	void testDetectsMultipleAnagramsWithDifferentCase() {
		Anagram detector = new Anagram("nose");
		assertThat(detector.match(Arrays.asList("Eons", "ONES")))
				.containsExactlyInAnyOrder("Eons", "ONES");
	}

	@Test
	void testEliminateAnagramsWithSameChecksum() {
		Anagram detector = new Anagram("mass");
		assertThat(detector.match(Collections.singletonList("last")))
				.isEmpty();
	}

	@Test
	void testCaseInsensitiveWhenBothAnagramAndSubjectStartWithUpperCaseLetter() {
		Anagram detector = new Anagram("Orchestra");
		assertThat(
				detector.match(
						Arrays.asList("cashregister", "Carthorse", "radishes")))
				.containsExactlyInAnyOrder("Carthorse");
	}

	@Test
	void testCaseInsensitiveWhenSubjectStartsWithUpperCaseLetter() {
		Anagram detector = new Anagram("Orchestra");
		assertThat(
				detector.match(
						Arrays.asList("cashregister", "carthorse", "radishes")))
				.containsExactlyInAnyOrder("carthorse");
	}

	@Test
	void testCaseInsensitiveWhenAnagramStartsWithUpperCaseLetter() {
		Anagram detector = new Anagram("orchestra");
		assertThat(
				detector.match(
						Arrays.asList("cashregister", "Carthorse", "radishes")))
				.containsExactlyInAnyOrder("Carthorse");
	}

	@Test
	void testIdenticalWordRepeatedIsNotAnagram() {
		Anagram detector = new Anagram("go");
		assertThat(detector.match(Collections.singletonList("go Go GO")))
				.isEmpty();
	}

	@Test
	void testAnagramMustUseAllLettersExactlyOnce() {
		Anagram detector = new Anagram("tapper");
		assertThat(detector.match(Collections.singletonList("patter")))
				.isEmpty();
	}

	@Test
	void testWordsAreNotAnagramsOfThemselvesCaseInsensitive() {
		Anagram detector = new Anagram("BANANA");
		assertThat(detector.match(Arrays.asList("BANANA", "Banana", "banana")))
				.isEmpty();
	}

	@Test
	void testWordsOtherThanThemselvesCanBeAnagrams() {
		Anagram detector = new Anagram("LISTEN");
		assertThat(detector.match(Arrays.asList("Listen", "Silent", "LISTEN")))
				.containsExactlyInAnyOrder("Silent");
	}

}
