class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            // we need to do this because we need to modify the hashmap. 
            // getOrDefault returns the frequency if it already occurred, else the value in the second parameter
            // want to do +1 because we want to increment the count
            if (map.get(num) > nums.length / 2) {
            // map.get(num) returns the frequency of the key
                return num;
            }
        }
        return -1;
    }
}