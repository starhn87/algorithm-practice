/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 *
 * https://leetcode.com/problems/subarray-sum-equals-k/description/
 *
 * algorithms
 * Medium (42.81%)
 * Likes:    2691
 * Dislikes: 71
 * Total Accepted:    156.7K
 * Total Submissions: 363.7K
 * Testcase Example:  '[1,1,1]\n2'
 *
 * Given an array of integers and an integer k, you need to find the total
 * number of continuous subarrays whose sum equals to k.
 * 
 * Example 1:
 * 
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * 
 * 
 * 
 * Note:
 * 
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the
 * integer k is [-1e7, 1e7].
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    private int answer = 0;

    public int subarraySum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            add(nums, i, k, nums[i]);
        }
        return answer;
    }

    private void add(int[] nums, int index, int k, int sum) {
        if (sum == k) {
            answer++;
        }
        if (index == nums.length - 1) {
            return;
        }
        add(nums, index + 1, k, sum + nums[index + 1]);
    }
}
// @lc code=end

