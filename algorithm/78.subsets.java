import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 *
 * https://leetcode.com/problems/subsets/description/
 *
 * algorithms
 * Medium (54.78%)
 * Likes:    2468
 * Dislikes: 60
 * Total Accepted:    433.2K
 * Total Submissions: 775.8K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a set of distinct integers, nums, return all possible subsets (the
 * power set).
 * 
 * Note: The solution set must not contain duplicate subsets.
 * 
 * Example:
 * 
 * 
 * Input: nums = [1,2,3]
 * Output:
 * [
 * ⁠ [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 * 
 */

// @lc code=start
class Solution {
    private List<List<Integer>> answer;

    public List<List<Integer>> subsets(int[] nums) {
        answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            answer.add(list);
            addSet(nums, list, i);
        }
        return answer;
    }

    private void addSet(int[] nums, List<Integer> list, int index) {
        for (int i = index + 1; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(list);
            temp.add(nums[i]);
            answer.add(temp);
            addSet(nums, temp, i);
        }
    }
}
// @lc code=end
