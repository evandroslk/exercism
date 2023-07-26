package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BlackjackTest {

	Blackjack blackjack = new Blackjack();

	@Test
	void blackjackWithKingAceSecond() {
		assertThat(blackjack.isBlackjack("king", "ace")).isTrue();
	}

}
