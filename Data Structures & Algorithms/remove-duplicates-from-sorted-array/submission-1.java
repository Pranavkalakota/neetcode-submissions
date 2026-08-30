class Solution {
    public int removeDuplicates(int[] nums) {
        // same direction two pointers - fast and slow
        int write = 0; // slow
        int read = 1; // fast, increment every iteration

        while (read < nums.length) {
            if (nums[write] != nums[read]) {
                write++; 
                nums[write] = nums[read]; // in the next position
                read++;
            } else {
               read++;
            }
        }
        return write + 1;
    }
}