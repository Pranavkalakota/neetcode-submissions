class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /* Sort the array
        Loop through each element as the fixed number
        Skip duplicates for the fixed number
        Two pointer search for the remaining two numbers
        If valid triplet found → add to result, move pointers, skip duplicates for left and right
        If sum too big → move right inward
        If sum too small → move left inward */
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1; // always want the left pointer to be ahead of the fixed pointer 
            int right = nums.length - 1;
            // want to check if the previous fixed number == current fixed number
            // skipping duplicates for fixed number starting from first round
            if (i > 0 && nums[i] == nums[i-1]) {
                continue; // skip that iteration
            }
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++; // skipping all duplicates for the left
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--; // skipping all duplicates for the right
                    }
                } else if (currentSum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}