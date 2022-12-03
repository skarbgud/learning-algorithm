import java.util.Stack;

class Solution {
     public boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        answer = stack.isEmpty();

        return answer;
    }
}