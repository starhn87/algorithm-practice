import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 *
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 *
 * algorithms
 * Medium (42.81%)
 * Likes:    2608
 * Dislikes: 337
 * Total Accepted:    452.2K
 * Total Submissions: 1M
 * Testcase Example:  '"23"'
 *
 * Given a string containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below. Note that 1 does not map to any letters.
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * 
 * Note:
 * 
 * Although the above answer is in lexicographical order, your answer could be
 * in any order you want.
 * 
 */

// @lc code=start
class Solution {
    private String[] alphabets = {null, null, "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            int number = c - '0';
            if (answer.isEmpty()) {
                addInitinalValue(answer, number);
            } else {
                answer = combine(answer, number);
            }
        }

        return answer;
    }

    private void addInitinalValue(List<String> answer, int number) {
        String str = alphabets[number];
        for (char c : str.toCharArray()) {
            answer.add(String.valueOf(c));
        }
    }

    private List<String> combine(List<String> answer, int number) {
        String letter = alphabets[number];
        List<String> list = new ArrayList<>();
        for (String str : answer) {
            for (char c : letter.toCharArray()) {
                StringBuilder stringBuilder = new StringBuilder(str);
                stringBuilder.append(c);
                list.add(stringBuilder.toString());
            }
        }

        return list;
    }
}
// @lc code=end

