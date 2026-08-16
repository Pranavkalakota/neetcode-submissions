class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length; //4
        boolean found = false;
        for (int i = 0; i < length; i++) { //0123
            for (int j = i + 1; j < length; j++) { 
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[0];
    }
}
