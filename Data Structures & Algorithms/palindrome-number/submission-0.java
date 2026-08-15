class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if (x < 0) {
            return false;
        }
        int firstPointer = 0;
        int lastPointer = s.length() - 1;
        while (firstPointer < lastPointer) {
            if (s.charAt(firstPointer) != s.charAt(lastPointer)) {
                return false;
            }
            firstPointer++;
            lastPointer--;
        }
        return true;
    }   
}
