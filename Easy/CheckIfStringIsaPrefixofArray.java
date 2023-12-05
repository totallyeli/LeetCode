public class CheckIfStringIsaPrefixofArray {
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < words.length) {
            if (s.charAt(i) != words[j].charAt(0)) {
                return false;
            }
            int k = 0;
            while (i < s.length() && k < words[j].length()) {
                if (s.charAt(i) != words[j].charAt(k)) {
                    return false;
                }
                i++;
                k++;
            }
            j++;
        }
        return i == s.length();
    }
}
