package show.leetcode;

import java.util.Stack;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/30 14:25
 * @Description:
 */
public class LeetCode032最长有效括号 {
    static class Solution {
        public int longestValidParentheses(String s) {
            int maxans = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.empty()) {
                        stack.push(i);
                    } else {
                        maxans = Math.max(maxans, i - stack.peek());
                    }
                }
            }
            return maxans;


        }
    }
}
