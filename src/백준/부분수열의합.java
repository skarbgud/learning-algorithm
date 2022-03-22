package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 1182번 부분수열의 합
class 부분수열의합 {
    static int n, s;
    static int[] arr;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr  = new int[n];
        String[] arrList = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrList[i]);
        }

        dfs(0, 0);
        if (s == 0) answer--;
        System.out.println(answer);
    }

    private static void dfs(int depth, int sum) {
        if (depth == n) {
            if (sum == s) {
                answer++;
            }
            return;
        }
        dfs(depth + 1, sum);
        dfs(depth + 1, sum + arr[depth]);
    }
}