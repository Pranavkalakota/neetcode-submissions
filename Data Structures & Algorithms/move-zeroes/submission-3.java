class Solution {
    public void moveZeroes(int[] nums) {
        int firstPointer = 0;
        int secondPointer = 1;

        while (secondPointer < nums.length) {
            if (nums[secondPointer] != 0) {
                int temp = nums[firstPointer];
                nums[firstPointer] = nums[secondPointer];
                nums[secondPointer] = temp;
                firstPointer++;
            } 
            secondPointer++;
        }
    }
}