class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());
        int i = 0;
        if (word1.length() >= word2.length()) {
            for (; i < word2.length(); ++i) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for (; i < word1.length(); ++i) {
                sb.append(word1.charAt(i));
            }
        } else {
            for (; i < word1.length(); ++i) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for (; i < word2.length(); ++i) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}