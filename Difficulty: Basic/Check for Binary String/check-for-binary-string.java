class Solution {
    boolean isBinary(String s) {
        if (s == null) return false;          // handle null safely
        int len = s.length();
        if (len == 0) return false;           // optional: treat empty as non-binary
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') return false; // <<-- use AND
        }
        return true;
    }
}
