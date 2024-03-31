import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int startIndex = 0;
        int endIndex = 0;
        int answer = Integer.MAX_VALUE;
        // end가 s보다 커질때까지 end++
        // start가 s보다 작아질때까지 start++
        int sum = 0;
        while (startIndex <= n && endIndex <= n) {
            if (sum >= s && (endIndex - startIndex) < answer) {
                answer = endIndex - startIndex;
            }
            if (sum < s) {
                sum += arr[endIndex++];
            } else {
                sum -= arr[startIndex++];
            }
        }

        System.out.println(answer == Integer.MAX_VALUE? "0" : answer);
    }
}