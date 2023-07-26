package exercism.org;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {

	private static final int BLACKJACK_SUM = 21;
	private static Map<String, Integer> cards = new HashMap<>();

	public Blackjack() {
		cards.put("ace", 11);
		cards.put("two", 2);
		cards.put("three", 3);
		cards.put("four", 4);
		cards.put("five", 5);
		cards.put("six", 6);
		cards.put("sevem", 7);
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

	public boolean isBlackjack(String card1, String card2) {
		return cards.getOrDefault(card1, 0) + cards.getOrDefault(card2, 0) == BLACKJACK_SUM;
	}

}
