package easy;

/**
 * 
 * Compare 2 versions. Return 1 if the first versoin1 is greater and -1 if the second version is greater.
 * 0 if both the versions are same.
 * Example: 1.01.0 and 1.1 are same
 * 1.0.0 and 1 are same
 * 1.1 > 1.0.1
 * Concept: take the length of bigger string. "Append" 0s to the end of the other string.
 * @author Adithya Balasubramanian
 *
 */
public class CompareVersions {
	public static int compareVersion(String version1, String version2) {
		String[] levels1 = version1.split("\\.");
		String[] levels2 = version2.split("\\.");

		int length = Math.max(levels1.length, levels2.length);
		for (int i = 0; i < length; i++) {
			Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
			Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
			int compare = v1.compareTo(v2);
			if (compare != 0) {
				return compare;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(compareVersion("1.01.0", "1.1"));
	}
}
