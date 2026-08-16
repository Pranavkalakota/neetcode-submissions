class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        // replace everything except numbers and letters.
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
