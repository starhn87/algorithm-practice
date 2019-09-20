/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 *
 * https://leetcode.com/problems/jump-game/description/
 *
 * algorithms
 * Medium (32.51%)
 * Likes:    2396
 * Dislikes: 228
 * Total Accepted:    305.8K
 * Total Submissions: 938.5K
 * Testcase Example:  '[2,3,1,1,4]'
 *
 * Given an array of non-negative integers, you are initially positioned at the
 * first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that
 * position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * Example 1:
 * 
 * 
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last
 * index.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its
 * maximum
 * jump length is 0, which makes it impossible to reach the last index.
 * 
 * 
 */
class Solution {
    public boolean canJump(int[] nums) {
        int station = nums.length - 1;
        for (int i = station - 1; i >= 0; i--) {
            // station은 마지막 인덱스에서 거꾸로 점프할 수 있는 최소 인덱스
            if (nums[i] >= station - i) {
                station = i;
            }
        }
        return station == 0 ? true : false;
    }
}
