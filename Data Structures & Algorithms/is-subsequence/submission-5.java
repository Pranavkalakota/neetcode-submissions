class Solution {
    public boolean isSubsequence(String s, String t) {
        /* 1) check every letter of s with every letter of t
           2) if s == t, then move onto the next letter in s. 
           3) if sPointer = s.length(), because it will be used as count after every match, then true, else false
        */
        int sPointer = 0;
        int tPointer = 0;
        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++; // if sPointer doesn't match, just move tPointer
        }
        if (sPointer == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}
