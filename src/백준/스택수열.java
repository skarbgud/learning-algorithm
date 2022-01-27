package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 백준 1874번 스택 수열
class 스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int start = 0;

        while (n-- > 0) {
            int limit = Integer.parseInt(br.readLine());

            if (limit > start) {
                for (int i = start + 1; i <= limit; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = limit;
            } else if (stack.peek() != limit) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}