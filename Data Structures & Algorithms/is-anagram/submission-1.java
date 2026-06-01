
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] s_chars = s.toCharArray();
            char[] t_chars = t.toCharArray();
            Arrays.sort(s_chars);
            Arrays.sort(t_chars);
            boolean isEqual = Arrays.equals(s_chars, t_chars);
            return isEqual;
        } else {
            return false;
        }

    }
}   
