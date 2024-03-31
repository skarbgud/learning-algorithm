import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int startIndex = 0;
        int endIndex = 0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            max += arr[i];
        }

        while (startIndex <= n && endIndex <= n) {
            if (endIndex - startIndex == m) {
                max = Math.max(max, sum);
                sum -= arr[startIndex++];
            } else {
                sum += arr[endIndex++];
            }
        }
        System.out.println(max);
    }
}