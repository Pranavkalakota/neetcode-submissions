class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstPointer = 0;
        int secondPointer = numbers.length - 1;
        int sum = 0;
        while (firstPointer < secondPointer) {
            sum = numbers[firstPointer] + numbers[secondPointer];
            if (sum > target) {
                secondPointer--; // move from right to left
            } else if (sum < target) {
                firstPointer++; // move from left to right
            } else {
                return new int[]{firstPointer++, secondPointer++};
            }
        }
        return new int[]{0};
    }
}
