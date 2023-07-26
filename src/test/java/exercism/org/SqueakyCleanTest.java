package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SqueakyCleanTest {

	@Test
	void omitLowerCaseGreekLetters() {
		assertThat(SqueakyClean.clean("MyΟβιεγτFinder")).isEqualTo("MyΟFinder");
	}

	@Test
	void spaces() {
		assertThat(SqueakyClean.clean("my   Id")).isEqualTo("my___Id");
	}

	@Test
	void string() {
		assertThat(SqueakyClean.clean("àḃç")).isEqualTo("àḃç");
	}

	@Test
	void stringWithNoLetters() {
		assertThat(SqueakyClean.clean("\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00")).isEmpty();
	}

	@Test
	void ctrl() {
		assertThat(SqueakyClean.clean("my\0Id")).isEqualTo("myCTRLId");
	}

	@Test
	void empty() {
		assertThat(SqueakyClean.clean("")).isEmpty();
	}

	@Test
	void leadingAndTrailingSpaces() {
		assertThat(SqueakyClean.clean(" myId ")).isEqualTo("_myId_");
	}

	@Test
	void combineConversions() {
		assertThat(SqueakyClean.clean("9 -abcĐ\uD83D\uDE00ω\0")).isEqualTo("_AbcĐCTRL");
	}

	@Test
	void kebabToCamelCase() {
		assertThat(SqueakyClean.clean("à-ḃç")).isEqualTo("àḂç");
	}

	@Test
	void singleLetter() {
		assertThat(SqueakyClean.clean("A")).isEqualTo("A");
	}

}
