class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) { 
        Arrays.sort(nums);

        ArrayList<Integer> missingNumbers = new ArrayList<>();
        int[] finalList = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            finalList[nums[i]-1] = nums[i];
        }
        for (int j = 0; j < finalList.length; j++) {
            if (finalList[j] == 0) {
                missingNumbers.add(j+1);
            }
        }
        return missingNumbers;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(nums);
        for (int num : result) {
            System.out.println(num);
        }
    }
}