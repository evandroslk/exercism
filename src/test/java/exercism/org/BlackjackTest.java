package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BlackjackTest {

	Blackjack blackjack = new Blackjack();

	@Test
	void blackjackWithKingAceSecond() {
		assertThat(blackjack.isBlackjack("king", "ace")).isTrue();
	}

	@Test
	void firstTurnWithAceAceAndDealerAce() {
		assertThat(blackjack.firstTurn("ace", "ace", "ace")).isEqualTo("P");
	}

	@Test
	void firstTurnWithTwoNineAndDealerQueen() {
		assertThat(blackjack.firstTurn("two", "nine", "queen")).isEqualTo("H");
	}

	@Test
	void firstTurnWithKingSevenAndDealerAce() {
		assertThat(blackjack.firstTurn("king", "seven", "ace")).isEqualTo("S");
	}

	@Test
	void firstTurnWithTwoTenAndDealerQueen() {
		assertThat(blackjack.firstTurn("two", "ten", "queen")).isEqualTo("H");
	}

	@Test
	void firstTurnWithTwoTenAndDealerSeven() {
		assertThat(blackjack.firstTurn("two", "ten", "seven")).isEqualTo("H");
	}

	@Test
	void firstTurnWithKingTenAndDealerAce() {
		assertThat(blackjack.firstTurn("king", "ten", "ace")).isEqualTo("S");
	}

	@Test
	void firstTurnWithFourTenAndDealerQueen() {
		assertThat(blackjack.firstTurn("four", "ten", "queen")).isEqualTo("H");
	}

	@Test
	void firstTurnWithFourTenAndDealerSeven() {
		assertThat(blackjack.firstTurn("four", "ten", "seven")).isEqualTo("H");
	}

	@Test
	void correctParsesEight() {
		assertThat(blackjack.parseCard("eight")).isEqualTo(8);
	}

	@Test
	void correctParsesQueen() {
		assertThat(blackjack.parseCard("queen")).isEqualTo(10);
	}

	@Test
	void correctParsesSeven() {
		assertThat(blackjack.parseCard("seven")).isEqualTo(7);
	}

	@Test
	void correctParsesThree() {
		assertThat(blackjack.parseCard("three")).isEqualTo(3);
	}

	@Test
	void firstTurnWithJackJackAndDealerAce() {
		assertThat(blackjack.firstTurn("jack", "jack", "ace")).isEqualTo("S");
	}

	@Test
	void firstTurnWithFiveTenAndDealerKing() {
		assertThat(blackjack.firstTurn("five", "ten", "king")).isEqualTo("H");
	}

	@Test
	void firstTurnWithEightTenAndDealerAce() {
		assertThat(blackjack.firstTurn("eight", "ten", "ace")).isEqualTo("S");
	}

	@Test
	void blackjackWithJackAceSecond() {
		assertThat(blackjack.isBlackjack("jack", "ace")).isTrue();
	}

	@Test
	void firstTurnWithSixTenAndDealerAce() {
		assertThat(blackjack.firstTurn("six", "ten", "ace")).isEqualTo("H");
	}

	@Test
	void firstTurnWithSixTenAndDealerSix() {
		assertThat(blackjack.firstTurn("six", "ten", "six")).isEqualTo("S");
	}

	@Test
	void firstTurnWithThreeTenAndDealerSix() {
		assertThat(blackjack.firstTurn("three", "ten", "six")).isEqualTo("S");
	}

	@Test
	void noBlackjackWithTwoFigures() {
		assertThat(blackjack.isBlackjack("queen", "jack")).isFalse();
	}

	@Test
	void firstTurnWithTwoTwoAndDealerAce() {
		assertThat(blackjack.firstTurn("two", "two", "ace")).isEqualTo("H");
	}

	@Test
	void firstTurnWithAceKingAndDealerQueen() {
		assertThat(blackjack.firstTurn("ace", "king", "queen")).isEqualTo("S");
	}

	@Test
	void firstTurnWithTwoEightAndDealerTwo() {
		assertThat(blackjack.firstTurn("two", "eight", "two")).isEqualTo("H");
	}

	@Test
	void firstTurnWithKingKingAndDealerAce() {
		assertThat(blackjack.firstTurn("king", "king", "ace")).isEqualTo("S");
	}

	@Test
	void firstTurnWithJackAceAndDealerAce() {
		assertThat(blackjack.firstTurn("jack", "ace", "ace")).isEqualTo("S");
	}

	@Test
	void firstTurnWithFiveFiveAndAce() {
		assertThat(blackjack.firstTurn("five", "five", "ace")).isEqualTo("H");
	}

	@Test
	void noBlackjackWithKingAndFive() {
		assertThat(blackjack.isBlackjack("king", "five")).isFalse();
	}

	@Test
	void firstTurnWithTwoTenAndDealerSix() {
		assertThat(blackjack.firstTurn("two", "ten", "six")).isEqualTo("S");
	}

	@Test
	void firstTurnWithFiveTenAndDealerSeven() {
		assertThat(blackjack.firstTurn("five", "ten", "seven")).isEqualTo("H");
	}

	@Test
	void blackjackWithTenAceSecond() {
		assertThat(blackjack.isBlackjack("ten", "ace")).isTrue();
	}

	@Test
	void firstTurnWithTwoTwoAndDealerFive() {
		assertThat(blackjack.firstTurn("two", "two", "five")).isEqualTo("H");
	}

	@Test
	void firstTurnWithFourTenAndDealerSix() {
		assertThat(blackjack.firstTurn("four", "ten", "six")).isEqualTo("S");
	}

	@Test
	void noBlackjackWithTwoAces() {
		assertThat(blackjack.isBlackjack("ace", "ace")).isFalse();
	}

	@Test
	void correctParsesAce() {
		assertThat(blackjack.parseCard("ace")).isEqualTo(11);
	}

	@Test
	void correctParsesSix() {
		assertThat(blackjack.parseCard("six")).isEqualTo(6);
	}

	@Test
	void correctParsesTen() {
		assertThat(blackjack.parseCard("ten")).isEqualTo(10);
	}

	@Test
	void correctParsesTwo() {
		assertThat(blackjack.parseCard("two")).isEqualTo(2);
	}

	@Test
	void firstTurnWithNineTenAndDealerAce() {
		assertThat(blackjack.firstTurn("nine", "ten", "ace")).isEqualTo("S");
	}

	@Test
	void firstTurnWithKingAceAndDealerNine() {
		assertThat(blackjack.firstTurn("king", "ace", "nine")).isEqualTo("W");
	}

	@Test
	void blackjackWithQueenAceSecond() {
		assertThat(blackjack.isBlackjack("queen", "ace")).isTrue();
	}

	@Test
	void correctParsesFive() {
		assertThat(blackjack.parseCard("five")).isEqualTo(5);
	}

	@Test
	void correctParsesFour() {
		assertThat(blackjack.parseCard("four")).isEqualTo(4);
	}

	@Test
	void correctParsesJack() {
		assertThat(blackjack.parseCard("jack")).isEqualTo(10);
	}

	@Test
	void correctParsesKing() {
		assertThat(blackjack.parseCard("king")).isEqualTo(10);
	}

	@Test
	void correctParsesNine() {
		assertThat(blackjack.parseCard("nine")).isEqualTo(9);
	}

	@Test
	void firstTurnWithSixTenAndDealerSeven() {
		assertThat(blackjack.firstTurn("six", "ten", "seven")).isEqualTo("H");
	}

	@Test
	void firstTurnWithTenAceAndDealerFive() {
		assertThat(blackjack.firstTurn("ten", "ace", "five")).isEqualTo("W");
	}

	@Test
	void firstTurnWithFiveTenAndDealerSix() {
		assertThat(blackjack.firstTurn("five", "ten", "six")).isEqualTo("S");
	}

	@Test
	void firstTurnWithTwoThreeAndDealerQueen() {
		assertThat(blackjack.firstTurn("two", "three", "queen")).isEqualTo("H");
	}

	@Test
	void noBlackjackWithEightAndFive() {
		assertThat(blackjack.isBlackjack("eight", "five")).isFalse();
	}

	@Test
	void firstTurnWithThreeTenAndDealerQueen() {
		assertThat(blackjack.firstTurn("three", "ten", "queen")).isEqualTo("H");
	}

	@Test
	void firstTurnWithThreeTenAndDealerSeven() {
		assertThat(blackjack.firstTurn("three", "ten", "seven")).isEqualTo("H");
	}

	@Test
	void noBlackjackWithFive() {
		assertThat(blackjack.isBlackjack("ace", "five")).isFalse();
	}

	@Test
	void noBlackjackWithNine() {
		assertThat(blackjack.isBlackjack("ace", "nine")).isFalse();
	}

	@Test
	void otherCardParsesToZero() {
		assertThat(blackjack.parseCard("other")).isZero();
	}

}
