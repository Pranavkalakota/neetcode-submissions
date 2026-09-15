class Solution {
    public int findLucky(int[] arr) {
        int largestLucky = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }
            if (frequency == arr[i]) {
                largestLucky = arr[i];
            } else {
                return -1;
            }
        }
        return largestLucky;
    }
}