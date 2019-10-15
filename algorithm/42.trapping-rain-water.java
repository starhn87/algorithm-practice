/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 *
 * https://leetcode.com/problems/trapping-rain-water/description/
 *
 * algorithms
 * Hard (44.48%)
 * Likes:    4614
 * Dislikes: 82
 * Total Accepted:    361.7K
 * Total Submissions: 801K
 * Testcase Example:  '[0,1,0,2,1,0,1,3,2,1,2,1]'
 *
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it is able to trap after raining.
 * 
 * 
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 * In this case, 6 units of rain water (blue section) are being trapped. Thanks
 * Marcos for contributing this image!
 * 
 * Example:
 * 
 * 
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * 
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        }

        return getWater(height);
    }

    private int getWater(int[] height) {
        int rightMax = 0, leftMax = 0;
        int right = height.length - 1, left = 0;
        int water = 0;

        while (right > left) {
            if (height[right] > height[left]) {
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }
}
// @lc code=end

