class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>(); 
        // HashSet REJECTS duplicates
        Arrays.sort(nums);

        List<Integer> temp;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];
                    if (currentSum == 0) {
                        temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
