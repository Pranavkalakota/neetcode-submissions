class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int firstPointer = 0;
        int secondPointer = 0;
        Set<Integer> seen = new HashSet<>();
        while (firstPointer < nums1.length && secondPointer < nums2.length) {
            if (nums1[firstPointer] == nums2[secondPointer]) {
                seen.add(nums1[firstPointer]);
                firstPointer++;
                secondPointer++;
            } else if (nums1[firstPointer] < nums2[secondPointer]) {
                firstPointer++;
            } else {
                secondPointer++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>(seen);
        int[] finalResult = new int[seen.size()];
        for (int i = 0; i < seen.size(); i++) {
            finalResult[i] = result.get(i);
        }
        return finalResult;
    }
}