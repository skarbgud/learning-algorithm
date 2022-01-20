package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 백준 9012번 괄호
class 괄호 {
    public static String solution (char[] arr) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : arr) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] arr = st.nextToken().toCharArray();
            sb.append(solution(arr)).append('\n');
        }
        System.out.println(sb);
    }
}