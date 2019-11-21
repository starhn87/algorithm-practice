/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 *
 * https://leetcode.com/problems/sort-colors/description/
 *
 * algorithms
 * Medium (43.11%)
 * Likes:    2166
 * Dislikes: 182
 * Total Accepted:    378.7K
 * Total Submissions: 864.4K
 * Testcase Example:  '[2,0,2,1,1,0]'
 *
 * Given an array with n objects colored red, white or blue, sort them in-place
 * so that objects of the same color are adjacent, with the colors in the order
 * red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red,
 * white, and blue respectively.
 * 
 * Note: You are not suppose to use the library's sort function for this
 * problem.
 * 
 * Example:
 * 
 * 
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * 
 * Follow up:
 * 
 * 
 * A rather straight forward solution is a two-pass algorithm using counting
 * sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then
 * overwrite array with total number of 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 * 
 * 
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else if (num == 2) {
                two++;
            }
        }

        addZero(nums, zero);
        addOne(nums, zero, one);
        addTwo(nums, zero, one, two);
    }

    private void addZero(int[] nums, int zero) {
        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
    }

    private void addOne(int[] nums, int zero, int one) {
        for (int i = 0; i < one; i++) {
            nums[i + zero] = 1;
        }
    }

    private void addTwo(int[] nums, int zero, int one, int two) {
        for (int i = 0; i < two; i++) {
            nums[i + zero + one] = 2;
        }
    }
}
// @lc code=end
