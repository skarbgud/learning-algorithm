package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 백준 1918번 후위 표기식
class 후위표기식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);

            if (now == '+' || now == '-' || now == '*' || now == '/') {
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
                    sb.append(stack.pop());
                }
                stack.add(now);
            } else if (now == '(') {
                stack.add(now);
            } else if (now == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            } else {
                sb.append(now);
            }
        }

        while ((!stack.isEmpty())) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    private static int priority(char operation) {
        if (operation == '(' || operation == ')') {
            return 0;
        } else if (operation == '+' || operation == '-') {
            return 1;
        } else if (operation == '*' || operation == '/') {
            return 2;
        }
        return -1;
    }
}