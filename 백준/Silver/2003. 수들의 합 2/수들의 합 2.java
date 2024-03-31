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
        int answer = 0;
        int sum = 0;
        
        while (startIndex <= n && endIndex <= n) {
            if (sum < m) {
                sum += arr[endIndex++];
            } else if (sum > m) {
                sum -= arr[startIndex++];
            }
            if (sum == m) {
                answer++;
                sum += arr[endIndex++];
            }
        }
        System.out.println(answer);
    }
}