package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 백준 17298번 오큰수
class 오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        for (int i = 0; i < n; i++) {
            // 스택의 값을 계속 꺼내서 배열의 i 번째보다 클때까지 꺼낸다(배열의 값을 계속 앞으로[<==] 비교)
            // 배열에 꺼낸 인덱스의 값을 해당 인덱스의 값을 넣는다.
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }
            // 스택을 다시 집어넣어서 다시 루프가 돌때 비교할 수 있도록 한다.
            stack.push(i);
        }
        while(!stack.empty()) {
            arr[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(x).append(' ');
        }
        System.out.print(sb);
    }
}
