package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 11659번 구간 합 구하기 4
class 구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine() + " ");
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        for (int t = 0; t < m; t++) {
            st = new StringTokenizer(br.readLine() + " ");
            while (st.hasMoreTokens()) {
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());
                System.out.println(arr[j] - arr[i-1]);
            }
        }
    }
}