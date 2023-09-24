class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int gcd = gcd(str1.length(), str2.length());
        if (gcd == 0) {
            return "";
        }
        char[] slice = new char[gcd];
        for (int i = 0; i < gcd; ++i) {
            slice[i] = str2.charAt(i);
        }
        for (int i = gcd, j = 0; i < str2.length(); ++i) {
            if (slice[j] != str2.charAt(i)) {
                return "";
            }
            if (j + 1 == gcd) {
                j = 0;
            } else {
                j += 1;
            }
        }
        for (int i = 0, j = 0; i < str1.length(); ++i) {
            if (slice[j] != str1.charAt(i)) {
                return "";
            }
            if (j + 1 == gcd) {
                j = 0;
            } else {
                j += 1;
            }
        }
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}