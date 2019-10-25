import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 *
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 *
 * algorithms
 * Medium (38.22%)
 * Likes:    1892
 * Dislikes: 146
 * Total Accepted:    152.5K
 * Total Submissions: 392.8K
 * Testcase Example:  '"cbaebabacd"\n"abc"'
 *
 * Given a string s and a non-empty string p, find all the start indices of p's
 * anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * Example 1:
 * 
 * Input:
 * s: "cbaebabacd" p: "abc"
 * 
 * Output:
 * [0, 6]
 * 
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of
 * "abc".
 * 
 * 
 * 
 * Example 2:
 * 
 * Input:
 * s: "abab" p: "ab"
 * 
 * Output:
 * [0, 1, 2]
 * 
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 * 
 * 
 */

// @lc code=start
class Solution {
    private static final int ALPAPHET_LENGTH = 26;
    private static int[] count = new int[ALPAPHET_LENGTH];

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList<>();
        int len = p.length();

        for (int i = 0; i <= s.length() - len; i++) {
            if (isSame(p, s.substring(i, i + len))) {
                answer.add(i);
            }
        }
        return answer;
    }

    private boolean isSame(String standard, String target) {
        boolean answer = true;

        for (int i = 0; i < target.length(); i++) {
            count[target.charAt(i) - 'a']++;
            count[standard.charAt(i) - 'a']--;
        }
        for (int num : count) {
            if (num != 0) {
                answer = false;
                Arrays.fill(count, 0);
                break;
            }
        }

        return answer;
    }
}
// @lc code=end
