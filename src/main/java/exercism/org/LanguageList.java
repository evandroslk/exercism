package exercism.org;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
	
	private List<String> list = new ArrayList<>();

	public void addLanguage(String string) {
		list.add(string);
	}

	public boolean containsLanguage(String string) {
		return list.contains(string);
	}

	public int count() {
		return list.size();
	}

	public boolean isExciting() {
		return list.contains("Java") || list.contains("Kotlin");
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public String firstLanguage() {
		return list.get(0);
	}

	public void removeLanguage(String string) {
		list.remove(string);
	}

}
