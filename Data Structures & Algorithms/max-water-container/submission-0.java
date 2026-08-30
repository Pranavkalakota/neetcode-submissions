class Solution {
    public int maxArea(int[] heights) {
        // since we are trying to find the maximum area, we use two pointers from opposite directions. 
        // the indices of the values = the width = the distance between them
        // area can be found by width * height


        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = (right - left) * Math.min(heights[left], heights[right]);
            // min because area limited by shorter wall

            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            // check after because pointer movement occurs here, which affects area
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
