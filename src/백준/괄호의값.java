package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 백준 2504번 괄호의값
public class 괄호의값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        int answer = 0;
        int value = 1;
        boolean check = false;

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.add(str.charAt(i));
                value *= 2;
            }
            if (str.charAt(i) == '[') {
                stack.add(str.charAt(i));
                value *= 3;
            }
            if (str.charAt(i) == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    check = true;
                    break;
                }
                if (str.charAt(i - 1) == '(') {
                    answer += value;
                }
                stack.pop();
                value /= 2;
            } else if (str.charAt(i) == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    check = true;
                    break;
                }
                if (str.charAt(i - 1) == '[') {
                    answer += value;
                }
                stack.pop();
                value /= 3;
            }
        }
        if (check || !stack.empty()) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}
