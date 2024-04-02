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

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int startIndex = 0;
        int endIndex = 0;
        int ans = Integer.MAX_VALUE;

        while (startIndex < n && endIndex < n) {
            if (arr[endIndex] - arr[startIndex] < m) {
                endIndex++;
            } else {
                int abs = Math.abs(arr[startIndex] - arr[endIndex]);
                if (abs < ans) {
                    ans = abs;
                }
                startIndex++;
            }
        }
        System.out.println(ans);
    }
}