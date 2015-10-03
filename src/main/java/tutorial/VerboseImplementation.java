package tutorial;

public class VerboseImplementation {

	public boolean hasUpperCase(String name) {

		boolean nameHasUpperCase = false;

		for (int i = 0; i < name.length(); i++) {
			if (Character.isUpperCase(name.charAt(i))) {
				nameHasUpperCase = true;
				break;
			}
		}
		return nameHasUpperCase;
	}
}
