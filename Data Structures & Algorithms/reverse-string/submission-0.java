class Solution {
    public void reverseString(char[] s) {
        int firstPointer = 0;
        int secondPointer = s.length - 1;

        while (firstPointer < secondPointer) {
            char temp = s[firstPointer];
            s[firstPointer] = s[secondPointer];
            s[secondPointer] = temp;
            firstPointer++;
            secondPointer--;
        }
    }
}