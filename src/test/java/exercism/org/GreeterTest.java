package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
	void testThatGreeterReturnsTheCorrectGreeting() {
		assertThat(new Greeter().getGreeting()).isEqualTo("Hello World!");
	}

}
