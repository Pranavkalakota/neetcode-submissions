class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length; //4
        int[] output = new int[2];
        boolean found = false;
        for (int i = 0; i < length; i++) { //0123
            for (int j = i + 1; j < length; j++) { 
                if (numbers[i] + numbers[j] == target) {
                    output[0] = i + 1;
                    output[1] = j + 1;
                    found = true;
                    break;
                }
            }
            if (found == true) {
                break;
            }
        }
        return output;
    }
}
