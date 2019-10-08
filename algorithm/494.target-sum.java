/*
 * @lc app=leetcode id=494 lang=java
 *
 * [494] Target Sum
 *
 * https://leetcode.com/problems/target-sum/description/
 *
 * algorithms
 * Medium (45.72%)
 * Likes:    1653
 * Dislikes: 79
 * Total Accepted:    114.1K
 * Total Submissions: 249K
 * Testcase Example:  '[1,1,1,1,1]\n3'
 *
 * 
 * You are given a list of non-negative integers, a1, a2, ..., an, and a
 * target, S. Now you have 2 symbols + and -. For each integer, you should
 * choose one from + and - as its new symbol.
 * ⁠
 * 
 * Find out how many ways to assign symbols to make sum of integers equal to
 * target S.  
 * 
 * 
 * Example 1:
 * 
 * Input: nums is [1, 1, 1, 1, 1], S is 3. 
 * Output: 5
 * Explanation: 
 * 
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * 
 * There are 5 ways to assign symbols to make the sum of nums be target 3.
 * 
 * 
 * 
 * Note:
 * 
 * The length of the given array is positive and will not exceed 20. 
 * The sum of elements in the given array will not exceed 1000.
 * Your output answer is guaranteed to be fitted in a 32-bit integer.
 * 
 * 
 */

// @lc code=start
class Solution {
    private int answer = 0;

    public int findTargetSumWays(int[] nums, int S) {
        DFS(nums, S, 0, 0);
        return answer;
    }

    private void DFS(int[] nums, int S, int value, int index) {
        if (index == nums.length) {
            if (value == S) {
                answer++;
            }
            return;
        }
        DFS(nums, S, value + nums[index], index + 1);
        DFS(nums, S, value - nums[index], index + 1);
    }
}
// @lc code=end

