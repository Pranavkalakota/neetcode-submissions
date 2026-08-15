class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("\\s+", "");
        // replaces the spaces with nothing in between
        int firstPointer = 0; // first letter index
        int secondPointer = s.length() - 1; // last letter index
        while (firstPointer < secondPointer) {
            if (s.charAt(firstPointer) != s.charAt(secondPointer)) {
                firstPointer++;
                secondPointer--;
            } else {
                return false;
            }
        }
        return true;
    }
}
