class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); ++i) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        } else if (word1.length() > word2.length()) {
            for (int i = 0; i < word1.length(); ++i) {
                sb.append(word1.charAt(i));
                if (i < word2.length()) {
                    sb.append(word2.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < word2.length(); ++i) {
                if (i < word1.length()) {
                    sb.append(word1.charAt(i));
                }
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}