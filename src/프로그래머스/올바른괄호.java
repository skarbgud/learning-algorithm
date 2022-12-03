package 프로그래머스;

import java.util.Stack;

public class 올바른괄호 {

    public static void main(String[] args) {
        올바른괄호 s = new 올바른괄호();
        System.out.println(s.solution(")()("));
    }

    public boolean solution(String s) {
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

        return stack.isEmpty();
    }
}
