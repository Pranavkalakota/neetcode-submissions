class Solution {
    public int removeDuplicates(int[] nums) {
        // same direction two pointers - fast and slow
        int write = 0; // slow
        int read = 1; // fast, increment every iteration
        int count = 1;

        while (read < nums.length) {
            if (nums[write] != nums[read]) {
                write++; 
                nums[write] = nums[read]; // in the next position
                read++;
                count++;
            } else {
               read++;
            }
        }
        return count;
    }
}