import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 *
 * https://leetcode.com/problems/group-anagrams/description/
 *
 * algorithms
 * Medium (48.97%)
 * Likes:    2063
 * Dislikes: 132
 * Total Accepted:    406.9K
 * Total Submissions: 818.9K
 * Testcase Example:  '["eat","tea","tan","ate","nat","bat"]'
 *
 * Given an array of strings, group anagrams together.
 * 
 * Example:
 * 
 * 
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ⁠ ["ate","eat","tea"],
 * ⁠ ["nat","tan"],
 * ⁠ ["bat"]
 * ]
 * 
 * Note:
 * 
 * 
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();
        for (String str : strs) {
            String[] arr = str.split("");
            Arrays.sort(arr);
            String sortedStr = String.join("", arr);
            if (!answer.containsKey(sortedStr)) {
                answer.put(sortedStr, new ArrayList<>());
            }
            answer.get(sortedStr).add(str);
        }

        return new ArrayList<List<String>>(answer.values());
    }
}
// @lc code=end

