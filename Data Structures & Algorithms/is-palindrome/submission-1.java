class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("\\s+", "");
        // replaces the spaces with nothing in between
        String lower = result.toLowerCase();
        int firstPointer = 0; // first letter index
        int secondPointer = result.length() - 1; // last letter index
        while (firstPointer < secondPointer) {
            if (lower.charAt(firstPointer) == lower.charAt(secondPointer)) {
                firstPointer++;
                secondPointer--;
            } else {
                return false;
            }
        }
        return true;
    }
}
