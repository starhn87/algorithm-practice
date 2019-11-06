import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 *
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 *
 * algorithms
 * Easy (54.09%)
 * Likes:    1897
 * Dislikes: 177
 * Total Accepted:    181.3K
 * Total Submissions: 334.1K
 * Testcase Example:  '[4,3,2,7,8,2,3,1]'
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 * 
 * Example:
 * 
 * Input:
 * [4,3,2,7,8,2,3,1]
 * 
 * Output:
 * [5,6]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            if (num > 0) {
                if (nums[num - 1] > 0) {
                    nums[num - 1] = -nums[num - 1];
                }
            } else if (nums[-num - 1] > 0) {
                nums[-num - 1] = -nums[-num - 1];
            }
        }

        return getAnswer(nums);
    }

    private List<Integer> getAnswer(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                answer.add(i + 1);
            }
        }
        return answer;
    }
}
// @lc code=end
