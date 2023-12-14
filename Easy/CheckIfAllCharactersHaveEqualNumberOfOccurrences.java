public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a'] += 1;
        }
        int prev = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                if (prev == 0) {
                    prev = count[i];
                } else if (prev != count[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
