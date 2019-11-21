import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 *
 * https://leetcode.com/problems/permutations/description/
 *
 * algorithms
 * Medium (57.13%)
 * Likes:    2658
 * Dislikes: 86
 * Total Accepted:    466.9K
 * Total Submissions: 797.2K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a collection of distinct integers, return all possible permutations.
 * 
 * Example:
 * 
 * 
 * Input: [1,2,3]
 * Output:
 * [
 * ⁠ [1,2,3],
 * ⁠ [1,3,2],
 * ⁠ [2,1,3],
 * ⁠ [2,3,1],
 * ⁠ [3,1,2],
 * ⁠ [3,2,1]
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    static private List<List<Integer>> answer;

    public List<List<Integer>> permute(int[] nums) {
        answer = new ArrayList<>();
        permutation(nums, 0, nums.length);
        return answer;
    }

    static private void permutation(int[] arr, int depth, int n) {
        if(depth == n) {
            answer.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
            return;
        }
     
        for(int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n);
            swap(arr, depth, i);
        }
    }
     
    static private void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
    
}
// @lc code=end

