package exercism.org;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
	
	private List<String> languages = new ArrayList<>();

	public void addLanguage(String language) {
		languages.add(language);
	}

	public boolean containsLanguage(String language) {
		return languages.contains(language);
	}

	public int count() {
		return languages.size();
	}

	public boolean isExciting() {
		return languages.contains("Java") || languages.contains("Kotlin");
	}

	public boolean isEmpty() {
		return languages.isEmpty();
	}

	public String firstLanguage() {
		return languages.get(0);
	}

	public void removeLanguage(String language) {
		languages.remove(language);
	}

}
