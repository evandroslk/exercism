package exercism.org;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {

	private static final int BLACKJACK_SUM = 21;
	private static final String SPLIT = "P";
	private static final String HIT = "H";
	private static final String STAND = "S";
	private static final String WIN = "W";
	private static Map<String, Integer> cards = new HashMap<>();

	public Blackjack() {
		cards.put("ace", 11);
		cards.put("two", 2);
		cards.put("three", 3);
		cards.put("four", 4);
		cards.put("five", 5);
		cards.put("six", 6);
		cards.put("seven", 7);
		cards.put("eight", 8);
		cards.put("nine", 9);
		cards.put("ten", 10);
		cards.put("jack", 10);
		cards.put("queen", 10);
		cards.put("king", 10);
	}

	public int parseCard(String card) {
		return cards.containsKey(card) ? cards.get(card) : 0;
	}

	private String largeHand(boolean isBlackjack, int dealerScore) {
		if (!isBlackjack) {
			return SPLIT;
		} else if (dealerScore < 10) {
			return WIN;
		} else {
			return STAND;
		}
	}

	private String smallHand(int handScore, int dealerScore) {
		if (handScore >= 17) {
			return STAND;
		} else if (handScore <= 11) {
			return HIT;
		} else if (dealerScore >= 7) {
			return HIT;
		} else {
			return STAND;
		}
	}

	public boolean isBlackjack(String card1, String card2) {
		return parseCard(card1) + parseCard(card2) == BLACKJACK_SUM;
	}

	public String firstTurn(String card1, String card2, String dealerCard) {
		int handScore = parseCard(card1) + parseCard(card2);
		int dealerScore = parseCard(dealerCard);
		if (20 < handScore) {
			return largeHand(isBlackjack(card1, card2), dealerScore);
		} else {
			return smallHand(handScore, dealerScore);
		}
	}

}
