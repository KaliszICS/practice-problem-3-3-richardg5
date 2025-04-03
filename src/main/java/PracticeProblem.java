import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	
	public static ArrayList<String> perms(String string) {
		ArrayList<String> perms = new ArrayList<>();
		permHelper(perms, "", string, false);
		return perms;
	}

	public static ArrayList<String> permsUnique(String string) {
		ArrayList<String> perms = new ArrayList<>();
		permHelper(perms, "", string, true);
		return perms;
	}

	public static void permHelper(ArrayList<String> list, String used, String unused, boolean unique) {
		if (unused.length() == 0) {
			if (unique) {
				if (!list.contains(used)) {
					list.add(used);
				}
			} else {
				list.add(used);
			}
		}

		for (int i = 0; i < unused.length(); i++) {
			String tempUnused = unused.substring(0, i) + unused.substring(i + 1);
			permHelper(list, used + unused.charAt(i), tempUnused, unique);
		}
	}
}
