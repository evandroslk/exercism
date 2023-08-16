package exercism.org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	private String givenWord;
	private List<Character> charactersOfGivenWord;

	public Anagram(String word) {
		this.givenWord = word.toUpperCase();
		charactersOfGivenWord = this.givenWord.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
	}

	public List<String> match(List<String> candidatesList) {
		return candidatesList.stream().filter(this::isAnagram).sorted().collect(Collectors.toList());
	}

	private boolean isAnagram(String candidateWord) {
		candidateWord = candidateWord.toUpperCase();

		if (candidateWord.equals(this.givenWord)) {
			return false;
		}

		List<Character> temporaryCharactersOfGivenWord = new ArrayList<>(charactersOfGivenWord);
		List<Character> charactersOfCandidateWord = candidateWord.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		for (Character c : candidateWord.toCharArray()) {
			if (temporaryCharactersOfGivenWord.contains(c)) {
				temporaryCharactersOfGivenWord.remove(c);
				charactersOfCandidateWord.remove(c);
			}
		}
		return temporaryCharactersOfGivenWord.isEmpty() && charactersOfCandidateWord.isEmpty();
	}

}
