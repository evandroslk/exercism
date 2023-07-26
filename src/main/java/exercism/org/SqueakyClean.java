package exercism.org;

public class SqueakyClean {

	private static final String GREEK_PATTERN = "\\p{InGreek}";
	private static final int HYPHEN_CODE = 45;

	public static String clean(String string) {
		StringBuilder sb = new StringBuilder();
		boolean skipNext = false;

		for (char c : string.toCharArray()) {

			if (skipNext) {
				skipNext = false;
				continue;
			}

			if (Character.isWhitespace(c)) {
				sb.append("_");
			}

			else if (Character.isISOControl(c)) {
				sb.append("CTRL");
			}

			else if (c == HYPHEN_CODE) {
				int index = string.indexOf(c);
				sb.append(Character.toUpperCase(string.charAt(index + 1)));
				skipNext = true;
			}

			else if (!(Character.isLowerCase(c) && String.valueOf(c).matches(GREEK_PATTERN)) && Character.isLetter(c)) {
				sb.append(c);
			}

		}

		return sb.toString();
	}

}
